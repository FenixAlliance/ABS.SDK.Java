# CountriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countCountries**](CountriesApi.md#countCountries) | **GET** /api/v2/GlobeService/Countries/Count | Count countries |
| [**getAllCountries**](CountriesApi.md#getAllCountries) | **GET** /api/v2/GlobeService/Countries | Get all countries |
| [**getCallingCodesByCountryIdAsync**](CountriesApi.md#getCallingCodesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/CallingCodes | Get calling codes for a country |
| [**getCitiesByCountryStateIdAsync**](CountriesApi.md#getCitiesByCountryStateIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId}/Cities | Get cities for a state |
| [**getCountryById**](CountriesApi.md#getCountryById) | **GET** /api/v2/GlobeService/Countries/{countryId} | Get country by ID |
| [**getCountryStateByIdAsync**](CountriesApi.md#getCountryStateByIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States/{countryStateId} | Get state by ID |
| [**getCountryStatesAsync**](CountriesApi.md#getCountryStatesAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/States | Get states for a country |
| [**getEnabledCurrenciesByCountryIdAsync**](CountriesApi.md#getEnabledCurrenciesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/Currencies | Get currencies for a country |
| [**getTimeZonesByCountryIdAsync**](CountriesApi.md#getTimeZonesByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/Timezones | Get timezones for a country |
| [**getTopLevelDomainsByCountryIdAsync**](CountriesApi.md#getTopLevelDomainsByCountryIdAsync) | **GET** /api/v2/GlobeService/Countries/{countryId}/TopLevelDomains | Get top-level domains for a country |
| [**searchCountriesByNameAsync**](CountriesApi.md#searchCountriesByNameAsync) | **GET** /api/v2/GlobeService/Countries/Search | Search countries by name |


<a id="countCountries"></a>
# **countCountries**
> Int32Envelope countCountries(apiVersion, xApiVersion)

Count countries

Returns the total number of countries, with optional OData filtering.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      Int32Envelope result = apiInstance.countCountries(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#countCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getAllCountries"></a>
# **getAllCountries**
> CountryDtoListEnvelope getAllCountries(apiVersion, xApiVersion)

Get all countries

Retrieves a list of all countries with optional OData pagination and filtering.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryDtoListEnvelope result = apiInstance.getAllCountries(apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getAllCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryDtoListEnvelope**](CountryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getCallingCodesByCountryIdAsync"></a>
# **getCallingCodesByCountryIdAsync**
> CountryCallingCodeDtoListEnvelope getCallingCodesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get calling codes for a country

Retrieves the list of international telephone calling codes associated with the specified country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryCallingCodeDtoListEnvelope result = apiInstance.getCallingCodesByCountryIdAsync(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCallingCodesByCountryIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryCallingCodeDtoListEnvelope**](CountryCallingCodeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getCitiesByCountryStateIdAsync"></a>
# **getCitiesByCountryStateIdAsync**
> CityDtoListEnvelope getCitiesByCountryStateIdAsync(countryStateId, countryId, apiVersion, xApiVersion)

Get cities for a state

Retrieves the list of cities belonging to the specified state or province.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryStateId = "countryStateId_example"; // String | 
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CityDtoListEnvelope result = apiInstance.getCitiesByCountryStateIdAsync(countryStateId, countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCitiesByCountryStateIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryStateId** | **String**|  | |
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CityDtoListEnvelope**](CityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getCountryById"></a>
# **getCountryById**
> CountryDtoEnvelope getCountryById(countryId, apiVersion, xApiVersion)

Get country by ID

Retrieves a single country by its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryDtoEnvelope result = apiInstance.getCountryById(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCountryById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryDtoEnvelope**](CountryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getCountryStateByIdAsync"></a>
# **getCountryStateByIdAsync**
> CountryStateDtoEnvelope getCountryStateByIdAsync(countryStateId, countryId, apiVersion, xApiVersion)

Get state by ID

Retrieves a single state or province by its unique identifier within a country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryStateId = "countryStateId_example"; // String | 
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryStateDtoEnvelope result = apiInstance.getCountryStateByIdAsync(countryStateId, countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCountryStateByIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryStateId** | **String**|  | |
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryStateDtoEnvelope**](CountryStateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getCountryStatesAsync"></a>
# **getCountryStatesAsync**
> CountryStateDtoListEnvelope getCountryStatesAsync(countryId, apiVersion, xApiVersion)

Get states for a country

Retrieves the list of states or provinces belonging to the specified country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryStateDtoListEnvelope result = apiInstance.getCountryStatesAsync(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getCountryStatesAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryStateDtoListEnvelope**](CountryStateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getEnabledCurrenciesByCountryIdAsync"></a>
# **getEnabledCurrenciesByCountryIdAsync**
> CurrencyDtoListEnvelope getEnabledCurrenciesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get currencies for a country

Retrieves the list of enabled currencies for the specified country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CurrencyDtoListEnvelope result = apiInstance.getEnabledCurrenciesByCountryIdAsync(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getEnabledCurrenciesByCountryIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CurrencyDtoListEnvelope**](CurrencyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getTimeZonesByCountryIdAsync"></a>
# **getTimeZonesByCountryIdAsync**
> TimezoneDtoListEnvelope getTimeZonesByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get timezones for a country

Retrieves the list of timezones associated with the specified country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      TimezoneDtoListEnvelope result = apiInstance.getTimeZonesByCountryIdAsync(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getTimeZonesByCountryIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**TimezoneDtoListEnvelope**](TimezoneDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getTopLevelDomainsByCountryIdAsync"></a>
# **getTopLevelDomainsByCountryIdAsync**
> CountryTopLevelDomainDtoListEnvelope getTopLevelDomainsByCountryIdAsync(countryId, apiVersion, xApiVersion)

Get top-level domains for a country

Retrieves the list of internet top-level domains (TLDs) associated with the specified country.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryId = "countryId_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryTopLevelDomainDtoListEnvelope result = apiInstance.getTopLevelDomainsByCountryIdAsync(countryId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getTopLevelDomainsByCountryIdAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryTopLevelDomainDtoListEnvelope**](CountryTopLevelDomainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="searchCountriesByNameAsync"></a>
# **searchCountriesByNameAsync**
> CountryDtoListEnvelope searchCountriesByNameAsync(countryName, apiVersion, xApiVersion)

Search countries by name

Searches for countries whose name matches the specified search term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    CountriesApi apiInstance = new CountriesApi(defaultClient);
    String countryName = "countryName_example"; // String | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CountryDtoListEnvelope result = apiInstance.searchCountriesByNameAsync(countryName, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#searchCountriesByNameAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryName** | **String**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CountryDtoListEnvelope**](CountryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

