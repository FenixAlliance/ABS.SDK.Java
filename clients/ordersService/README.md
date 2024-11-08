# openapi-java-client

OrdersService
- API version: 2.0.1.4089
  - Build date: 2024-11-05T15:36:53.571291600-05:00[America/Bogota]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [https://fenixalliance.com.co/Support](https://fenixalliance.com.co/Support)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0.1.4089</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2.0.1.4089"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.1.4089.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      Int32Envelope result = apiInstance.apiV2OrdersServiceOrdersCountGet(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#apiV2OrdersServiceOrdersCountGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrdersApi* | [**apiV2OrdersServiceOrdersCountGet**](docs/OrdersApi.md#apiV2OrdersServiceOrdersCountGet) | **GET** /api/v2/OrdersService/Orders/Count | 
*OrdersApi* | [**apiV2OrdersServiceOrdersExtendedGet**](docs/OrdersApi.md#apiV2OrdersServiceOrdersExtendedGet) | **GET** /api/v2/OrdersService/Orders/Extended | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdCalculatePut**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Calculate | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdDelete**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId} | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesCountGet**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesCountGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/Count | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesGet**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId}/Calculate | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdLinesPost**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesPost) | **POST** /api/v2/OrdersService/Orders/{orderId}/Lines | 
*OrdersApi* | [**apiV2OrdersServiceOrdersOrderIdPut**](docs/OrdersApi.md#apiV2OrdersServiceOrdersOrderIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId} | 
*OrdersApi* | [**apiV2OrdersServiceOrdersPost**](docs/OrdersApi.md#apiV2OrdersServiceOrdersPost) | **POST** /api/v2/OrdersService/Orders | 
*OrdersApi* | [**apiV2OrdersServiceOrdersSubmitCartPost**](docs/OrdersApi.md#apiV2OrdersServiceOrdersSubmitCartPost) | **POST** /api/v2/OrdersService/Orders/SubmitCart | 
*OrdersApi* | [**getOrderAsync**](docs/OrdersApi.md#getOrderAsync) | **GET** /api/v2/OrdersService/Orders/{orderId} | 
*OrdersApi* | [**getOrdersAsync**](docs/OrdersApi.md#getOrdersAsync) | **GET** /api/v2/OrdersService/Orders | 


## Documentation for Models

 - [ContactDto](docs/ContactDto.md)
 - [Currency](docs/Currency.md)
 - [EmptyEnvelope](docs/EmptyEnvelope.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [ExtendedOrderDto](docs/ExtendedOrderDto.md)
 - [ExtendedOrderDtoListEnvelope](docs/ExtendedOrderDtoListEnvelope.md)
 - [Int32Envelope](docs/Int32Envelope.md)
 - [Money](docs/Money.md)
 - [OrderCreateDto](docs/OrderCreateDto.md)
 - [OrderDto](docs/OrderDto.md)
 - [OrderDtoEnvelope](docs/OrderDtoEnvelope.md)
 - [OrderDtoListEnvelope](docs/OrderDtoListEnvelope.md)
 - [OrderLineCreateDto](docs/OrderLineCreateDto.md)
 - [OrderLineDto](docs/OrderLineDto.md)
 - [OrderLineDtoEnvelope](docs/OrderLineDtoEnvelope.md)
 - [OrderLineDtoListEnvelope](docs/OrderLineDtoListEnvelope.md)
 - [OrderLineUpdateDto](docs/OrderLineUpdateDto.md)
 - [OrderUpdateDto](docs/OrderUpdateDto.md)
 - [TenantDto](docs/TenantDto.md)
 - [TenantEnrolmentDto](docs/TenantEnrolmentDto.md)
 - [UserDto](docs/UserDto.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@fenix-alliance.com

