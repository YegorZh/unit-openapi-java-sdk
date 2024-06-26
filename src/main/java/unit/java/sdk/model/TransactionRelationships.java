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
import unit.java.sdk.model.AccountRelationship;
import unit.java.sdk.model.AuthorizationRelationship;
import unit.java.sdk.model.AuthorizationRequestRelationship;
import unit.java.sdk.model.CardRelationship;
import unit.java.sdk.model.ChargebackRelationship;
import unit.java.sdk.model.CheckDepositRelationship;
import unit.java.sdk.model.CheckPaymentRelationship;
import unit.java.sdk.model.CounterpartyAccountRelationship1;
import unit.java.sdk.model.CounterpartyCustomerRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.CustomersRelationship;
import unit.java.sdk.model.IncomingAchRelationship;
import unit.java.sdk.model.OrgRelationship;
import unit.java.sdk.model.PaymentRelationship;
import unit.java.sdk.model.ReceivedPaymentRelationship;
import unit.java.sdk.model.ReceivingAccountRelationship;
import unit.java.sdk.model.RecurringPaymentRelationship;
import unit.java.sdk.model.RelatedTransaction;
import unit.java.sdk.model.RelatedTransactionRelationship;
import unit.java.sdk.model.RepaymentRelationship;
import unit.java.sdk.model.ReturnedRelationship;
import unit.java.sdk.model.RewardRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransactionRelationships
 */
