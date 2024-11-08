# openapi-java-client

SupportService
- API version: 2.0.1.4089
  - Build date: 2024-11-05T15:38:00.025935400-05:00[America/Bogota]
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
import org.openapitools.client.api.SupportEntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    SupportEntitlementsApi apiInstance = new SupportEntitlementsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2SupportServiceSupportEntitlementsCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsCountGet");
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
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsCountGet**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsCountGet) | **GET** /api/v2/SupportService/SupportEntitlements/Count | 
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsGet**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsGet) | **GET** /api/v2/SupportService/SupportEntitlements | 
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsPost**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsPost) | **POST** /api/v2/SupportService/SupportEntitlements | 
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete) | **DELETE** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | 
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet) | **GET** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | 
*SupportEntitlementsApi* | [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut**](docs/SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut) | **PUT** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsCountGet**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsCountGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/Count | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsGet**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsGet) | **GET** /api/v2/SupportService/SupportRequestAttachments | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsPost**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsPost) | **POST** /api/v2/SupportService/SupportRequestAttachments | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete) | **DELETE** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | 
*SupportRequestAttachmentsApi* | [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut**](docs/SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut) | **PUT** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsCountGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsCountGet) | **GET** /api/v2/SupportService/SupportRequests/Count | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsGet) | **GET** /api/v2/SupportService/SupportRequests | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsPost**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsPost) | **POST** /api/v2/SupportService/SupportRequests | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/{attachmentId} | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/Count | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost) | **POST** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdDelete**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdDelete) | **DELETE** /api/v2/SupportService/SupportRequests/{supportRequestId} | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId} | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdPut**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdPut) | **PUT** /api/v2/SupportService/SupportRequests/{supportRequestId} | 
*SupportRequestsApi* | [**apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet**](docs/SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Tickets | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesCountGet**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesCountGet) | **GET** /api/v2/SupportService/SupportTicketPriorities/Count | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesGet**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesGet) | **GET** /api/v2/SupportService/SupportTicketPriorities | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesPost**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesPost) | **POST** /api/v2/SupportService/SupportTicketPriorities | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete) | **DELETE** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet) | **GET** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | 
*SupportTicketPrioritiesApi* | [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut**](docs/SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut) | **PUT** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesCountGet**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesCountGet) | **GET** /api/v2/SupportService/SupportTicketTypes/Count | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesGet**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesGet) | **GET** /api/v2/SupportService/SupportTicketTypes | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesPost**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesPost) | **POST** /api/v2/SupportService/SupportTicketTypes | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete) | **DELETE** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet) | **GET** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | 
*SupportTicketTypesApi* | [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut**](docs/SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut) | **PUT** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsCountGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsCountGet) | **GET** /api/v2/SupportService/SupportTickets/Count | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsGet) | **GET** /api/v2/SupportService/SupportTickets | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsPost**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsPost) | **POST** /api/v2/SupportService/SupportTickets | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost) | **POST** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId}/Messages | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdDelete**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdDelete) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId} | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdGet**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId} | 
*SupportTicketsApi* | [**apiV2SupportServiceSupportTicketsSupportTicketIdPut**](docs/SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdPut) | **PUT** /api/v2/SupportService/SupportTickets/{supportTicketId} | 


## Documentation for Models

 - [EmptyEnvelope](docs/EmptyEnvelope.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [Int32Envelope](docs/Int32Envelope.md)
 - [PrivateMessageDto](docs/PrivateMessageDto.md)
 - [PrivateMessageDtoListEnvelope](docs/PrivateMessageDtoListEnvelope.md)
 - [SupportEntitlementCreateDto](docs/SupportEntitlementCreateDto.md)
 - [SupportEntitlementDto](docs/SupportEntitlementDto.md)
 - [SupportEntitlementDtoEnvelope](docs/SupportEntitlementDtoEnvelope.md)
 - [SupportEntitlementDtoListEnvelope](docs/SupportEntitlementDtoListEnvelope.md)
 - [SupportEntitlementUpdateDto](docs/SupportEntitlementUpdateDto.md)
 - [SupportRequestAttachmentCreateDto](docs/SupportRequestAttachmentCreateDto.md)
 - [SupportRequestAttachmentDto](docs/SupportRequestAttachmentDto.md)
 - [SupportRequestAttachmentDtoEnvelope](docs/SupportRequestAttachmentDtoEnvelope.md)
 - [SupportRequestAttachmentDtoListEnvelope](docs/SupportRequestAttachmentDtoListEnvelope.md)
 - [SupportRequestAttachmentUpdateDto](docs/SupportRequestAttachmentUpdateDto.md)
 - [SupportRequestCreateDto](docs/SupportRequestCreateDto.md)
 - [SupportRequestDto](docs/SupportRequestDto.md)
 - [SupportRequestDtoEnvelope](docs/SupportRequestDtoEnvelope.md)
 - [SupportRequestDtoListEnvelope](docs/SupportRequestDtoListEnvelope.md)
 - [SupportRequestUpdateDto](docs/SupportRequestUpdateDto.md)
 - [SupportTicketConversationCreateDto](docs/SupportTicketConversationCreateDto.md)
 - [SupportTicketConversationDto](docs/SupportTicketConversationDto.md)
 - [SupportTicketConversationDtoEnvelope](docs/SupportTicketConversationDtoEnvelope.md)
 - [SupportTicketConversationDtoListEnvelope](docs/SupportTicketConversationDtoListEnvelope.md)
 - [SupportTicketCreateDto](docs/SupportTicketCreateDto.md)
 - [SupportTicketDto](docs/SupportTicketDto.md)
 - [SupportTicketDtoEnvelope](docs/SupportTicketDtoEnvelope.md)
 - [SupportTicketDtoListEnvelope](docs/SupportTicketDtoListEnvelope.md)
 - [SupportTicketPriorityCreateDto](docs/SupportTicketPriorityCreateDto.md)
 - [SupportTicketPriorityDto](docs/SupportTicketPriorityDto.md)
 - [SupportTicketPriorityDtoEnvelope](docs/SupportTicketPriorityDtoEnvelope.md)
 - [SupportTicketPriorityDtoListEnvelope](docs/SupportTicketPriorityDtoListEnvelope.md)
 - [SupportTicketPriorityUpdateDto](docs/SupportTicketPriorityUpdateDto.md)
 - [SupportTicketTypeCreateDto](docs/SupportTicketTypeCreateDto.md)
 - [SupportTicketTypeDto](docs/SupportTicketTypeDto.md)
 - [SupportTicketTypeDtoEnvelope](docs/SupportTicketTypeDtoEnvelope.md)
 - [SupportTicketTypeDtoListEnvelope](docs/SupportTicketTypeDtoListEnvelope.md)
 - [SupportTicketTypeUpdateDto](docs/SupportTicketTypeUpdateDto.md)
 - [SupportTicketUpdateDto](docs/SupportTicketUpdateDto.md)


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

