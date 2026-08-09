# ContactsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContactAsync**](ContactsApi.md#createContactAsync) | **POST** /api/v2/CrmService/Contacts | Create a new contact |
| [**createContactEmailAsync**](ContactsApi.md#createContactEmailAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Addresses | Add an email address to a contact |
| [**createProfileForContactAsync**](ContactsApi.md#createProfileForContactAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Profiles | Create a contact profile |
| [**deleteContactAsync**](ContactsApi.md#deleteContactAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId} | Delete a contact |
| [**deleteContactEmailAsync**](ContactsApi.md#deleteContactEmailAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Delete a contact email address |
| [**deleteProfileForContactAsync**](ContactsApi.md#deleteProfileForContactAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Profiles/{profileId} | Delete a contact profile |
| [**getBusinessOwnedIndividualAsync**](ContactsApi.md#getBusinessOwnedIndividualAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId} | Get a Contact of type Individual by ID |
| [**getBusinessOwnedIndividualsAsync**](ContactsApi.md#getBusinessOwnedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals | Get all contacts of type individual |
| [**getBusinessOwnedIndividualsCountAsync**](ContactsApi.md#getBusinessOwnedIndividualsCountAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/Count | Get all contacts of type individual count |
| [**getBusinessOwnedOrganizationAsync**](ContactsApi.md#getBusinessOwnedOrganizationAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId} | Get a Contact of type Organization by ID |
| [**getBusinessOwnedOrganizationsAsync**](ContactsApi.md#getBusinessOwnedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations | Get all contacts of type organization |
| [**getBusinessOwnedOrganizationsCountAsync**](ContactsApi.md#getBusinessOwnedOrganizationsCountAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/Count | Get all contacts of type organization count |
| [**getContactAsync**](ContactsApi.md#getContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId} | Get a contact by ID |
| [**getContactAvatarAsync**](ContactsApi.md#getContactAvatarAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Avatar | Get a contact&#39;s avatar |
| [**getContactCartAsync**](ContactsApi.md#getContactCartAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Cart | Get a contact&#39;s cart |
| [**getContactEmailsAsync**](ContactsApi.md#getContactEmailsAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Emails | Get a contact&#39;s email addresses |
| [**getContactEmailsCountAsync**](ContactsApi.md#getContactEmailsCountAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Emails/Count | Get contact email addresses count |
| [**getContactSocialProfileAsync**](ContactsApi.md#getContactSocialProfileAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/SocialProfile | Get a contact&#39;s social profile |
| [**getContactWalletAsync**](ContactsApi.md#getContactWalletAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Wallet | Get a contact&#39;s wallet |
| [**getContactsAsync**](ContactsApi.md#getContactsAsync) | **GET** /api/v2/CrmService/Contacts | Get all business owned contacts |
| [**getContactsCountAsync**](ContactsApi.md#getContactsCountAsync) | **GET** /api/v2/CrmService/Contacts/Count | Get all business owned contacts count |
| [**getExtendedBusinessOwnedIndividualsAsync**](ContactsApi.md#getExtendedBusinessOwnedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/Extended | Get all contacts of type individual |
| [**getExtendedBusinessOwnedOrganizationsAsync**](ContactsApi.md#getExtendedBusinessOwnedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/Extended | Get all contacts of type organization |
| [**getExtendedContactAsync**](ContactsApi.md#getExtendedContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Extended | Get a contact by ID |
| [**getExtendedContactsAsync**](ContactsApi.md#getExtendedContactsAsync) | **GET** /api/v2/CrmService/Contacts/Extended | Get all business owned contacts |
| [**getIndividualRelatedIndividualsAsync**](ContactsApi.md#getIndividualRelatedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Individuals | Get individual related individuals |
| [**getIndividualRelatedOrganizationsAsync**](ContactsApi.md#getIndividualRelatedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Organizations | Get individual related organizations |
| [**getOrganizationRelatedIndividualsAsync**](ContactsApi.md#getOrganizationRelatedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Individuals | Get organization related individuals |
| [**getOrganizationRelatedOrganizationsAsync**](ContactsApi.md#getOrganizationRelatedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Organizations | Get organization related organizations |
| [**getProfilesForContactAsync**](ContactsApi.md#getProfilesForContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Profiles | Get a contact&#39;s social profiles |
| [**getProfilesForContactCountAsync**](ContactsApi.md#getProfilesForContactCountAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Profiles/Count | Get contact profiles count |
| [**patchContactAsync**](ContactsApi.md#patchContactAsync) | **PATCH** /api/v2/CrmService/Contacts/{contactId} | Patch a contact |
| [**patchContactEmailAsync**](ContactsApi.md#patchContactEmailAsync) | **PATCH** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Patch a contact email address |
| [**previewContactEmailTemplate**](ContactsApi.md#previewContactEmailTemplate) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Preview | Preview the rendered email for a contact. |
| [**sendContactEmail**](ContactsApi.md#sendContactEmail) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Send | Send an email to a contact. |
| [**updateContactAsync**](ContactsApi.md#updateContactAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId} | Update a contact |
| [**updateContactAvatarAsync**](ContactsApi.md#updateContactAvatarAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Avatar | Update a contact&#39;s avatar |
| [**updateContactEmailAsync**](ContactsApi.md#updateContactEmailAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Update a contact email address |
| [**updateProfileForContactAsync**](ContactsApi.md#updateProfileForContactAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Profiles/{profileId} | Update a contact profile |
| [**upsertTenantOntoAnotherTenantContactListAsync**](ContactsApi.md#upsertTenantOntoAnotherTenantContactListAsync) | **POST** /api/v2/CrmService/Contacts/Organizations/Upsert | Upsert a tenant onto another tenant&#39;s contact list |
| [**upsertUserOntoAnotherTenantContactListAsync**](ContactsApi.md#upsertUserOntoAnotherTenantContactListAsync) | **POST** /api/v2/CrmService/Contacts/Individuals/Upsert | Upsert a user onto a tenant&#39;s contact list |
| [**verifyContactEmailAsync**](ContactsApi.md#verifyContactEmailAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId}/Verify | Verify a contact email address |


<a id="createContactAsync"></a>
# **createContactAsync**
> EmptyEnvelope createContactAsync(tenantId, apiVersion, xApiVersion, contactCreateDto)

Create a new contact

Create a new contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactCreateDto contactCreateDto = new ContactCreateDto(); // ContactCreateDto | 
    try {
      EmptyEnvelope result = apiInstance.createContactAsync(tenantId, apiVersion, xApiVersion, contactCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createContactAsync");
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
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactCreateDto** | [**ContactCreateDto**](ContactCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="createContactEmailAsync"></a>
# **createContactEmailAsync**
> createContactEmailAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailCreateDto)

Add an email address to a contact

Creates a new email address for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactEmailCreateDto contactEmailCreateDto = new ContactEmailCreateDto(); // ContactEmailCreateDto | 
    try {
      apiInstance.createContactEmailAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createContactEmailAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactEmailCreateDto** | [**ContactEmailCreateDto**](ContactEmailCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="createProfileForContactAsync"></a>
# **createProfileForContactAsync**
> createProfileForContactAsync(tenantId, contactId, apiVersion, xApiVersion, contactProfileCreateDto)

Create a contact profile

Creates a new profile for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactProfileCreateDto contactProfileCreateDto = new ContactProfileCreateDto(); // ContactProfileCreateDto | 
    try {
      apiInstance.createProfileForContactAsync(tenantId, contactId, apiVersion, xApiVersion, contactProfileCreateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createProfileForContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactProfileCreateDto** | [**ContactProfileCreateDto**](ContactProfileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |

<a id="deleteContactAsync"></a>
# **deleteContactAsync**
> EmptyEnvelope deleteContactAsync(tenantId, contactId, apiVersion, xApiVersion)

Delete a contact

Delete a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.deleteContactAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="deleteContactEmailAsync"></a>
# **deleteContactEmailAsync**
> deleteContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion)

Delete a contact email address

Deletes an email address from the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID emailId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteContactEmailAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **emailId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="deleteProfileForContactAsync"></a>
# **deleteProfileForContactAsync**
> deleteProfileForContactAsync(tenantId, contactId, profileId, apiVersion, xApiVersion)

Delete a contact profile

Deletes a profile for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.deleteProfileForContactAsync(tenantId, contactId, profileId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#deleteProfileForContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **profileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedIndividualAsync"></a>
# **getBusinessOwnedIndividualAsync**
> ContactDtoEnvelope getBusinessOwnedIndividualAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a Contact of type Individual by ID

Get a Contact of type Individual by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoEnvelope result = apiInstance.getBusinessOwnedIndividualAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedIndividualAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedIndividualsAsync"></a>
# **getBusinessOwnedIndividualsAsync**
> ContactDtoListEnvelope getBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type individual

Get all contacts of type individual

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      ContactDtoListEnvelope result = apiInstance.getBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedIndividualsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedIndividualsCountAsync"></a>
# **getBusinessOwnedIndividualsCountAsync**
> ContactDtoListEnvelope getBusinessOwnedIndividualsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type individual count

Get all contacts of type individual count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      ContactDtoListEnvelope result = apiInstance.getBusinessOwnedIndividualsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedIndividualsCountAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedOrganizationAsync"></a>
# **getBusinessOwnedOrganizationAsync**
> ContactDtoEnvelope getBusinessOwnedOrganizationAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a Contact of type Organization by ID

Get a Contact of type Organization by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoEnvelope result = apiInstance.getBusinessOwnedOrganizationAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedOrganizationAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedOrganizationsAsync"></a>
# **getBusinessOwnedOrganizationsAsync**
> List&lt;ContactDto&gt; getBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type organization

Get all contacts of type organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      List<ContactDto> result = apiInstance.getBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedOrganizationsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**List&lt;ContactDto&gt;**](ContactDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getBusinessOwnedOrganizationsCountAsync"></a>
# **getBusinessOwnedOrganizationsCountAsync**
> ContactDtoListEnvelope getBusinessOwnedOrganizationsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type organization count

Get all contacts of type organization count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      ContactDtoListEnvelope result = apiInstance.getBusinessOwnedOrganizationsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getBusinessOwnedOrganizationsCountAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactAsync"></a>
# **getContactAsync**
> ContactDtoEnvelope getContactAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact by ID

Get a contact by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoEnvelope result = apiInstance.getContactAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactAvatarAsync"></a>
# **getContactAvatarAsync**
> EmptyEnvelope getContactAvatarAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact&#39;s avatar

Get a contact&#39;s avatar

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      EmptyEnvelope result = apiInstance.getContactAvatarAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactAvatarAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="getContactCartAsync"></a>
# **getContactCartAsync**
> CartDtoEnvelope getContactCartAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact&#39;s cart

Get a contact&#39;s cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      CartDtoEnvelope result = apiInstance.getContactCartAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactCartAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactEmailsAsync"></a>
# **getContactEmailsAsync**
> ContactEmailDtoListEnvelope getContactEmailsAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)

Get a contact&#39;s email addresses

Get all email addresses for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactEmailDtoCollectionQueryParameters contactEmailDtoCollectionQueryParameters = new ContactEmailDtoCollectionQueryParameters(); // ContactEmailDtoCollectionQueryParameters | 
    try {
      ContactEmailDtoListEnvelope result = apiInstance.getContactEmailsAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactEmailsAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactEmailDtoCollectionQueryParameters** | [**ContactEmailDtoCollectionQueryParameters**](ContactEmailDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactEmailDtoListEnvelope**](ContactEmailDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactEmailsCountAsync"></a>
# **getContactEmailsCountAsync**
> Int32Envelope getContactEmailsCountAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)

Get contact email addresses count

Returns the count of email addresses for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactEmailDtoCollectionQueryParameters contactEmailDtoCollectionQueryParameters = new ContactEmailDtoCollectionQueryParameters(); // ContactEmailDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getContactEmailsCountAsync(tenantId, contactId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactEmailsCountAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactEmailDtoCollectionQueryParameters** | [**ContactEmailDtoCollectionQueryParameters**](ContactEmailDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="getContactSocialProfileAsync"></a>
# **getContactSocialProfileAsync**
> SocialProfileDtoEnvelope getContactSocialProfileAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact&#39;s social profile

Get a contact&#39;s social profile

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      SocialProfileDtoEnvelope result = apiInstance.getContactSocialProfileAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactSocialProfileAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**SocialProfileDtoEnvelope**](SocialProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactWalletAsync"></a>
# **getContactWalletAsync**
> WalletDtoEnvelope getContactWalletAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact&#39;s wallet

Get a contact&#39;s wallet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      WalletDtoEnvelope result = apiInstance.getContactWalletAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactWalletAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**WalletDtoEnvelope**](WalletDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactsAsync"></a>
# **getContactsAsync**
> ContactDtoListEnvelope getContactsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all business owned contacts

Get all business owned contacts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      ContactDtoListEnvelope result = apiInstance.getContactsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getContactsCountAsync"></a>
# **getContactsCountAsync**
> ContactDtoListEnvelope getContactsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all business owned contacts count

Get all business owned contacts count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactDtoCollectionQueryParameters contactDtoCollectionQueryParameters = new ContactDtoCollectionQueryParameters(); // ContactDtoCollectionQueryParameters | 
    try {
      ContactDtoListEnvelope result = apiInstance.getContactsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContactsCountAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getExtendedBusinessOwnedIndividualsAsync"></a>
# **getExtendedBusinessOwnedIndividualsAsync**
> ExtendedContactDtoListEnvelope getExtendedBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all contacts of type individual

Get all contacts of type individual

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ExtendedContactDtoCollectionQueryParameters extendedContactDtoCollectionQueryParameters = new ExtendedContactDtoCollectionQueryParameters(); // ExtendedContactDtoCollectionQueryParameters | 
    try {
      ExtendedContactDtoListEnvelope result = apiInstance.getExtendedBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getExtendedBusinessOwnedIndividualsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getExtendedBusinessOwnedOrganizationsAsync"></a>
# **getExtendedBusinessOwnedOrganizationsAsync**
> ExtendedContactDtoListEnvelope getExtendedBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all contacts of type organization

Get all contacts of type organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ExtendedContactDtoCollectionQueryParameters extendedContactDtoCollectionQueryParameters = new ExtendedContactDtoCollectionQueryParameters(); // ExtendedContactDtoCollectionQueryParameters | 
    try {
      ExtendedContactDtoListEnvelope result = apiInstance.getExtendedBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getExtendedBusinessOwnedOrganizationsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getExtendedContactAsync"></a>
# **getExtendedContactAsync**
> ExtendedContactDtoEnvelope getExtendedContactAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact by ID

Get a contact by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ExtendedContactDtoEnvelope result = apiInstance.getExtendedContactAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getExtendedContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ExtendedContactDtoEnvelope**](ExtendedContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getExtendedContactsAsync"></a>
# **getExtendedContactsAsync**
> ExtendedContactDtoListEnvelope getExtendedContactsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all business owned contacts

Get all business owned contacts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ExtendedContactDtoCollectionQueryParameters extendedContactDtoCollectionQueryParameters = new ExtendedContactDtoCollectionQueryParameters(); // ExtendedContactDtoCollectionQueryParameters | 
    try {
      ExtendedContactDtoListEnvelope result = apiInstance.getExtendedContactsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getExtendedContactsAsync");
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
| **tenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getIndividualRelatedIndividualsAsync"></a>
# **getIndividualRelatedIndividualsAsync**
> ContactDtoListEnvelope getIndividualRelatedIndividualsAsync(tenantId, contactId, apiVersion, xApiVersion)

Get individual related individuals

Get individual related individuals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoListEnvelope result = apiInstance.getIndividualRelatedIndividualsAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getIndividualRelatedIndividualsAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getIndividualRelatedOrganizationsAsync"></a>
# **getIndividualRelatedOrganizationsAsync**
> ContactDtoListEnvelope getIndividualRelatedOrganizationsAsync(tenantId, contactId, apiVersion, xApiVersion)

Get individual related organizations

Get individual related organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoListEnvelope result = apiInstance.getIndividualRelatedOrganizationsAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getIndividualRelatedOrganizationsAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getOrganizationRelatedIndividualsAsync"></a>
# **getOrganizationRelatedIndividualsAsync**
> ContactDtoListEnvelope getOrganizationRelatedIndividualsAsync(tenantId, contactId, apiVersion, xApiVersion)

Get organization related individuals

Get organization related individuals

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoListEnvelope result = apiInstance.getOrganizationRelatedIndividualsAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getOrganizationRelatedIndividualsAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getOrganizationRelatedOrganizationsAsync"></a>
# **getOrganizationRelatedOrganizationsAsync**
> ContactDtoListEnvelope getOrganizationRelatedOrganizationsAsync(tenantId, contactId, apiVersion, xApiVersion)

Get organization related organizations

Get organization related organizations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoListEnvelope result = apiInstance.getOrganizationRelatedOrganizationsAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getOrganizationRelatedOrganizationsAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getProfilesForContactAsync"></a>
# **getProfilesForContactAsync**
> ContactProfileDtoListEnvelope getProfilesForContactAsync(tenantId, contactId, apiVersion, xApiVersion)

Get a contact&#39;s social profiles

Get a contact&#39;s social profiles

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactProfileDtoListEnvelope result = apiInstance.getProfilesForContactAsync(tenantId, contactId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getProfilesForContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactProfileDtoListEnvelope**](ContactProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="getProfilesForContactCountAsync"></a>
# **getProfilesForContactCountAsync**
> Int32Envelope getProfilesForContactCountAsync(tenantId, contactId, apiVersion, xApiVersion, contactProfileDtoCollectionQueryParameters)

Get contact profiles count

Returns the count of profiles for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactProfileDtoCollectionQueryParameters contactProfileDtoCollectionQueryParameters = new ContactProfileDtoCollectionQueryParameters(); // ContactProfileDtoCollectionQueryParameters | 
    try {
      Int32Envelope result = apiInstance.getProfilesForContactCountAsync(tenantId, contactId, apiVersion, xApiVersion, contactProfileDtoCollectionQueryParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getProfilesForContactCountAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactProfileDtoCollectionQueryParameters** | [**ContactProfileDtoCollectionQueryParameters**](ContactProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | OK |  -  |

<a id="patchContactAsync"></a>
# **patchContactAsync**
> EmptyEnvelope patchContactAsync(tenantId, contactId, apiVersion, xApiVersion, patchOperation)

Patch a contact

Patch a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      EmptyEnvelope result = apiInstance.patchContactAsync(tenantId, contactId, apiVersion, xApiVersion, patchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#patchContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="patchContactEmailAsync"></a>
# **patchContactEmailAsync**
> patchContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion, patchOperation)

Patch a contact email address

Partially updates an existing email address for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID emailId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    List<PatchOperation> patchOperation = Arrays.asList(); // List<PatchOperation> | 
    try {
      apiInstance.patchContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion, patchOperation);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#patchContactEmailAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **emailId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **patchOperation** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="previewContactEmailTemplate"></a>
# **previewContactEmailTemplate**
> previewContactEmailTemplate(contactId, apiVersion, xApiVersion, emailDispatchRequest)

Preview the rendered email for a contact.

This action is only available for global administrators (business_owner role).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.previewContactEmailTemplate(contactId, apiVersion, xApiVersion, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#previewContactEmailTemplate");
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
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendContactEmail"></a>
# **sendContactEmail**
> sendContactEmail(contactId, apiVersion, xApiVersion, emailDispatchRequest)

Send an email to a contact.

This action is only available for global administrators (business_owner role).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    EmailDispatchRequest emailDispatchRequest = new EmailDispatchRequest(); // EmailDispatchRequest | 
    try {
      apiInstance.sendContactEmail(contactId, apiVersion, xApiVersion, emailDispatchRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#sendContactEmail");
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
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateContactAsync"></a>
# **updateContactAsync**
> EmptyEnvelope updateContactAsync(tenantId, contactId, apiVersion, xApiVersion, contactUpdateDto)

Update a contact

Update a contact

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactUpdateDto contactUpdateDto = new ContactUpdateDto(); // ContactUpdateDto | 
    try {
      EmptyEnvelope result = apiInstance.updateContactAsync(tenantId, contactId, apiVersion, xApiVersion, contactUpdateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactUpdateDto** | [**ContactUpdateDto**](ContactUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="updateContactAvatarAsync"></a>
# **updateContactAvatarAsync**
> EmptyEnvelope updateContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion, avatar)

Update a contact&#39;s avatar

Update a contact&#39;s avatar

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    File avatar = new File("/path/to/file"); // File | 
    try {
      EmptyEnvelope result = apiInstance.updateContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion, avatar);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContactAvatarAsync");
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
| **contactId** | **UUID**|  | |
| **tenantId** | **UUID**|  | [optional] |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **avatar** | **File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |

<a id="updateContactEmailAsync"></a>
# **updateContactEmailAsync**
> updateContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion, contactEmailUpdateDto)

Update a contact email address

Updates an existing email address for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID emailId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactEmailUpdateDto contactEmailUpdateDto = new ContactEmailUpdateDto(); // ContactEmailUpdateDto | 
    try {
      apiInstance.updateContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion, contactEmailUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateContactEmailAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **emailId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactEmailUpdateDto** | [**ContactEmailUpdateDto**](ContactEmailUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="updateProfileForContactAsync"></a>
# **updateProfileForContactAsync**
> updateProfileForContactAsync(tenantId, contactId, profileId, apiVersion, xApiVersion, contactProfileUpdateDto)

Update a contact profile

Updates an existing profile for the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    ContactProfileUpdateDto contactProfileUpdateDto = new ContactProfileUpdateDto(); // ContactProfileUpdateDto | 
    try {
      apiInstance.updateProfileForContactAsync(tenantId, contactId, profileId, apiVersion, xApiVersion, contactProfileUpdateDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateProfileForContactAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **profileId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |
| **contactProfileUpdateDto** | [**ContactProfileUpdateDto**](ContactProfileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

<a id="upsertTenantOntoAnotherTenantContactListAsync"></a>
# **upsertTenantOntoAnotherTenantContactListAsync**
> ContactDtoEnvelope upsertTenantOntoAnotherTenantContactListAsync(tenantId, relatedTenantId, apiVersion, xApiVersion)

Upsert a tenant onto another tenant&#39;s contact list

Upsert a tenant onto another tenant&#39;s contact list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID relatedTenantId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoEnvelope result = apiInstance.upsertTenantOntoAnotherTenantContactListAsync(tenantId, relatedTenantId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#upsertTenantOntoAnotherTenantContactListAsync");
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
| **tenantId** | **UUID**|  | |
| **relatedTenantId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="upsertUserOntoAnotherTenantContactListAsync"></a>
# **upsertUserOntoAnotherTenantContactListAsync**
> ContactDtoEnvelope upsertUserOntoAnotherTenantContactListAsync(tenantId, relatedUserId, apiVersion, xApiVersion)

Upsert a user onto a tenant&#39;s contact list

Upsert a user onto a tenant&#39;s contact list

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID relatedUserId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      ContactDtoEnvelope result = apiInstance.upsertUserOntoAnotherTenantContactListAsync(tenantId, relatedUserId, apiVersion, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#upsertUserOntoAnotherTenantContactListAsync");
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
| **tenantId** | **UUID**|  | |
| **relatedUserId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **401** | Unauthorized |  -  |
| **200** | OK |  -  |

<a id="verifyContactEmailAsync"></a>
# **verifyContactEmailAsync**
> verifyContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion)

Verify a contact email address

Marks an email address as verified on the specified contact.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://absuite.net");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    UUID contactId = UUID.randomUUID(); // UUID | 
    UUID emailId = UUID.randomUUID(); // UUID | 
    String apiVersion = "apiVersion_example"; // String | 
    String xApiVersion = "xApiVersion_example"; // String | 
    try {
      apiInstance.verifyContactEmailAsync(tenantId, contactId, emailId, apiVersion, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#verifyContactEmailAsync");
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
| **tenantId** | **UUID**|  | |
| **contactId** | **UUID**|  | |
| **emailId** | **UUID**|  | |
| **apiVersion** | **String**|  | [optional] |
| **xApiVersion** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **200** | OK |  -  |

