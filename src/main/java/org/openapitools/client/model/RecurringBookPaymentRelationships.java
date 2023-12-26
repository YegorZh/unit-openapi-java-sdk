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
import java.util.Arrays;
import org.openapitools.client.model.ReceivedPaymentRelationshipsCustomer;
import org.openapitools.client.model.RecurringAchPaymentRelationshipsAccount;
import org.openapitools.client.model.RecurringAchPaymentRelationshipsOrg;
import org.openapitools.client.model.RecurringBookPaymentRelationshipsCounterpartyAccount;

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
 * RecurringBookPaymentRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurringBookPaymentRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private RecurringAchPaymentRelationshipsAccount account;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ACCOUNT)
  private RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private RecurringAchPaymentRelationshipsOrg org;

  public RecurringBookPaymentRelationships() {
  }

  public RecurringBookPaymentRelationships account(RecurringAchPaymentRelationshipsAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  public RecurringAchPaymentRelationshipsAccount getAccount() {
    return account;
  }


  public void setAccount(RecurringAchPaymentRelationshipsAccount account) {
    this.account = account;
  }


  public RecurringBookPaymentRelationships counterpartyAccount(RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount) {
    
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @javax.annotation.Nullable
  public RecurringBookPaymentRelationshipsCounterpartyAccount getCounterpartyAccount() {
    return counterpartyAccount;
  }


  public void setCounterpartyAccount(RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public RecurringBookPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public RecurringBookPaymentRelationships org(RecurringAchPaymentRelationshipsOrg org) {
    
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @javax.annotation.Nullable
  public RecurringAchPaymentRelationshipsOrg getOrg() {
    return org;
  }


  public void setOrg(RecurringAchPaymentRelationshipsOrg org) {
    this.org = org;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringBookPaymentRelationships recurringBookPaymentRelationships = (RecurringBookPaymentRelationships) o;
    return Objects.equals(this.account, recurringBookPaymentRelationships.account) &&
        Objects.equals(this.counterpartyAccount, recurringBookPaymentRelationships.counterpartyAccount) &&
        Objects.equals(this.customer, recurringBookPaymentRelationships.customer) &&
        Objects.equals(this.org, recurringBookPaymentRelationships.org);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, counterpartyAccount, customer, org);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringBookPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("counterpartyAccount");
    openapiFields.add("customer");
    openapiFields.add("org");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecurringBookPaymentRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecurringBookPaymentRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringBookPaymentRelationships is not found in the empty JSON string", RecurringBookPaymentRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecurringBookPaymentRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringBookPaymentRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        RecurringAchPaymentRelationshipsAccount.validateJsonElement(jsonObj.get("account"));
      }
      // validate the optional field `counterpartyAccount`
      if (jsonObj.get("counterpartyAccount") != null && !jsonObj.get("counterpartyAccount").isJsonNull()) {
        RecurringBookPaymentRelationshipsCounterpartyAccount.validateJsonElement(jsonObj.get("counterpartyAccount"));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        ReceivedPaymentRelationshipsCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `org`
      if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
        RecurringAchPaymentRelationshipsOrg.validateJsonElement(jsonObj.get("org"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringBookPaymentRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringBookPaymentRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringBookPaymentRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringBookPaymentRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringBookPaymentRelationships>() {
           @Override
           public void write(JsonWriter out, RecurringBookPaymentRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringBookPaymentRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringBookPaymentRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringBookPaymentRelationships
  * @throws IOException if the JSON string is invalid with respect to RecurringBookPaymentRelationships
  */
  public static RecurringBookPaymentRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringBookPaymentRelationships.class);
  }

 /**
  * Convert an instance of RecurringBookPaymentRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