@JsonPropertyOrder({
  TransactionRelationships.JSON_PROPERTY_ACCOUNT,
  TransactionRelationships.JSON_PROPERTY_RECEIVING_ACCOUNT,
  TransactionRelationships.JSON_PROPERTY_CUSTOMER,
  TransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  TransactionRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT,
  TransactionRelationships.JSON_PROPERTY_COUNTERPARTY_CUSTOMER,
  TransactionRelationships.JSON_PROPERTY_RELATED_TRANSACTION,
  TransactionRelationships.JSON_PROPERTY_DISPUTED_TRANSACTION,
  TransactionRelationships.JSON_PROPERTY_AUTHORIZATION,
  TransactionRelationships.JSON_PROPERTY_RETURNED,
  TransactionRelationships.JSON_PROPERTY_PAYMENT,
  TransactionRelationships.JSON_PROPERTY_CHECK_PAYMENT,
  TransactionRelationships.JSON_PROPERTY_REPAYMENT,
  TransactionRelationships.JSON_PROPERTY_RECURRING_PAYMENT,
  TransactionRelationships.JSON_PROPERTY_ORG,
  TransactionRelationships.JSON_PROPERTY_CARD,
  TransactionRelationships.JSON_PROPERTY_INCOMING_ACH,
  TransactionRelationships.JSON_PROPERTY_CHECK_DEPOSIT,
  TransactionRelationships.JSON_PROPERTY_AUTHORIZATION_REQUEST,
  TransactionRelationships.JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION,
  TransactionRelationships.JSON_PROPERTY_RECEIVED_PAYMENT,
  TransactionRelationships.JSON_PROPERTY_CHARGEBACK,
  TransactionRelationships.JSON_PROPERTY_REWARD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT = "receivingAccount";
  private ReceivingAccountRelationship receivingAccount;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private CounterpartyAccountRelationship1 counterpartyAccount;

  public static final String JSON_PROPERTY_COUNTERPARTY_CUSTOMER = "counterpartyCustomer";
  private CounterpartyCustomerRelationship counterpartyCustomer;

  public static final String JSON_PROPERTY_RELATED_TRANSACTION = "relatedTransaction";
  private RelatedTransactionRelationship relatedTransaction;

  public static final String JSON_PROPERTY_DISPUTED_TRANSACTION = "disputedTransaction";
  private RelatedTransaction disputedTransaction;

  public static final String JSON_PROPERTY_AUTHORIZATION = "authorization";
  private AuthorizationRelationship authorization;

  public static final String JSON_PROPERTY_RETURNED = "returned";
  private ReturnedRelationship returned;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentRelationship payment;

  public static final String JSON_PROPERTY_CHECK_PAYMENT = "checkPayment";
  private CheckPaymentRelationship checkPayment;

  public static final String JSON_PROPERTY_REPAYMENT = "repayment";
  private RepaymentRelationship repayment;

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurringPayment";
  private RecurringPaymentRelationship recurringPayment;

  public static final String JSON_PROPERTY_ORG = "org";
  private OrgRelationship org;

  public static final String JSON_PROPERTY_CARD = "card";
  private CardRelationship card;

  public static final String JSON_PROPERTY_INCOMING_ACH = "incomingAch";
  private IncomingAchRelationship incomingAch;

  public static final String JSON_PROPERTY_CHECK_DEPOSIT = "checkDeposit";
  private CheckDepositRelationship checkDeposit;

  public static final String JSON_PROPERTY_AUTHORIZATION_REQUEST = "authorizationRequest";
  private AuthorizationRequestRelationship authorizationRequest;

  public static final String JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION = "paymentAdvanceTransaction";
  private RelatedTransaction paymentAdvanceTransaction;

  public static final String JSON_PROPERTY_RECEIVED_PAYMENT = "receivedPayment";
  private ReceivedPaymentRelationship receivedPayment;

  public static final String JSON_PROPERTY_CHARGEBACK = "chargeback";
  private ChargebackRelationship chargeback;

  public static final String JSON_PROPERTY_REWARD = "reward";
  private RewardRelationship reward;

  public TransactionRelationships() { 
  }

  public TransactionRelationships account(AccountRelationship account) {
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

  public AccountRelationship getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(AccountRelationship account) {
    this.account = account;
  }


  public TransactionRelationships receivingAccount(ReceivingAccountRelationship receivingAccount) {
    this.receivingAccount = receivingAccount;
    return this;
  }

   /**
   * Get receivingAccount
   * @return receivingAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceivingAccountRelationship getReceivingAccount() {
    return receivingAccount;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingAccount(ReceivingAccountRelationship receivingAccount) {
    this.receivingAccount = receivingAccount;
  }


  public TransactionRelationships customer(CustomerRelationship customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerRelationship getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(CustomerRelationship customer) {
    this.customer = customer;
  }


  public TransactionRelationships customers(CustomersRelationship customers) {
    this.customers = customers;
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomersRelationship getCustomers() {
    return customers;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomers(CustomersRelationship customers) {
    this.customers = customers;
  }


  public TransactionRelationships counterpartyAccount(CounterpartyAccountRelationship1 counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CounterpartyAccountRelationship1 getCounterpartyAccount() {
    return counterpartyAccount;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyAccount(CounterpartyAccountRelationship1 counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public TransactionRelationships counterpartyCustomer(CounterpartyCustomerRelationship counterpartyCustomer) {
    this.counterpartyCustomer = counterpartyCustomer;
    return this;
  }

   /**
   * Get counterpartyCustomer
   * @return counterpartyCustomer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CounterpartyCustomerRelationship getCounterpartyCustomer() {
    return counterpartyCustomer;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyCustomer(CounterpartyCustomerRelationship counterpartyCustomer) {
    this.counterpartyCustomer = counterpartyCustomer;
  }


  public TransactionRelationships relatedTransaction(RelatedTransactionRelationship relatedTransaction) {
    this.relatedTransaction = relatedTransaction;
    return this;
  }

   /**
   * Get relatedTransaction
   * @return relatedTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedTransactionRelationship getRelatedTransaction() {
    return relatedTransaction;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedTransaction(RelatedTransactionRelationship relatedTransaction) {
    this.relatedTransaction = relatedTransaction;
  }


  public TransactionRelationships disputedTransaction(RelatedTransaction disputedTransaction) {
    this.disputedTransaction = disputedTransaction;
    return this;
  }

   /**
   * Get disputedTransaction
   * @return disputedTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPUTED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedTransaction getDisputedTransaction() {
    return disputedTransaction;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputedTransaction(RelatedTransaction disputedTransaction) {
    this.disputedTransaction = disputedTransaction;
  }


  public TransactionRelationships authorization(AuthorizationRelationship authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorizationRelationship getAuthorization() {
    return authorization;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorization(AuthorizationRelationship authorization) {
    this.authorization = authorization;
  }


  public TransactionRelationships returned(ReturnedRelationship returned) {
    this.returned = returned;
    return this;
  }

   /**
   * Get returned
   * @return returned
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnedRelationship getReturned() {
    return returned;
  }


  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturned(ReturnedRelationship returned) {
    this.returned = returned;
  }


  public TransactionRelationships payment(PaymentRelationship payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentRelationship getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(PaymentRelationship payment) {
    this.payment = payment;
  }


  public TransactionRelationships checkPayment(CheckPaymentRelationship checkPayment) {
    this.checkPayment = checkPayment;
    return this;
  }

   /**
   * Get checkPayment
   * @return checkPayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckPaymentRelationship getCheckPayment() {
    return checkPayment;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckPayment(CheckPaymentRelationship checkPayment) {
    this.checkPayment = checkPayment;
  }


  public TransactionRelationships repayment(RepaymentRelationship repayment) {
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepaymentRelationship getRepayment() {
    return repayment;
  }


  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepayment(RepaymentRelationship repayment) {
    this.repayment = repayment;
  }


  public TransactionRelationships recurringPayment(RecurringPaymentRelationship recurringPayment) {
    this.recurringPayment = recurringPayment;
    return this;
  }

   /**
   * Get recurringPayment
   * @return recurringPayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringPaymentRelationship getRecurringPayment() {
    return recurringPayment;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPayment(RecurringPaymentRelationship recurringPayment) {
    this.recurringPayment = recurringPayment;
  }


  public TransactionRelationships org(OrgRelationship org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgRelationship getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrg(OrgRelationship org) {
    this.org = org;
  }


  public TransactionRelationships card(CardRelationship card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardRelationship getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(CardRelationship card) {
    this.card = card;
  }


  public TransactionRelationships incomingAch(IncomingAchRelationship incomingAch) {
    this.incomingAch = incomingAch;
    return this;
  }

   /**
   * Get incomingAch
   * @return incomingAch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCOMING_ACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IncomingAchRelationship getIncomingAch() {
    return incomingAch;
  }


  @JsonProperty(JSON_PROPERTY_INCOMING_ACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncomingAch(IncomingAchRelationship incomingAch) {
    this.incomingAch = incomingAch;
  }


  public TransactionRelationships checkDeposit(CheckDepositRelationship checkDeposit) {
    this.checkDeposit = checkDeposit;
    return this;
  }

   /**
   * Get checkDeposit
   * @return checkDeposit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckDepositRelationship getCheckDeposit() {
    return checkDeposit;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckDeposit(CheckDepositRelationship checkDeposit) {
    this.checkDeposit = checkDeposit;
  }


  public TransactionRelationships authorizationRequest(AuthorizationRequestRelationship authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
    return this;
  }

   /**
   * Get authorizationRequest
   * @return authorizationRequest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorizationRequestRelationship getAuthorizationRequest() {
    return authorizationRequest;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationRequest(AuthorizationRequestRelationship authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
  }


  public TransactionRelationships paymentAdvanceTransaction(RelatedTransaction paymentAdvanceTransaction) {
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

  public RelatedTransaction getPaymentAdvanceTransaction() {
    return paymentAdvanceTransaction;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ADVANCE_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAdvanceTransaction(RelatedTransaction paymentAdvanceTransaction) {
    this.paymentAdvanceTransaction = paymentAdvanceTransaction;
  }


  public TransactionRelationships receivedPayment(ReceivedPaymentRelationship receivedPayment) {
    this.receivedPayment = receivedPayment;
    return this;
  }

   /**
   * Get receivedPayment
   * @return receivedPayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVED_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceivedPaymentRelationship getReceivedPayment() {
    return receivedPayment;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivedPayment(ReceivedPaymentRelationship receivedPayment) {
    this.receivedPayment = receivedPayment;
  }


  public TransactionRelationships chargeback(ChargebackRelationship chargeback) {
    this.chargeback = chargeback;
    return this;
  }

   /**
   * Get chargeback
   * @return chargeback
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargebackRelationship getChargeback() {
    return chargeback;
  }


  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeback(ChargebackRelationship chargeback) {
    this.chargeback = chargeback;
  }


  public TransactionRelationships reward(RewardRelationship reward) {
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RewardRelationship getReward() {
    return reward;
  }


  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReward(RewardRelationship reward) {
    this.reward = reward;
  }


  /**
   * Return true if this transactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRelationships transactionRelationships = (TransactionRelationships) o;
    return Objects.equals(this.account, transactionRelationships.account) &&
        Objects.equals(this.receivingAccount, transactionRelationships.receivingAccount) &&
        Objects.equals(this.customer, transactionRelationships.customer) &&
        Objects.equals(this.customers, transactionRelationships.customers) &&
        Objects.equals(this.counterpartyAccount, transactionRelationships.counterpartyAccount) &&
        Objects.equals(this.counterpartyCustomer, transactionRelationships.counterpartyCustomer) &&
        Objects.equals(this.relatedTransaction, transactionRelationships.relatedTransaction) &&
        Objects.equals(this.disputedTransaction, transactionRelationships.disputedTransaction) &&
        Objects.equals(this.authorization, transactionRelationships.authorization) &&
        Objects.equals(this.returned, transactionRelationships.returned) &&
        Objects.equals(this.payment, transactionRelationships.payment) &&
        Objects.equals(this.checkPayment, transactionRelationships.checkPayment) &&
        Objects.equals(this.repayment, transactionRelationships.repayment) &&
        Objects.equals(this.recurringPayment, transactionRelationships.recurringPayment) &&
        Objects.equals(this.org, transactionRelationships.org) &&
        Objects.equals(this.card, transactionRelationships.card) &&
        Objects.equals(this.incomingAch, transactionRelationships.incomingAch) &&
        Objects.equals(this.checkDeposit, transactionRelationships.checkDeposit) &&
        Objects.equals(this.authorizationRequest, transactionRelationships.authorizationRequest) &&
        Objects.equals(this.paymentAdvanceTransaction, transactionRelationships.paymentAdvanceTransaction) &&
        Objects.equals(this.receivedPayment, transactionRelationships.receivedPayment) &&
        Objects.equals(this.chargeback, transactionRelationships.chargeback) &&
        Objects.equals(this.reward, transactionRelationships.reward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, receivingAccount, customer, customers, counterpartyAccount, counterpartyCustomer, relatedTransaction, disputedTransaction, authorization, returned, payment, checkPayment, repayment, recurringPayment, org, card, incomingAch, checkDeposit, authorizationRequest, paymentAdvanceTransaction, receivedPayment, chargeback, reward);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    receivingAccount: ").append(toIndentedString(receivingAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    counterpartyCustomer: ").append(toIndentedString(counterpartyCustomer)).append("\n");
    sb.append("    relatedTransaction: ").append(toIndentedString(relatedTransaction)).append("\n");
    sb.append("    disputedTransaction: ").append(toIndentedString(disputedTransaction)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    checkPayment: ").append(toIndentedString(checkPayment)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    incomingAch: ").append(toIndentedString(incomingAch)).append("\n");
    sb.append("    checkDeposit: ").append(toIndentedString(checkDeposit)).append("\n");
    sb.append("    authorizationRequest: ").append(toIndentedString(authorizationRequest)).append("\n");
    sb.append("    paymentAdvanceTransaction: ").append(toIndentedString(paymentAdvanceTransaction)).append("\n");
    sb.append("    receivedPayment: ").append(toIndentedString(receivedPayment)).append("\n");
    sb.append("    chargeback: ").append(toIndentedString(chargeback)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
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

    // add `receivingAccount` to the URL query string
    if (getReceivingAccount() != null) {
      joiner.add(getReceivingAccount().toUrlQueryString(prefix + "receivingAccount" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `customers` to the URL query string
    if (getCustomers() != null) {
      joiner.add(getCustomers().toUrlQueryString(prefix + "customers" + suffix));
    }

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
    }

    // add `counterpartyCustomer` to the URL query string
    if (getCounterpartyCustomer() != null) {
      joiner.add(getCounterpartyCustomer().toUrlQueryString(prefix + "counterpartyCustomer" + suffix));
    }

    // add `relatedTransaction` to the URL query string
    if (getRelatedTransaction() != null) {
      joiner.add(getRelatedTransaction().toUrlQueryString(prefix + "relatedTransaction" + suffix));
    }

    // add `disputedTransaction` to the URL query string
    if (getDisputedTransaction() != null) {
      joiner.add(getDisputedTransaction().toUrlQueryString(prefix + "disputedTransaction" + suffix));
    }

    // add `authorization` to the URL query string
    if (getAuthorization() != null) {
      joiner.add(getAuthorization().toUrlQueryString(prefix + "authorization" + suffix));
    }

    // add `returned` to the URL query string
    if (getReturned() != null) {
      joiner.add(getReturned().toUrlQueryString(prefix + "returned" + suffix));
    }

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    // add `checkPayment` to the URL query string
    if (getCheckPayment() != null) {
      joiner.add(getCheckPayment().toUrlQueryString(prefix + "checkPayment" + suffix));
    }

    // add `repayment` to the URL query string
    if (getRepayment() != null) {
      joiner.add(getRepayment().toUrlQueryString(prefix + "repayment" + suffix));
    }

    // add `recurringPayment` to the URL query string
    if (getRecurringPayment() != null) {
      joiner.add(getRecurringPayment().toUrlQueryString(prefix + "recurringPayment" + suffix));
    }

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `incomingAch` to the URL query string
    if (getIncomingAch() != null) {
      joiner.add(getIncomingAch().toUrlQueryString(prefix + "incomingAch" + suffix));
    }

    // add `checkDeposit` to the URL query string
    if (getCheckDeposit() != null) {
      joiner.add(getCheckDeposit().toUrlQueryString(prefix + "checkDeposit" + suffix));
    }

    // add `authorizationRequest` to the URL query string
    if (getAuthorizationRequest() != null) {
      joiner.add(getAuthorizationRequest().toUrlQueryString(prefix + "authorizationRequest" + suffix));
    }

    // add `paymentAdvanceTransaction` to the URL query string
    if (getPaymentAdvanceTransaction() != null) {
      joiner.add(getPaymentAdvanceTransaction().toUrlQueryString(prefix + "paymentAdvanceTransaction" + suffix));
    }

    // add `receivedPayment` to the URL query string
    if (getReceivedPayment() != null) {
      joiner.add(getReceivedPayment().toUrlQueryString(prefix + "receivedPayment" + suffix));
    }

    // add `chargeback` to the URL query string
    if (getChargeback() != null) {
      joiner.add(getChargeback().toUrlQueryString(prefix + "chargeback" + suffix));
    }

    // add `reward` to the URL query string
    if (getReward() != null) {
      joiner.add(getReward().toUrlQueryString(prefix + "reward" + suffix));
    }

    return joiner.toString();
  }
}

