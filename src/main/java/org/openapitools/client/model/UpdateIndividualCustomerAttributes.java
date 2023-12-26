/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
 * 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.AuthorizedUser;
import org.openapitools.client.model.Phone;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UpdateIndividualCustomerAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateIndividualCustomerAttributes {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private Phone phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_DBA = "dba";
  @SerializedName(SERIALIZED_NAME_DBA)
  private String dba;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_AUTHORIZED_USERS = "authorizedUsers";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_USERS)
  private List<AuthorizedUser> authorizedUsers;

  public static final String SERIALIZED_NAME_JWT_SUBJECT = "jwtSubject";
  @SerializedName(SERIALIZED_NAME_JWT_SUBJECT)
  private String jwtSubject;

  public UpdateIndividualCustomerAttributes() {
  }

  public UpdateIndividualCustomerAttributes email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateIndividualCustomerAttributes phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public Phone getPhone() {
    return phone;
  }


  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public UpdateIndividualCustomerAttributes address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public UpdateIndividualCustomerAttributes dba(String dba) {
    
    this.dba = dba;
    return this;
  }

   /**
   * Get dba
   * @return dba
  **/
  @javax.annotation.Nullable
  public String getDba() {
    return dba;
  }


  public void setDba(String dba) {
    this.dba = dba;
  }


  public UpdateIndividualCustomerAttributes tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public UpdateIndividualCustomerAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    
    this.authorizedUsers = authorizedUsers;
    return this;
  }

  public UpdateIndividualCustomerAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null) {
      this.authorizedUsers = new ArrayList<>();
    }
    this.authorizedUsers.add(authorizedUsersItem);
    return this;
  }

   /**
   * Get authorizedUsers
   * @return authorizedUsers
  **/
  @javax.annotation.Nullable
  public List<AuthorizedUser> getAuthorizedUsers() {
    return authorizedUsers;
  }


  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }


  public UpdateIndividualCustomerAttributes jwtSubject(String jwtSubject) {
    
    this.jwtSubject = jwtSubject;
    return this;
  }

   /**
   * Get jwtSubject
   * @return jwtSubject
  **/
  @javax.annotation.Nullable
  public String getJwtSubject() {
    return jwtSubject;
  }


  public void setJwtSubject(String jwtSubject) {
    this.jwtSubject = jwtSubject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIndividualCustomerAttributes updateIndividualCustomerAttributes = (UpdateIndividualCustomerAttributes) o;
    return Objects.equals(this.email, updateIndividualCustomerAttributes.email) &&
        Objects.equals(this.phone, updateIndividualCustomerAttributes.phone) &&
        Objects.equals(this.address, updateIndividualCustomerAttributes.address) &&
        Objects.equals(this.dba, updateIndividualCustomerAttributes.dba) &&
        Objects.equals(this.tags, updateIndividualCustomerAttributes.tags) &&
        Objects.equals(this.authorizedUsers, updateIndividualCustomerAttributes.authorizedUsers) &&
        Objects.equals(this.jwtSubject, updateIndividualCustomerAttributes.jwtSubject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, address, dba, tags, authorizedUsers, jwtSubject);
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
    sb.append("class UpdateIndividualCustomerAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("address");
    openapiFields.add("dba");
    openapiFields.add("tags");
    openapiFields.add("authorizedUsers");
    openapiFields.add("jwtSubject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateIndividualCustomerAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateIndividualCustomerAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateIndividualCustomerAttributes is not found in the empty JSON string", UpdateIndividualCustomerAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateIndividualCustomerAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateIndividualCustomerAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `phone`
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) {
        Phone.validateJsonElement(jsonObj.get("phone"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("dba") != null && !jsonObj.get("dba").isJsonNull()) && !jsonObj.get("dba").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dba` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dba").toString()));
      }
      if (jsonObj.get("authorizedUsers") != null && !jsonObj.get("authorizedUsers").isJsonNull()) {
        JsonArray jsonArrayauthorizedUsers = jsonObj.getAsJsonArray("authorizedUsers");
        if (jsonArrayauthorizedUsers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authorizedUsers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authorizedUsers` to be an array in the JSON string but got `%s`", jsonObj.get("authorizedUsers").toString()));
          }

          // validate the optional field `authorizedUsers` (array)
          for (int i = 0; i < jsonArrayauthorizedUsers.size(); i++) {
            AuthorizedUser.validateJsonElement(jsonArrayauthorizedUsers.get(i));
          };
        }
      }
      if ((jsonObj.get("jwtSubject") != null && !jsonObj.get("jwtSubject").isJsonNull()) && !jsonObj.get("jwtSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwtSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwtSubject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateIndividualCustomerAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateIndividualCustomerAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateIndividualCustomerAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateIndividualCustomerAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateIndividualCustomerAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateIndividualCustomerAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateIndividualCustomerAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateIndividualCustomerAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateIndividualCustomerAttributes
  * @throws IOException if the JSON string is invalid with respect to UpdateIndividualCustomerAttributes
  */
  public static UpdateIndividualCustomerAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateIndividualCustomerAttributes.class);
  }

 /**
  * Convert an instance of UpdateIndividualCustomerAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
