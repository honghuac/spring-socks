package lol.maki.socks.user;

import com.fasterxml.jackson.databind.JsonNode;
import lol.maki.socks.config.LoggingExchangeFilterFunction;
import lol.maki.socks.config.SockProps;
import lol.maki.socks.user.client.CustomerAddressCreateRequest;
import lol.maki.socks.user.client.CustomerCardCreateRequest;
import lol.maki.socks.user.client.CustomerCreateRequest;
import lol.maki.socks.user.client.CustomerResponse;
import reactor.core.publisher.Mono;

import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId;

@Component
public class UserClient {
	private final WebClient webClient;

	private final SockProps props;

	public UserClient(WebClient.Builder builder, ReactiveOAuth2AuthorizedClientManager authorizedClientManager, SockProps props) {
		this.webClient = builder
				.filter(new ServerOAuth2AuthorizedClientExchangeFilterFunction(authorizedClientManager))
				.filter(LoggingExchangeFilterFunction.SINGLETON)
				.build();
		this.props = props;
	}

	public Mono<String> retrieveToken(String username, String password, String clientId, String clientSecret) {
		return this.webClient.post()
				.uri(props.getUserUrl(), b -> b.path("oauth/token").build())
				.headers(httpHeaders -> httpHeaders.setBasicAuth(clientId, clientSecret))
				.bodyValue(new LinkedMultiValueMap<>() {
					{
						add("grant_type", "password");
						add("username", username);
						add("password", password);
					}
				})
				.retrieve()
				.bodyToMono(JsonNode.class)
				.map(n -> n.get("access_token").asText());
	}

	public Mono<CustomerResponse> getMe() {
		return this.webClient.get()
				.uri(props.getUserUrl(), b -> b.path("me").build())
				.attributes(clientRegistrationId("ui"))
				.retrieve()
				.bodyToMono(CustomerResponse.class);
	}

	public Mono<?> createUser(CustomerCreateRequest request) {
		return this.webClient.post()
				.uri(props.getUserUrl(), b -> b.path("customers").build())
				.bodyValue(request)
				.attributes(clientRegistrationId("sock"))
				.retrieve()
				.toBodilessEntity();
	}

	public Mono<String> createAddress(CustomerAddressCreateRequest request, String accessToken) {
		return this.webClient.post()
				.uri(props.getUserUrl(), b -> b.path("addresses").build())
				.headers(httpHeaders -> httpHeaders.setBearerAuth(accessToken))
				.bodyValue(request)
				.retrieve()
				.bodyToMono(JsonNode.class)
				.map(n -> n.get("addressId").asText());
	}

	public Mono<String> createCard(CustomerCardCreateRequest request, String accessToken) {
		return this.webClient.post()
				.uri(props.getUserUrl(), b -> b.path("cards").build())
				.headers(httpHeaders -> httpHeaders.setBearerAuth(accessToken))
				.bodyValue(request)
				.retrieve()
				.bodyToMono(JsonNode.class)
				.map(n -> n.get("cardId").asText());
	}
}
