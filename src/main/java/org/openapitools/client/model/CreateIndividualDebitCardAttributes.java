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
import org.openapitools.client.model.Address;
import org.openapitools.client.model.BIN;
import org.openapitools.client.model.CardLevelLimits;

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
 * CreateIndividualDebitCardAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIndividualDebitCardAttributes {
  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private Address shippingAddress;

  public static final String SERIALIZED_NAME_DESIGN = "design";
  @SerializedName(SERIALIZED_NAME_DESIGN)
  private String design;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private CardLevelLimits limits;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private BIN bin;

  public static final String SERIALIZED_NAME_CARD_QUALIFIER = "cardQualifier";
  @SerializedName(SERIALIZED_NAME_CARD_QUALIFIER)
  private String cardQualifier;

  public static final String SERIALIZED_NAME_CARD_DESIGN_ID = "cardDesignId";
  @SerializedName(SERIALIZED_NAME_CARD_DESIGN_ID)
  private String cardDesignId;

  public static final String SERIALIZED_NAME_ADDITIONAL_EMBOSSED_TEXT = "additionalEmbossedText";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EMBOSSED_TEXT)
  private String additionalEmbossedText;

  public static final String SERIALIZED_NAME_ACTIVE_FOR_ONLINE_USE = "activeForOnlineUse";
  @SerializedName(SERIALIZED_NAME_ACTIVE_FOR_ONLINE_USE)
  private Boolean activeForOnlineUse;

  public static final String SERIALIZED_NAME_PRINT_ONLY_BUSINESS_NAME = "printOnlyBusinessName";
  @SerializedName(SERIALIZED_NAME_PRINT_ONLY_BUSINESS_NAME)
  private Boolean printOnlyBusinessName;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public CreateIndividualDebitCardAttributes() {
  }

  public CreateIndividualDebitCardAttributes shippingAddress(Address shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  public Address getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public CreateIndividualDebitCardAttributes design(String design) {
    
    this.design = design;
    return this;
  }

   /**
   * Get design
   * @return design
  **/
  @javax.annotation.Nullable
  public String getDesign() {
    return design;
  }


  public void setDesign(String design) {
    this.design = design;
  }


  public CreateIndividualDebitCardAttributes tags(Object tags) {
    
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


  public CreateIndividualDebitCardAttributes limits(CardLevelLimits limits) {
    
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  public CardLevelLimits getLimits() {
    return limits;
  }


  public void setLimits(CardLevelLimits limits) {
    this.limits = limits;
  }


  public CreateIndividualDebitCardAttributes idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @javax.annotation.Nullable
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateIndividualDebitCardAttributes bin(BIN bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @javax.annotation.Nullable
  public BIN getBin() {
    return bin;
  }


  public void setBin(BIN bin) {
    this.bin = bin;
  }


  public CreateIndividualDebitCardAttributes cardQualifier(String cardQualifier) {
    
    this.cardQualifier = cardQualifier;
    return this;
  }

   /**
   * Get cardQualifier
   * @return cardQualifier
  **/
  @javax.annotation.Nullable
  public String getCardQualifier() {
    return cardQualifier;
  }


  public void setCardQualifier(String cardQualifier) {
    this.cardQualifier = cardQualifier;
  }


  public CreateIndividualDebitCardAttributes cardDesignId(String cardDesignId) {
    
    this.cardDesignId = cardDesignId;
    return this;
  }

   /**
   * Get cardDesignId
   * @return cardDesignId
  **/
  @javax.annotation.Nullable
  public String getCardDesignId() {
    return cardDesignId;
  }


  public void setCardDesignId(String cardDesignId) {
    this.cardDesignId = cardDesignId;
  }


  public CreateIndividualDebitCardAttributes additionalEmbossedText(String additionalEmbossedText) {
    
    this.additionalEmbossedText = additionalEmbossedText;
    return this;
  }

   /**
   * Get additionalEmbossedText
   * @return additionalEmbossedText
  **/
  @javax.annotation.Nullable
  public String getAdditionalEmbossedText() {
    return additionalEmbossedText;
  }


  public void setAdditionalEmbossedText(String additionalEmbossedText) {
    this.additionalEmbossedText = additionalEmbossedText;
  }


  public CreateIndividualDebitCardAttributes activeForOnlineUse(Boolean activeForOnlineUse) {
    
    this.activeForOnlineUse = activeForOnlineUse;
    return this;
  }

   /**
   * Get activeForOnlineUse
   * @return activeForOnlineUse
  **/
  @javax.annotation.Nullable
  public Boolean getActiveForOnlineUse() {
    return activeForOnlineUse;
  }


  public void setActiveForOnlineUse(Boolean activeForOnlineUse) {
    this.activeForOnlineUse = activeForOnlineUse;
  }


  public CreateIndividualDebitCardAttributes printOnlyBusinessName(Boolean printOnlyBusinessName) {
    
    this.printOnlyBusinessName = printOnlyBusinessName;
    return this;
  }

   /**
   * Get printOnlyBusinessName
   * @return printOnlyBusinessName
  **/
  @javax.annotation.Nullable
  public Boolean getPrintOnlyBusinessName() {
    return printOnlyBusinessName;
  }


  public void setPrintOnlyBusinessName(Boolean printOnlyBusinessName) {
    this.printOnlyBusinessName = printOnlyBusinessName;
  }


  public CreateIndividualDebitCardAttributes expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndividualDebitCardAttributes createIndividualDebitCardAttributes = (CreateIndividualDebitCardAttributes) o;
    return Objects.equals(this.shippingAddress, createIndividualDebitCardAttributes.shippingAddress) &&
        Objects.equals(this.design, createIndividualDebitCardAttributes.design) &&
        Objects.equals(this.tags, createIndividualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, createIndividualDebitCardAttributes.limits) &&
        Objects.equals(this.idempotencyKey, createIndividualDebitCardAttributes.idempotencyKey) &&
        Objects.equals(this.bin, createIndividualDebitCardAttributes.bin) &&
        Objects.equals(this.cardQualifier, createIndividualDebitCardAttributes.cardQualifier) &&
        Objects.equals(this.cardDesignId, createIndividualDebitCardAttributes.cardDesignId) &&
        Objects.equals(this.additionalEmbossedText, createIndividualDebitCardAttributes.additionalEmbossedText) &&
        Objects.equals(this.activeForOnlineUse, createIndividualDebitCardAttributes.activeForOnlineUse) &&
        Objects.equals(this.printOnlyBusinessName, createIndividualDebitCardAttributes.printOnlyBusinessName) &&
        Objects.equals(this.expiryDate, createIndividualDebitCardAttributes.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, design, tags, limits, idempotencyKey, bin, cardQualifier, cardDesignId, additionalEmbossedText, activeForOnlineUse, printOnlyBusinessName, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndividualDebitCardAttributes {\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cardQualifier: ").append(toIndentedString(cardQualifier)).append("\n");
    sb.append("    cardDesignId: ").append(toIndentedString(cardDesignId)).append("\n");
    sb.append("    additionalEmbossedText: ").append(toIndentedString(additionalEmbossedText)).append("\n");
    sb.append("    activeForOnlineUse: ").append(toIndentedString(activeForOnlineUse)).append("\n");
    sb.append("    printOnlyBusinessName: ").append(toIndentedString(printOnlyBusinessName)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
    openapiFields.add("shippingAddress");
    openapiFields.add("design");
    openapiFields.add("tags");
    openapiFields.add("limits");
    openapiFields.add("idempotencyKey");
    openapiFields.add("bin");
    openapiFields.add("cardQualifier");
    openapiFields.add("cardDesignId");
    openapiFields.add("additionalEmbossedText");
    openapiFields.add("activeForOnlineUse");
    openapiFields.add("printOnlyBusinessName");
    openapiFields.add("expiryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateIndividualDebitCardAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateIndividualDebitCardAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIndividualDebitCardAttributes is not found in the empty JSON string", CreateIndividualDebitCardAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateIndividualDebitCardAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateIndividualDebitCardAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `shippingAddress`
      if (jsonObj.get("shippingAddress") != null && !jsonObj.get("shippingAddress").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("shippingAddress"));
      }
      if ((jsonObj.get("design") != null && !jsonObj.get("design").isJsonNull()) && !jsonObj.get("design").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `design` to be a primitive type in the JSON string but got `%s`", jsonObj.get("design").toString()));
      }
      // validate the optional field `limits`
      if (jsonObj.get("limits") != null && !jsonObj.get("limits").isJsonNull()) {
        CardLevelLimits.validateJsonElement(jsonObj.get("limits"));
      }
      if ((jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonNull()) && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
      // validate the optional field `bin`
      if (jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()) {
        BIN.validateJsonElement(jsonObj.get("bin"));
      }
      if ((jsonObj.get("cardQualifier") != null && !jsonObj.get("cardQualifier").isJsonNull()) && !jsonObj.get("cardQualifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardQualifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardQualifier").toString()));
      }
      if ((jsonObj.get("cardDesignId") != null && !jsonObj.get("cardDesignId").isJsonNull()) && !jsonObj.get("cardDesignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardDesignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardDesignId").toString()));
      }
      if ((jsonObj.get("additionalEmbossedText") != null && !jsonObj.get("additionalEmbossedText").isJsonNull()) && !jsonObj.get("additionalEmbossedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalEmbossedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalEmbossedText").toString()));
      }
      if ((jsonObj.get("expiryDate") != null && !jsonObj.get("expiryDate").isJsonNull()) && !jsonObj.get("expiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIndividualDebitCardAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIndividualDebitCardAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIndividualDebitCardAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIndividualDebitCardAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIndividualDebitCardAttributes>() {
           @Override
           public void write(JsonWriter out, CreateIndividualDebitCardAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIndividualDebitCardAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIndividualDebitCardAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIndividualDebitCardAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateIndividualDebitCardAttributes
  */
  public static CreateIndividualDebitCardAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIndividualDebitCardAttributes.class);
  }

 /**
  * Convert an instance of CreateIndividualDebitCardAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

