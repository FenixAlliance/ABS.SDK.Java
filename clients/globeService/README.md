# openapi-java-client

GlobeService
- API version: 2.0.1.4089
  - Build date: 2024-11-05T15:36:00.095262200-05:00[America/Bogota]
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
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryCallingCodeDtoListEnvelope result = apiInstance.apiV2GlobeServiceCountriesCountryIdCallingCodesGet(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#apiV2GlobeServiceCountriesCountryIdCallingCodesGet");
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
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdCallingCodesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdCallingCodesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/CallingCodes | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdCurrenciesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdCurrenciesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/Currencies | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdGet) | **GET** /api/v2/GlobeService/Countries/{countryId} | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdCitiesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId}/Cities | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesCountryStateIdGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId} | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdStatesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdStatesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/States | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdTimezonesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdTimezonesGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/Timezones | 
*CountriesApi* | [**apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesCountryIdTopLevelDomainsGet) | **GET** /api/v2/GlobeService/Countries/{countryId}/TopLevelDomains | 
*CountriesApi* | [**apiV2GlobeServiceCountriesGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesGet) | **GET** /api/v2/GlobeService/Countries | 
*CountriesApi* | [**apiV2GlobeServiceCountriesSearchGet**](docs/CountriesApi.md#apiV2GlobeServiceCountriesSearchGet) | **GET** /api/v2/GlobeService/Countries/Search | 
*CurrenciesApi* | [**apiV2GlobeServiceCurrenciesCurrencyIdGet**](docs/CurrenciesApi.md#apiV2GlobeServiceCurrenciesCurrencyIdGet) | **GET** /api/v2/GlobeService/Currencies/{currencyId} | 
*CurrenciesApi* | [**apiV2GlobeServiceCurrenciesGet**](docs/CurrenciesApi.md#apiV2GlobeServiceCurrenciesGet) | **GET** /api/v2/GlobeService/Currencies | 
*LanguagesApi* | [**apiV2GlobeServiceLanguagesGet**](docs/LanguagesApi.md#apiV2GlobeServiceLanguagesGet) | **GET** /api/v2/GlobeService/Languages | 
*LanguagesApi* | [**apiV2GlobeServiceLanguagesLanguageIdGet**](docs/LanguagesApi.md#apiV2GlobeServiceLanguagesLanguageIdGet) | **GET** /api/v2/GlobeService/Languages/{languageId} | 
*MigrationsApi* | [**apiV2GlobalSystemMigratePost**](docs/MigrationsApi.md#apiV2GlobalSystemMigratePost) | **POST** /api/v2/Global/System/Migrate | 
*TimezonesApi* | [**apiV2GlobeServiceTimezonesGet**](docs/TimezonesApi.md#apiV2GlobeServiceTimezonesGet) | **GET** /api/v2/GlobeService/Timezones | 
*TimezonesApi* | [**apiV2GlobeServiceTimezonesTimeZoneIdGet**](docs/TimezonesApi.md#apiV2GlobeServiceTimezonesTimeZoneIdGet) | **GET** /api/v2/GlobeService/Timezones/{timeZoneId} | 


## Documentation for Models

 - [CityDto](docs/CityDto.md)
 - [CityDtoListEnvelope](docs/CityDtoListEnvelope.md)
 - [CountryCallingCodeDto](docs/CountryCallingCodeDto.md)
 - [CountryCallingCodeDtoListEnvelope](docs/CountryCallingCodeDtoListEnvelope.md)
 - [CountryDto](docs/CountryDto.md)
 - [CountryDtoEnvelope](docs/CountryDtoEnvelope.md)
 - [CountryDtoListEnvelope](docs/CountryDtoListEnvelope.md)
 - [CountryLanguageDto](docs/CountryLanguageDto.md)
 - [CountryLanguageDtoEnvelope](docs/CountryLanguageDtoEnvelope.md)
 - [CountryLanguageDtoListEnvelope](docs/CountryLanguageDtoListEnvelope.md)
 - [CountryStateDto](docs/CountryStateDto.md)
 - [CountryStateDtoEnvelope](docs/CountryStateDtoEnvelope.md)
 - [CountryStateDtoListEnvelope](docs/CountryStateDtoListEnvelope.md)
 - [CountryTopLevelDomainDto](docs/CountryTopLevelDomainDto.md)
 - [CountryTopLevelDomainDtoListEnvelope](docs/CountryTopLevelDomainDtoListEnvelope.md)
 - [CurrencyDto](docs/CurrencyDto.md)
 - [CurrencyDtoEnvelope](docs/CurrencyDtoEnvelope.md)
 - [CurrencyDtoListEnvelope](docs/CurrencyDtoListEnvelope.md)
 - [Error](docs/Error.md)
 - [ErrorEnvelope](docs/ErrorEnvelope.md)
 - [PaymentResponse](docs/PaymentResponse.md)
 - [ResponseStatus](docs/ResponseStatus.md)
 - [TimezoneDto](docs/TimezoneDto.md)
 - [TimezoneDtoEnvelope](docs/TimezoneDtoEnvelope.md)
 - [TimezoneDtoListEnvelope](docs/TimezoneDtoListEnvelope.md)


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
