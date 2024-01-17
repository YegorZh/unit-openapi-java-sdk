/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
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
import java.util.Arrays;

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
 * PatchCounterpartyAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchCounterpartyAttributes {
  public static final String SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN = "plaidProcessorToken";
  @SerializedName(SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN)
  private String plaidProcessorToken;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    CREDITONLY("CreditOnly"),
    
    DEBITONLY("DebitOnly"),
    
    CREDITANDDEBIT("CreditAndDebit");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsEnum permissions;

  public static final String SERIALIZED_NAME_VERIFY_NAME = "verifyName";
  @SerializedName(SERIALIZED_NAME_VERIFY_NAME)
  private Boolean verifyName = false;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public PatchCounterpartyAttributes() {
  }

  public PatchCounterpartyAttributes plaidProcessorToken(String plaidProcessorToken) {
    
    this.plaidProcessorToken = plaidProcessorToken;
    return this;
  }

   /**
   * Get plaidProcessorToken
   * @return plaidProcessorToken
  **/
  @javax.annotation.Nullable
  public String getPlaidProcessorToken() {
    return plaidProcessorToken;
  }


  public void setPlaidProcessorToken(String plaidProcessorToken) {
    this.plaidProcessorToken = plaidProcessorToken;
  }


  public PatchCounterpartyAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PatchCounterpartyAttributes permissions(PermissionsEnum permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  public PermissionsEnum getPermissions() {
    return permissions;
  }


  public void setPermissions(PermissionsEnum permissions) {
    this.permissions = permissions;
  }


  public PatchCounterpartyAttributes verifyName(Boolean verifyName) {
    
    this.verifyName = verifyName;
    return this;
  }

   /**
   * Get verifyName
   * @return verifyName
  **/
  @javax.annotation.Nullable
  public Boolean getVerifyName() {
    return verifyName;
  }


  public void setVerifyName(Boolean verifyName) {
    this.verifyName = verifyName;
  }


  public PatchCounterpartyAttributes tags(Object tags) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCounterpartyAttributes patchCounterpartyAttributes = (PatchCounterpartyAttributes) o;
    return Objects.equals(this.plaidProcessorToken, patchCounterpartyAttributes.plaidProcessorToken) &&
        Objects.equals(this.name, patchCounterpartyAttributes.name) &&
        Objects.equals(this.permissions, patchCounterpartyAttributes.permissions) &&
        Objects.equals(this.verifyName, patchCounterpartyAttributes.verifyName) &&
        Objects.equals(this.tags, patchCounterpartyAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plaidProcessorToken, name, permissions, verifyName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCounterpartyAttributes {\n");
    sb.append("    plaidProcessorToken: ").append(toIndentedString(plaidProcessorToken)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    verifyName: ").append(toIndentedString(verifyName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("plaidProcessorToken");
    openapiFields.add("name");
    openapiFields.add("permissions");
    openapiFields.add("verifyName");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PatchCounterpartyAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchCounterpartyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchCounterpartyAttributes is not found in the empty JSON string", PatchCounterpartyAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchCounterpartyAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchCounterpartyAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plaidProcessorToken") != null && !jsonObj.get("plaidProcessorToken").isJsonNull()) && !jsonObj.get("plaidProcessorToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plaidProcessorToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plaidProcessorToken").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) && !jsonObj.get("permissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchCounterpartyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchCounterpartyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchCounterpartyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchCounterpartyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchCounterpartyAttributes>() {
           @Override
           public void write(JsonWriter out, PatchCounterpartyAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchCounterpartyAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchCounterpartyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchCounterpartyAttributes
  * @throws IOException if the JSON string is invalid with respect to PatchCounterpartyAttributes
  */
  public static PatchCounterpartyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchCounterpartyAttributes.class);
  }

 /**
  * Convert an instance of PatchCounterpartyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

