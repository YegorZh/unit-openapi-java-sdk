/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.ReceivedPaymentRelationshipsCustomer;
import unit.java.sdk.model.ReceivedPaymentRelationshipsReceivePaymentTransaction;
import unit.java.sdk.model.RelationshipsAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReceivedPaymentRelationships
 */
@JsonPropertyOrder({
  ReceivedPaymentRelationships.JSON_PROPERTY_ACCOUNT,
  ReceivedPaymentRelationships.JSON_PROPERTY_CUSTOMER,
  ReceivedPaymentRelationships.JSON_PROPERTY_RECEIVE_PAYMENT_TRANSACTION,
  ReceivedPaymentRelationships.JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION,
  ReceivedPaymentRelationships.JSON_PROPERTY_REPAY_PAYMENT_ADVANCE_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReceivedPaymentRelationships extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private RelationshipsAccount account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String JSON_PROPERTY_RECEIVE_PAYMENT_TRANSACTION = "receivePaymentTransaction";
  private ReceivedPaymentRelationshipsReceivePaymentTransaction receivePaymentTransaction;

  public static final String JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION = "paymentAdvanceTransaction";
  private ReceivedPaymentRelationshipsReceivePaymentTransaction paymentAdvanceTransaction;

  public static final String JSON_PROPERTY_REPAY_PAYMENT_ADVANCE_TRANSACTION = "repayPaymentAdvanceTransaction";
  private ReceivedPaymentRelationshipsReceivePaymentTransaction repayPaymentAdvanceTransaction;

  public ReceivedPaymentRelationships() { 
  }

  public ReceivedPaymentRelationships account(RelationshipsAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RelationshipsAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(RelationshipsAccount account) {
    this.account = account;
  }


  public ReceivedPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public ReceivedPaymentRelationships receivePaymentTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction receivePaymentTransaction) {
    this.receivePaymentTransaction = receivePaymentTransaction;
    return this;
  }

   /**
   * Get receivePaymentTransaction
   * @return receivePaymentTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVE_PAYMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceivedPaymentRelationshipsReceivePaymentTransaction getReceivePaymentTransaction() {
    return receivePaymentTransaction;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVE_PAYMENT_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivePaymentTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction receivePaymentTransaction) {
    this.receivePaymentTransaction = receivePaymentTransaction;
  }


  public ReceivedPaymentRelationships paymentAdvanceTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction paymentAdvanceTransaction) {
    this.paymentAdvanceTransaction = paymentAdvanceTransaction;
    return this;
  }

   /**
   * Get paymentAdvanceTransaction
   * @return paymentAdvanceTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceivedPaymentRelationshipsReceivePaymentTransaction getPaymentAdvanceTransaction() {
    return paymentAdvanceTransaction;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAdvanceTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction paymentAdvanceTransaction) {
    this.paymentAdvanceTransaction = paymentAdvanceTransaction;
  }


  public ReceivedPaymentRelationships repayPaymentAdvanceTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction repayPaymentAdvanceTransaction) {
    this.repayPaymentAdvanceTransaction = repayPaymentAdvanceTransaction;
    return this;
  }

   /**
   * Get repayPaymentAdvanceTransaction
   * @return repayPaymentAdvanceTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPAY_PAYMENT_ADVANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceivedPaymentRelationshipsReceivePaymentTransaction getRepayPaymentAdvanceTransaction() {
    return repayPaymentAdvanceTransaction;
  }


  @JsonProperty(JSON_PROPERTY_REPAY_PAYMENT_ADVANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepayPaymentAdvanceTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction repayPaymentAdvanceTransaction) {
    this.repayPaymentAdvanceTransaction = repayPaymentAdvanceTransaction;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public ReceivedPaymentRelationships putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this receivedPaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedPaymentRelationships receivedPaymentRelationships = (ReceivedPaymentRelationships) o;
    return Objects.equals(this.account, receivedPaymentRelationships.account) &&
        Objects.equals(this.customer, receivedPaymentRelationships.customer) &&
        Objects.equals(this.receivePaymentTransaction, receivedPaymentRelationships.receivePaymentTransaction) &&
        Objects.equals(this.paymentAdvanceTransaction, receivedPaymentRelationships.paymentAdvanceTransaction) &&
        Objects.equals(this.repayPaymentAdvanceTransaction, receivedPaymentRelationships.repayPaymentAdvanceTransaction)&&
        Objects.equals(this.additionalProperties, receivedPaymentRelationships.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, receivePaymentTransaction, paymentAdvanceTransaction, repayPaymentAdvanceTransaction, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedPaymentRelationships {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    receivePaymentTransaction: ").append(toIndentedString(receivePaymentTransaction)).append("\n");
    sb.append("    paymentAdvanceTransaction: ").append(toIndentedString(paymentAdvanceTransaction)).append("\n");
    sb.append("    repayPaymentAdvanceTransaction: ").append(toIndentedString(repayPaymentAdvanceTransaction)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `receivePaymentTransaction` to the URL query string
    if (getReceivePaymentTransaction() != null) {
      joiner.add(getReceivePaymentTransaction().toUrlQueryString(prefix + "receivePaymentTransaction" + suffix));
    }

    // add `paymentAdvanceTransaction` to the URL query string
    if (getPaymentAdvanceTransaction() != null) {
      joiner.add(getPaymentAdvanceTransaction().toUrlQueryString(prefix + "paymentAdvanceTransaction" + suffix));
    }

    // add `repayPaymentAdvanceTransaction` to the URL query string
    if (getRepayPaymentAdvanceTransaction() != null) {
      joiner.add(getRepayPaymentAdvanceTransaction().toUrlQueryString(prefix + "repayPaymentAdvanceTransaction" + suffix));
    }

    return joiner.toString();
  }
}

