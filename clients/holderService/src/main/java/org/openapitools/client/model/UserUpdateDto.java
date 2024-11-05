/*
 * HolderService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.1.4089
 * Contact: support@fenix-alliance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UserUpdateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T15:36:07.227137-05:00[America/Bogota]", comments = "Generator version: 7.9.0")
public class UserUpdateDto {
  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private OffsetDateTime birthday;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PUBLIC_NAME = "publicName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_NAME)
  private String publicName;

  public static final String SERIALIZED_NAME_ID_PROVIDER = "idProvider";
  @SerializedName(SERIALIZED_NAME_ID_PROVIDER)
  private String idProvider;

  public static final String SERIALIZED_NAME_LANGUAGE_ID = "languageId";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_ID)
  private String languageId;

  public static final String SERIALIZED_NAME_TIMEZONE_ID = "timezoneId";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_ID)
  private String timezoneId;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_CITY_ID = "cityId";
  @SerializedName(SERIALIZED_NAME_CITY_ID)
  private String cityId;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private String stateId;

  public static final String SERIALIZED_NAME_ABOUT = "about";
  @SerializedName(SERIALIZED_NAME_ABOUT)
  private String about;

  public static final String SERIALIZED_NAME_WEB_URL = "webUrl";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public static final String SERIALIZED_NAME_JOB_TITLE = "jobTitle";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_COVER_URL = "coverUrl";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_GIT_HUB_URL = "gitHubUrl";
  @SerializedName(SERIALIZED_NAME_GIT_HUB_URL)
  private String gitHubUrl;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_TWITTER_URL = "twitterUrl";
  @SerializedName(SERIALIZED_NAME_TWITTER_URL)
  private String twitterUrl;

  public static final String SERIALIZED_NAME_FACEBOOK_URL = "facebookUrl";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_URL)
  private String facebookUrl;

  public static final String SERIALIZED_NAME_YOU_TUBE_URL = "youTubeUrl";
  @SerializedName(SERIALIZED_NAME_YOU_TUBE_URL)
  private String youTubeUrl;

  public static final String SERIALIZED_NAME_LINKED_IN_URL = "linkedInUrl";
  @SerializedName(SERIALIZED_NAME_LINKED_IN_URL)
  private String linkedInUrl;

  public static final String SERIALIZED_NAME_INSTAGRAM_URL = "instagramUrl";
  @SerializedName(SERIALIZED_NAME_INSTAGRAM_URL)
  private String instagramUrl;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_GITHUB_USERNAME = "githubUsername";
  @SerializedName(SERIALIZED_NAME_GITHUB_USERNAME)
  private String githubUsername;

  /**
   * Gets or Sets availability
   */
  @JsonAdapter(AvailabilityEnum.Adapter.class)
  public enum AvailabilityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    AvailabilityEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityEnum fromValue(Integer value) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return AvailabilityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      AvailabilityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private AvailabilityEnum availability;

  public UserUpdateDto() {
  }

  public UserUpdateDto birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }


  public UserUpdateDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserUpdateDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserUpdateDto publicName(String publicName) {
    this.publicName = publicName;
    return this;
  }

  /**
   * Get publicName
   * @return publicName
   */
  @javax.annotation.Nullable
  public String getPublicName() {
    return publicName;
  }

  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }


  public UserUpdateDto idProvider(String idProvider) {
    this.idProvider = idProvider;
    return this;
  }

  /**
   * Get idProvider
   * @return idProvider
   */
  @javax.annotation.Nullable
  public String getIdProvider() {
    return idProvider;
  }

  public void setIdProvider(String idProvider) {
    this.idProvider = idProvider;
  }


  public UserUpdateDto languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

  /**
   * Get languageId
   * @return languageId
   */
  @javax.annotation.Nullable
  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  public UserUpdateDto timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * Get timezoneId
   * @return timezoneId
   */
  @javax.annotation.Nullable
  public String getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }


  public UserUpdateDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public UserUpdateDto cityId(String cityId) {
    this.cityId = cityId;
    return this;
  }

  /**
   * Get cityId
   * @return cityId
   */
  @javax.annotation.Nullable
  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public UserUpdateDto currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   */
  @javax.annotation.Nullable
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }


  public UserUpdateDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public UserUpdateDto stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId
   * @return stateId
   */
  @javax.annotation.Nullable
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  public UserUpdateDto about(String about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
   */
  @javax.annotation.Nullable
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }


  public UserUpdateDto webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  /**
   * Get webUrl
   * @return webUrl
   */
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public UserUpdateDto jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public UserUpdateDto coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

  /**
   * Get coverUrl
   * @return coverUrl
   */
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }

  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public UserUpdateDto avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
   */
  @javax.annotation.Nullable
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public UserUpdateDto gitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
    return this;
  }

  /**
   * Get gitHubUrl
   * @return gitHubUrl
   */
  @javax.annotation.Nullable
  public String getGitHubUrl() {
    return gitHubUrl;
  }

  public void setGitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
  }


  public UserUpdateDto websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Get websiteUrl
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public UserUpdateDto twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

  /**
   * Get twitterUrl
   * @return twitterUrl
   */
  @javax.annotation.Nullable
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }


  public UserUpdateDto facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

  /**
   * Get facebookUrl
   * @return facebookUrl
   */
  @javax.annotation.Nullable
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }


  public UserUpdateDto youTubeUrl(String youTubeUrl) {
    this.youTubeUrl = youTubeUrl;
    return this;
  }

  /**
   * Get youTubeUrl
   * @return youTubeUrl
   */
  @javax.annotation.Nullable
  public String getYouTubeUrl() {
    return youTubeUrl;
  }

  public void setYouTubeUrl(String youTubeUrl) {
    this.youTubeUrl = youTubeUrl;
  }


  public UserUpdateDto linkedInUrl(String linkedInUrl) {
    this.linkedInUrl = linkedInUrl;
    return this;
  }

  /**
   * Get linkedInUrl
   * @return linkedInUrl
   */
  @javax.annotation.Nullable
  public String getLinkedInUrl() {
    return linkedInUrl;
  }

  public void setLinkedInUrl(String linkedInUrl) {
    this.linkedInUrl = linkedInUrl;
  }


  public UserUpdateDto instagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
    return this;
  }

  /**
   * Get instagramUrl
   * @return instagramUrl
   */
  @javax.annotation.Nullable
  public String getInstagramUrl() {
    return instagramUrl;
  }

  public void setInstagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
  }


  public UserUpdateDto countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId
   * @return countryId
   */
  @javax.annotation.Nullable
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public UserUpdateDto githubUsername(String githubUsername) {
    this.githubUsername = githubUsername;
    return this;
  }

  /**
   * Get githubUsername
   * @return githubUsername
   */
  @javax.annotation.Nullable
  public String getGithubUsername() {
    return githubUsername;
  }

  public void setGithubUsername(String githubUsername) {
    this.githubUsername = githubUsername;
  }


  public UserUpdateDto availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @javax.annotation.Nullable
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateDto userUpdateDto = (UserUpdateDto) o;
    return Objects.equals(this.birthday, userUpdateDto.birthday) &&
        Objects.equals(this.firstName, userUpdateDto.firstName) &&
        Objects.equals(this.lastName, userUpdateDto.lastName) &&
        Objects.equals(this.publicName, userUpdateDto.publicName) &&
        Objects.equals(this.idProvider, userUpdateDto.idProvider) &&
        Objects.equals(this.languageId, userUpdateDto.languageId) &&
        Objects.equals(this.timezoneId, userUpdateDto.timezoneId) &&
        Objects.equals(this.gender, userUpdateDto.gender) &&
        Objects.equals(this.cityId, userUpdateDto.cityId) &&
        Objects.equals(this.currencyId, userUpdateDto.currencyId) &&
        Objects.equals(this.status, userUpdateDto.status) &&
        Objects.equals(this.stateId, userUpdateDto.stateId) &&
        Objects.equals(this.about, userUpdateDto.about) &&
        Objects.equals(this.webUrl, userUpdateDto.webUrl) &&
        Objects.equals(this.jobTitle, userUpdateDto.jobTitle) &&
        Objects.equals(this.coverUrl, userUpdateDto.coverUrl) &&
        Objects.equals(this.avatarUrl, userUpdateDto.avatarUrl) &&
        Objects.equals(this.gitHubUrl, userUpdateDto.gitHubUrl) &&
        Objects.equals(this.websiteUrl, userUpdateDto.websiteUrl) &&
        Objects.equals(this.twitterUrl, userUpdateDto.twitterUrl) &&
        Objects.equals(this.facebookUrl, userUpdateDto.facebookUrl) &&
        Objects.equals(this.youTubeUrl, userUpdateDto.youTubeUrl) &&
        Objects.equals(this.linkedInUrl, userUpdateDto.linkedInUrl) &&
        Objects.equals(this.instagramUrl, userUpdateDto.instagramUrl) &&
        Objects.equals(this.countryId, userUpdateDto.countryId) &&
        Objects.equals(this.githubUsername, userUpdateDto.githubUsername) &&
        Objects.equals(this.availability, userUpdateDto.availability);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday, firstName, lastName, publicName, idProvider, languageId, timezoneId, gender, cityId, currencyId, status, stateId, about, webUrl, jobTitle, coverUrl, avatarUrl, gitHubUrl, websiteUrl, twitterUrl, facebookUrl, youTubeUrl, linkedInUrl, instagramUrl, countryId, githubUsername, availability);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateDto {\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    idProvider: ").append(toIndentedString(idProvider)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    gitHubUrl: ").append(toIndentedString(gitHubUrl)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    youTubeUrl: ").append(toIndentedString(youTubeUrl)).append("\n");
    sb.append("    linkedInUrl: ").append(toIndentedString(linkedInUrl)).append("\n");
    sb.append("    instagramUrl: ").append(toIndentedString(instagramUrl)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    githubUsername: ").append(toIndentedString(githubUsername)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("birthday");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("publicName");
    openapiFields.add("idProvider");
    openapiFields.add("languageId");
    openapiFields.add("timezoneId");
    openapiFields.add("gender");
    openapiFields.add("cityId");
    openapiFields.add("currencyId");
    openapiFields.add("status");
    openapiFields.add("stateId");
    openapiFields.add("about");
    openapiFields.add("webUrl");
    openapiFields.add("jobTitle");
    openapiFields.add("coverUrl");
    openapiFields.add("avatarUrl");
    openapiFields.add("gitHubUrl");
    openapiFields.add("websiteUrl");
    openapiFields.add("twitterUrl");
    openapiFields.add("facebookUrl");
    openapiFields.add("youTubeUrl");
    openapiFields.add("linkedInUrl");
    openapiFields.add("instagramUrl");
    openapiFields.add("countryId");
    openapiFields.add("githubUsername");
    openapiFields.add("availability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserUpdateDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserUpdateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserUpdateDto is not found in the empty JSON string", UserUpdateDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserUpdateDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserUpdateDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("publicName") != null && !jsonObj.get("publicName").isJsonNull()) && !jsonObj.get("publicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicName").toString()));
      }
      if ((jsonObj.get("idProvider") != null && !jsonObj.get("idProvider").isJsonNull()) && !jsonObj.get("idProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idProvider").toString()));
      }
      if ((jsonObj.get("languageId") != null && !jsonObj.get("languageId").isJsonNull()) && !jsonObj.get("languageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("languageId").toString()));
      }
      if ((jsonObj.get("timezoneId") != null && !jsonObj.get("timezoneId").isJsonNull()) && !jsonObj.get("timezoneId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezoneId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezoneId").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("cityId") != null && !jsonObj.get("cityId").isJsonNull()) && !jsonObj.get("cityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityId").toString()));
      }
      if ((jsonObj.get("currencyId") != null && !jsonObj.get("currencyId").isJsonNull()) && !jsonObj.get("currencyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("stateId") != null && !jsonObj.get("stateId").isJsonNull()) && !jsonObj.get("stateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateId").toString()));
      }
      if ((jsonObj.get("about") != null && !jsonObj.get("about").isJsonNull()) && !jsonObj.get("about").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `about` to be a primitive type in the JSON string but got `%s`", jsonObj.get("about").toString()));
      }
      if ((jsonObj.get("webUrl") != null && !jsonObj.get("webUrl").isJsonNull()) && !jsonObj.get("webUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webUrl").toString()));
      }
      if ((jsonObj.get("jobTitle") != null && !jsonObj.get("jobTitle").isJsonNull()) && !jsonObj.get("jobTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobTitle").toString()));
      }
      if ((jsonObj.get("coverUrl") != null && !jsonObj.get("coverUrl").isJsonNull()) && !jsonObj.get("coverUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverUrl").toString()));
      }
      if ((jsonObj.get("avatarUrl") != null && !jsonObj.get("avatarUrl").isJsonNull()) && !jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if ((jsonObj.get("gitHubUrl") != null && !jsonObj.get("gitHubUrl").isJsonNull()) && !jsonObj.get("gitHubUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitHubUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitHubUrl").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      if ((jsonObj.get("twitterUrl") != null && !jsonObj.get("twitterUrl").isJsonNull()) && !jsonObj.get("twitterUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitterUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitterUrl").toString()));
      }
      if ((jsonObj.get("facebookUrl") != null && !jsonObj.get("facebookUrl").isJsonNull()) && !jsonObj.get("facebookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facebookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facebookUrl").toString()));
      }
      if ((jsonObj.get("youTubeUrl") != null && !jsonObj.get("youTubeUrl").isJsonNull()) && !jsonObj.get("youTubeUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `youTubeUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("youTubeUrl").toString()));
      }
      if ((jsonObj.get("linkedInUrl") != null && !jsonObj.get("linkedInUrl").isJsonNull()) && !jsonObj.get("linkedInUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedInUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedInUrl").toString()));
      }
      if ((jsonObj.get("instagramUrl") != null && !jsonObj.get("instagramUrl").isJsonNull()) && !jsonObj.get("instagramUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instagramUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instagramUrl").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
      if ((jsonObj.get("githubUsername") != null && !jsonObj.get("githubUsername").isJsonNull()) && !jsonObj.get("githubUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `githubUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("githubUsername").toString()));
      }
      // validate the optional field `availability`
      if (jsonObj.get("availability") != null && !jsonObj.get("availability").isJsonNull()) {
        AvailabilityEnum.validateJsonElement(jsonObj.get("availability"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserUpdateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserUpdateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserUpdateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserUpdateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<UserUpdateDto>() {
           @Override
           public void write(JsonWriter out, UserUpdateDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserUpdateDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserUpdateDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserUpdateDto
   * @throws IOException if the JSON string is invalid with respect to UserUpdateDto
   */
  public static UserUpdateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserUpdateDto.class);
  }

  /**
   * Convert an instance of UserUpdateDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
