# Spring Socks

![Spring Socks](shop-ui/src/main/resources/static/img/logo.png)

 [![integration-tests](https://github.com/making/spring-socks/workflows/integration-tests/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Aintegration-tests)

Spring Version of https://microservices-demo.github.io

Live Demo: https://spring-socks.apps.pcfone.io 

<img src="https://user-images.githubusercontent.com/106908/95973135-3ab35000-0e4e-11eb-9267-00ab2bee3c5f.png" width="800px">

## API Docs

| API | OpenAPI Spec | Code |　Docker Image |
| --- | --- | --- | --- |
| Catalog API | [catalog-spec](./catalog-spec) [![catalog-spec](https://github.com/making/spring-socks/workflows/catalog-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Acatalog-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/catalog-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/catalog-spec/openapi/doc.yml)] | [catalog-api](./catalog-api) [![catalog-api](https://github.com/making/spring-socks/workflows/catalog-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Acatalog-api) | [`ghcr.io/making/spring-socks-catalog`](https://github.com/users/making/packages/container/package/spring-socks-catalog) |
| Cart API | [cart-spec](./cart-spec) [![cart-spec](https://github.com/making/spring-socks/workflows/cart-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Acart-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/cart-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/cart-spec/openapi/doc.yml)] | [cart-api](./cart-api) [![cart-api](https://github.com/making/spring-socks/workflows/cart-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Acart-api) | [`ghcr.io/making/spring-socks-cart`](https://github.com/users/making/packages/container/package/spring-socks-cart) |
| Order API | [order-spec](./order-spec) [![order-spec](https://github.com/making/spring-socks/workflows/order-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Aorder-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/order-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/order-spec/openapi/doc.yml)] | [order-api](./order-api) [![order-api](https://github.com/making/spring-socks/workflows/order-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Aorder-api) | [`ghcr.io/making/spring-socks-order`](https://github.com/users/making/packages/container/package/spring-socks-order) |
| Payment API | [payment-spec](./payment-spec) [![payment-spec](https://github.com/making/spring-socks/workflows/payment-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Apayment-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/payment-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/payment-spec/openapi/doc.yml)] | [payment-api](./payment-api) [![payment-api](https://github.com/making/spring-socks/workflows/payment-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Apayment-api) | [`ghcr.io/making/spring-socks-payment`](https://github.com/users/making/packages/container/package/spring-socks-payment) |
| Shipping API | [shipping-spec](./shipping-spec) [![shipping-spec](https://github.com/making/spring-socks/workflows/shipping-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Ashipping-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/shipping-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/shipping-spec/openapi/doc.yml)] | [shipping-api](./shipping-api) [![shipping-api](https://github.com/making/spring-socks/workflows/shipping-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Ashipping-api) | [`ghcr.io/making/spring-socks-shipping`](https://github.com/users/making/packages/container/package/spring-socks-shipping) |
| User API | [user-spec](./user-spec) [![user-spec](https://github.com/making/spring-socks/workflows/user-spec/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Auser-spec) <br> [[ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/making/spring-socks/master/user-spec/openapi/doc.yml)] [[Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/making/spring-socks/master/user-spec/openapi/doc.yml)] | [user-api](./user-api) [![user-api](https://github.com/making/spring-socks/workflows/user-api/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Auser-api) | [`ghcr.io/making/spring-socks-user`](https://github.com/users/making/packages/container/package/spring-socks-user) |
| Shop UI | - | [shop-ui](./shop-ui) [![shop-ui](https://github.com/making/spring-socks/workflows/shop-ui/badge.svg)](https://github.com/making/spring-socks/actions?query=workflow%3Ashop-ui) | [`ghcr.io/making/spring-socks-ui`](https://github.com/users/making/packages/container/package/spring-socks-ui) |