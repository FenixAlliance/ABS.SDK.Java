# openapi-java-client

MarketingService
- API version: 2.0.1.4089
  - Build date: 2024-11-05T15:36:45.577528700-05:00[America/Bogota]
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
import org.openapitools.client.api.EmailGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    EmailGroupsApi apiInstance = new EmailGroupsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.apiV2MarketingServiceEmailGroupsCountGet(tenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsCountGet");
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
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsCountGet**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsCountGet) | **GET** /api/v2/MarketingService/EmailGroups/Count | 
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsEmailgroupIdDelete**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdDelete) | **DELETE** /api/v2/MarketingService/EmailGroups/{emailgroupId} | 
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsEmailgroupIdGet**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdGet) | **GET** /api/v2/MarketingService/EmailGroups/{emailgroupId} | 
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsEmailgroupIdPut**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdPut) | **PUT** /api/v2/MarketingService/EmailGroups/{emailgroupId} | 
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsGet**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsGet) | **GET** /api/v2/MarketingService/EmailGroups | 
*EmailGroupsApi* | [**apiV2MarketingServiceEmailGroupsPost**](docs/EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsPost) | **POST** /api/v2/MarketingService/EmailGroups | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesCountGet**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesCountGet) | **GET** /api/v2/MarketingService/EmailSignatures/Count | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete) | **DELETE** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet) | **GET** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut) | **PUT** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesGet**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesGet) | **GET** /api/v2/MarketingService/EmailSignatures | 
*EmailSignaturesApi* | [**apiV2MarketingServiceEmailSignaturesPost**](docs/EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesPost) | **POST** /api/v2/MarketingService/EmailSignatures | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesCountGet**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesCountGet) | **GET** /api/v2/MarketingService/EmailTemplates/Count | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete) | **DELETE** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet) | **GET** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut) | **PUT** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesGet**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesGet) | **GET** /api/v2/MarketingService/EmailTemplates | 
*EmailTemplatesApi* | [**apiV2MarketingServiceEmailTemplatesPost**](docs/EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesPost) | **POST** /api/v2/MarketingService/EmailTemplates | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsCountGet**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsCountGet) | **GET** /api/v2/MarketingService/MarketingCampaigns/Count | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsGet**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsGet) | **GET** /api/v2/MarketingService/MarketingCampaigns | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete) | **DELETE** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet) | **GET** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut) | **PUT** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | 
*MarketingCampaignsApi* | [**apiV2MarketingServiceMarketingCampaignsPost**](docs/MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsPost) | **POST** /api/v2/MarketingService/MarketingCampaigns | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsCountGet**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsCountGet) | **GET** /api/v2/MarketingService/MarketingLists/Count | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsGet**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsGet) | **GET** /api/v2/MarketingService/MarketingLists | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsMarketinglistIdDelete**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdDelete) | **DELETE** /api/v2/MarketingService/MarketingLists/{marketinglistId} | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsMarketinglistIdGet**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdGet) | **GET** /api/v2/MarketingService/MarketingLists/{marketinglistId} | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsMarketinglistIdPut**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdPut) | **PUT** /api/v2/MarketingService/MarketingLists/{marketinglistId} | 
*MarketingListsApi* | [**apiV2MarketingServiceMarketingListsPost**](docs/MarketingListsApi.md#apiV2MarketingServiceMarketingListsPost) | **POST** /api/v2/MarketingService/MarketingLists | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersCountGet**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersCountGet) | **GET** /api/v2/MarketingService/Newsletters/Count | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersGet**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersGet) | **GET** /api/v2/MarketingService/Newsletters | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersNewsletterIdDelete**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdDelete) | **DELETE** /api/v2/MarketingService/Newsletters/{newsletterId} | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersNewsletterIdGet**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdGet) | **GET** /api/v2/MarketingService/Newsletters/{newsletterId} | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersNewsletterIdPut**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdPut) | **PUT** /api/v2/MarketingService/Newsletters/{newsletterId} | 
*NewslettersApi* | [**apiV2MarketingServiceNewslettersPost**](docs/NewslettersApi.md#apiV2MarketingServiceNewslettersPost) | **POST** /api/v2/MarketingService/Newsletters | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsCountGet**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsCountGet) | **GET** /api/v2/MarketingService/SocialMediaPosts/Count | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsGet**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsGet) | **GET** /api/v2/MarketingService/SocialMediaPosts | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsPost**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsPost) | **POST** /api/v2/MarketingService/SocialMediaPosts | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete) | **DELETE** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet) | **GET** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | 
*SocialMediaPostsApi* | [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut**](docs/SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut) | **PUT** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsCountGet**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsCountGet) | **GET** /api/v2/MarketingService/SocialPostBuckets/Count | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsGet**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsGet) | **GET** /api/v2/MarketingService/SocialPostBuckets | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsPost**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsPost) | **POST** /api/v2/MarketingService/SocialPostBuckets | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete) | **DELETE** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet) | **GET** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | 
*SocialPostBucketsApi* | [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut**](docs/SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut) | **PUT** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | 
*TrackingPixelsApi* | [**apiV2MarketingServiceTrackingPixelsPixelIdGet**](docs/TrackingPixelsApi.md#apiV2MarketingServiceTrackingPixelsPixelIdGet) | **GET** /api/v2/MarketingService/TrackingPixels/{pixelId} | 


## Documentation for Models

 - [Currency](docs/Currency.md)
 - [EmailGroupCreateDto](docs/EmailGroupCreateDto.md)
 - [EmailGroupDto](docs/EmailGroupDto.md)
 - [EmailGroupDtoEnvelope](docs/EmailGroupDtoEnvelope.md)
 - [EmailGroupDtoListEnvelope](docs/EmailGroupDtoListEnvelope.md)
 - [EmailGroupUpdateDto](docs/EmailGroupUpdateDto.md)
 - [EmailSignatureCreateDto](docs/EmailSignatureCreateDto.md)
 - [EmailSignatureDto](docs/EmailSignatureDto.md)
 - [EmailSignatureDtoEnvelope](docs/EmailSignatureDtoEnvelope.md)
 - [EmailSignatureDtoListEnvelope](docs/EmailSignatureDtoListEnvelope.md)
 - [EmailSignatureUpdateDto](docs/EmailSignatureUpdateDto.md)
 - [EmailTemplateCreateDto](docs/EmailTemplateCreateDto.md)
 - [EmailTemplateDto](docs/EmailTemplateDto.md)
 - [EmailTemplateDtoEnvelope](docs/EmailTemplateDtoEnvelope.md)
 - [EmailTemplateDtoListEnvelope](docs/EmailTemplateDtoListEnvelope.md)
 - [EmailTemplateUpdateDto](docs/EmailTemplateUpdateDto.md)
 - [EmptyEnvelope](docs/EmptyEnvelope.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [Int32Envelope](docs/Int32Envelope.md)
 - [MarketingCampaignCreateDto](docs/MarketingCampaignCreateDto.md)
 - [MarketingCampaignDto](docs/MarketingCampaignDto.md)
 - [MarketingCampaignDtoEnvelope](docs/MarketingCampaignDtoEnvelope.md)
 - [MarketingCampaignUpdateDto](docs/MarketingCampaignUpdateDto.md)
 - [MarketingListCreateDto](docs/MarketingListCreateDto.md)
 - [MarketingListDto](docs/MarketingListDto.md)
 - [MarketingListDtoEnvelope](docs/MarketingListDtoEnvelope.md)
 - [MarketingListDtoListEnvelope](docs/MarketingListDtoListEnvelope.md)
 - [MarketingListUpdateDto](docs/MarketingListUpdateDto.md)
 - [Money](docs/Money.md)
 - [NewsletterCreateDto](docs/NewsletterCreateDto.md)
 - [NewsletterDto](docs/NewsletterDto.md)
 - [NewsletterDtoEnvelope](docs/NewsletterDtoEnvelope.md)
 - [NewsletterUpdateDto](docs/NewsletterUpdateDto.md)
 - [OrderDto](docs/OrderDto.md)
 - [OrderDtoEnvelope](docs/OrderDtoEnvelope.md)
 - [SocialMediaPostCreateDto](docs/SocialMediaPostCreateDto.md)
 - [SocialMediaPostDto](docs/SocialMediaPostDto.md)
 - [SocialMediaPostDtoEnvelope](docs/SocialMediaPostDtoEnvelope.md)
 - [SocialMediaPostDtoListEnvelope](docs/SocialMediaPostDtoListEnvelope.md)
 - [SocialMediaPostUpdateDto](docs/SocialMediaPostUpdateDto.md)
 - [SocialPostBucketCreateDto](docs/SocialPostBucketCreateDto.md)
 - [SocialPostBucketDto](docs/SocialPostBucketDto.md)
 - [SocialPostBucketDtoEnvelope](docs/SocialPostBucketDtoEnvelope.md)
 - [SocialPostBucketDtoListEnvelope](docs/SocialPostBucketDtoListEnvelope.md)
 - [SocialPostBucketUpdateDto](docs/SocialPostBucketUpdateDto.md)


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
