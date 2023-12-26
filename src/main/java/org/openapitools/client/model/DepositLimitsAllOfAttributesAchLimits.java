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
import java.math.BigDecimal;
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
 * DepositLimitsAllOfAttributesAchLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositLimitsAllOfAttributesAchLimits {
  public static final String SERIALIZED_NAME_DAILY_DEBIT = "dailyDebit";
  @SerializedName(SERIALIZED_NAME_DAILY_DEBIT)
  private BigDecimal dailyDebit;

  public static final String SERIALIZED_NAME_DAILY_CREDIT = "dailyCredit";
  @SerializedName(SERIALIZED_NAME_DAILY_CREDIT)
  private BigDecimal dailyCredit;

  public static final String SERIALIZED_NAME_MONTHLY_DEBIT = "monthlyDebit";
  @SerializedName(SERIALIZED_NAME_MONTHLY_DEBIT)
  private BigDecimal monthlyDebit;

  public static final String SERIALIZED_NAME_MONTHLY_DEBIT_SOFT = "monthlyDebitSoft";
  @SerializedName(SERIALIZED_NAME_MONTHLY_DEBIT_SOFT)
  private BigDecimal monthlyDebitSoft;

  public static final String SERIALIZED_NAME_DAILY_DEBIT_SOFT = "dailyDebitSoft";
  @SerializedName(SERIALIZED_NAME_DAILY_DEBIT_SOFT)
  private BigDecimal dailyDebitSoft;

  public static final String SERIALIZED_NAME_MONTHLY_CREDIT = "monthlyCredit";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CREDIT)
  private BigDecimal monthlyCredit;

  public DepositLimitsAllOfAttributesAchLimits() {
  }

  public DepositLimitsAllOfAttributesAchLimits dailyDebit(BigDecimal dailyDebit) {
    
    this.dailyDebit = dailyDebit;
    return this;
  }

   /**
   * Get dailyDebit
   * @return dailyDebit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyDebit() {
    return dailyDebit;
  }


  public void setDailyDebit(BigDecimal dailyDebit) {
    this.dailyDebit = dailyDebit;
  }


  public DepositLimitsAllOfAttributesAchLimits dailyCredit(BigDecimal dailyCredit) {
    
    this.dailyCredit = dailyCredit;
    return this;
  }

   /**
   * Get dailyCredit
   * @return dailyCredit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyCredit() {
    return dailyCredit;
  }


  public void setDailyCredit(BigDecimal dailyCredit) {
    this.dailyCredit = dailyCredit;
  }


  public DepositLimitsAllOfAttributesAchLimits monthlyDebit(BigDecimal monthlyDebit) {
    
    this.monthlyDebit = monthlyDebit;
    return this;
  }

   /**
   * Get monthlyDebit
   * @return monthlyDebit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMonthlyDebit() {
    return monthlyDebit;
  }


  public void setMonthlyDebit(BigDecimal monthlyDebit) {
    this.monthlyDebit = monthlyDebit;
  }


  public DepositLimitsAllOfAttributesAchLimits monthlyDebitSoft(BigDecimal monthlyDebitSoft) {
    
    this.monthlyDebitSoft = monthlyDebitSoft;
    return this;
  }

   /**
   * Get monthlyDebitSoft
   * @return monthlyDebitSoft
  **/
  @javax.annotation.Nullable
  public BigDecimal getMonthlyDebitSoft() {
    return monthlyDebitSoft;
  }


  public void setMonthlyDebitSoft(BigDecimal monthlyDebitSoft) {
    this.monthlyDebitSoft = monthlyDebitSoft;
  }


  public DepositLimitsAllOfAttributesAchLimits dailyDebitSoft(BigDecimal dailyDebitSoft) {
    
    this.dailyDebitSoft = dailyDebitSoft;
    return this;
  }

   /**
   * Get dailyDebitSoft
   * @return dailyDebitSoft
  **/
  @javax.annotation.Nullable
  public BigDecimal getDailyDebitSoft() {
    return dailyDebitSoft;
  }


  public void setDailyDebitSoft(BigDecimal dailyDebitSoft) {
    this.dailyDebitSoft = dailyDebitSoft;
  }


  public DepositLimitsAllOfAttributesAchLimits monthlyCredit(BigDecimal monthlyCredit) {
    
    this.monthlyCredit = monthlyCredit;
    return this;
  }

   /**
   * Get monthlyCredit
   * @return monthlyCredit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMonthlyCredit() {
    return monthlyCredit;
  }


  public void setMonthlyCredit(BigDecimal monthlyCredit) {
    this.monthlyCredit = monthlyCredit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesAchLimits depositLimitsAllOfAttributesAchLimits = (DepositLimitsAllOfAttributesAchLimits) o;
    return Objects.equals(this.dailyDebit, depositLimitsAllOfAttributesAchLimits.dailyDebit) &&
        Objects.equals(this.dailyCredit, depositLimitsAllOfAttributesAchLimits.dailyCredit) &&
        Objects.equals(this.monthlyDebit, depositLimitsAllOfAttributesAchLimits.monthlyDebit) &&
        Objects.equals(this.monthlyDebitSoft, depositLimitsAllOfAttributesAchLimits.monthlyDebitSoft) &&
        Objects.equals(this.dailyDebitSoft, depositLimitsAllOfAttributesAchLimits.dailyDebitSoft) &&
        Objects.equals(this.monthlyCredit, depositLimitsAllOfAttributesAchLimits.monthlyCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyDebit, dailyCredit, monthlyDebit, monthlyDebitSoft, dailyDebitSoft, monthlyCredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesAchLimits {\n");
    sb.append("    dailyDebit: ").append(toIndentedString(dailyDebit)).append("\n");
    sb.append("    dailyCredit: ").append(toIndentedString(dailyCredit)).append("\n");
    sb.append("    monthlyDebit: ").append(toIndentedString(monthlyDebit)).append("\n");
    sb.append("    monthlyDebitSoft: ").append(toIndentedString(monthlyDebitSoft)).append("\n");
    sb.append("    dailyDebitSoft: ").append(toIndentedString(dailyDebitSoft)).append("\n");
    sb.append("    monthlyCredit: ").append(toIndentedString(monthlyCredit)).append("\n");
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
    openapiFields.add("dailyDebit");
    openapiFields.add("dailyCredit");
    openapiFields.add("monthlyDebit");
    openapiFields.add("monthlyDebitSoft");
    openapiFields.add("dailyDebitSoft");
    openapiFields.add("monthlyCredit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dailyDebit");
    openapiRequiredFields.add("dailyCredit");
    openapiRequiredFields.add("monthlyDebit");
    openapiRequiredFields.add("monthlyCredit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DepositLimitsAllOfAttributesAchLimits
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DepositLimitsAllOfAttributesAchLimits.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositLimitsAllOfAttributesAchLimits is not found in the empty JSON string", DepositLimitsAllOfAttributesAchLimits.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DepositLimitsAllOfAttributesAchLimits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositLimitsAllOfAttributesAchLimits` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositLimitsAllOfAttributesAchLimits.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositLimitsAllOfAttributesAchLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositLimitsAllOfAttributesAchLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositLimitsAllOfAttributesAchLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositLimitsAllOfAttributesAchLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositLimitsAllOfAttributesAchLimits>() {
           @Override
           public void write(JsonWriter out, DepositLimitsAllOfAttributesAchLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositLimitsAllOfAttributesAchLimits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositLimitsAllOfAttributesAchLimits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositLimitsAllOfAttributesAchLimits
  * @throws IOException if the JSON string is invalid with respect to DepositLimitsAllOfAttributesAchLimits
  */
  public static DepositLimitsAllOfAttributesAchLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositLimitsAllOfAttributesAchLimits.class);
  }

 /**
  * Convert an instance of DepositLimitsAllOfAttributesAchLimits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
