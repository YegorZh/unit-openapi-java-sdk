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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.VirtualCardStatus;

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
 * IndividualVirtualDebitCardAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndividualVirtualDebitCardAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LAST4_DIGITS = "last4Digits";
  @SerializedName(SERIALIZED_NAME_LAST4_DIGITS)
  private String last4Digits;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VirtualCardStatus status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_FREEZE_REASON = "freezeReason";
  @SerializedName(SERIALIZED_NAME_FREEZE_REASON)
  private String freezeReason;

  public IndividualVirtualDebitCardAllOfAttributes() {
  }

  public IndividualVirtualDebitCardAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public IndividualVirtualDebitCardAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public IndividualVirtualDebitCardAllOfAttributes last4Digits(String last4Digits) {
    
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * Get last4Digits
   * @return last4Digits
  **/
  @javax.annotation.Nonnull
  public String getLast4Digits() {
    return last4Digits;
  }


  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  public IndividualVirtualDebitCardAllOfAttributes expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nonnull
  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public IndividualVirtualDebitCardAllOfAttributes bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @javax.annotation.Nullable
  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public IndividualVirtualDebitCardAllOfAttributes status(VirtualCardStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public VirtualCardStatus getStatus() {
    return status;
  }


  public void setStatus(VirtualCardStatus status) {
    this.status = status;
  }


  public IndividualVirtualDebitCardAllOfAttributes tags(Object tags) {
    
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


  public IndividualVirtualDebitCardAllOfAttributes freezeReason(String freezeReason) {
    
    this.freezeReason = freezeReason;
    return this;
  }

   /**
   * Get freezeReason
   * @return freezeReason
  **/
  @javax.annotation.Nullable
  public String getFreezeReason() {
    return freezeReason;
  }


  public void setFreezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualVirtualDebitCardAllOfAttributes individualVirtualDebitCardAllOfAttributes = (IndividualVirtualDebitCardAllOfAttributes) o;
    return Objects.equals(this.createdAt, individualVirtualDebitCardAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, individualVirtualDebitCardAllOfAttributes.updatedAt) &&
        Objects.equals(this.last4Digits, individualVirtualDebitCardAllOfAttributes.last4Digits) &&
        Objects.equals(this.expirationDate, individualVirtualDebitCardAllOfAttributes.expirationDate) &&
        Objects.equals(this.bin, individualVirtualDebitCardAllOfAttributes.bin) &&
        Objects.equals(this.status, individualVirtualDebitCardAllOfAttributes.status) &&
        Objects.equals(this.tags, individualVirtualDebitCardAllOfAttributes.tags) &&
        Objects.equals(this.freezeReason, individualVirtualDebitCardAllOfAttributes.freezeReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, last4Digits, expirationDate, bin, status, tags, freezeReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualVirtualDebitCardAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("last4Digits");
    openapiFields.add("expirationDate");
    openapiFields.add("bin");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("freezeReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("last4Digits");
    openapiRequiredFields.add("expirationDate");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IndividualVirtualDebitCardAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IndividualVirtualDebitCardAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualVirtualDebitCardAllOfAttributes is not found in the empty JSON string", IndividualVirtualDebitCardAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IndividualVirtualDebitCardAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualVirtualDebitCardAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IndividualVirtualDebitCardAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("last4Digits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last4Digits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last4Digits").toString()));
      }
      if (!jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()) && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      if ((jsonObj.get("freezeReason") != null && !jsonObj.get("freezeReason").isJsonNull()) && !jsonObj.get("freezeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freezeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freezeReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualVirtualDebitCardAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualVirtualDebitCardAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualVirtualDebitCardAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualVirtualDebitCardAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualVirtualDebitCardAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, IndividualVirtualDebitCardAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualVirtualDebitCardAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndividualVirtualDebitCardAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndividualVirtualDebitCardAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to IndividualVirtualDebitCardAllOfAttributes
  */
  public static IndividualVirtualDebitCardAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualVirtualDebitCardAllOfAttributes.class);
  }

 /**
  * Convert an instance of IndividualVirtualDebitCardAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

