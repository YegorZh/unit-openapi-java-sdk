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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.Address;

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
 * DocumentAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentAttributes {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_PASSPORT = "passport";
  @SerializedName(SERIALIZED_NAME_PASSPORT)
  private String passport;

  public static final String SERIALIZED_NAME_MATRICULA_CONSULAR = "matriculaConsular";
  @SerializedName(SERIALIZED_NAME_MATRICULA_CONSULAR)
  private String matriculaConsular;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_DATE_OF_INCORPORATION = "dateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_INCORPORATION)
  private LocalDate dateOfIncorporation;

  public static final String SERIALIZED_NAME_STATE_OF_INCORPORATION = "stateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_STATE_OF_INCORPORATION)
  private String stateOfIncorporation;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_EVALUATION_ID = "evaluationId";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ID)
  private String evaluationId;

  public static final String SERIALIZED_NAME_FRONT_DOCUMENT_ID = "frontDocumentId";
  @SerializedName(SERIALIZED_NAME_FRONT_DOCUMENT_ID)
  private String frontDocumentId;

  public static final String SERIALIZED_NAME_BACK_DOCUMENT_ID = "backDocumentId";
  @SerializedName(SERIALIZED_NAME_BACK_DOCUMENT_ID)
  private String backDocumentId;

  public static final String SERIALIZED_NAME_FRONT_DOCUMENT_STORE_ID = "frontDocumentStoreId";
  @SerializedName(SERIALIZED_NAME_FRONT_DOCUMENT_STORE_ID)
  private String frontDocumentStoreId;

  public static final String SERIALIZED_NAME_BACK_DOCUMENT_STORE_ID = "backDocumentStoreId";
  @SerializedName(SERIALIZED_NAME_BACK_DOCUMENT_STORE_ID)
  private String backDocumentStoreId;

  public DocumentAttributes() {
  }

  public DocumentAttributes documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public DocumentAttributes status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentAttributes nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public DocumentAttributes ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @javax.annotation.Nullable
  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public DocumentAttributes passport(String passport) {
    
    this.passport = passport;
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
  @javax.annotation.Nullable
  public String getPassport() {
    return passport;
  }


  public void setPassport(String passport) {
    this.passport = passport;
  }


  public DocumentAttributes matriculaConsular(String matriculaConsular) {
    
    this.matriculaConsular = matriculaConsular;
    return this;
  }

   /**
   * Get matriculaConsular
   * @return matriculaConsular
  **/
  @javax.annotation.Nullable
  public String getMatriculaConsular() {
    return matriculaConsular;
  }


  public void setMatriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
  }


  public DocumentAttributes name(String name) {
    
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


  public DocumentAttributes address(Address address) {
    
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


  public DocumentAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
    
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * Get dateOfIncorporation
   * @return dateOfIncorporation
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public DocumentAttributes stateOfIncorporation(String stateOfIncorporation) {
    
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @javax.annotation.Nullable
  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }


  public DocumentAttributes dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public DocumentAttributes ein(String ein) {
    
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @javax.annotation.Nullable
  public String getEin() {
    return ein;
  }


  public void setEin(String ein) {
    this.ein = ein;
  }


  public DocumentAttributes reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public DocumentAttributes reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public DocumentAttributes evaluationId(String evaluationId) {
    
    this.evaluationId = evaluationId;
    return this;
  }

   /**
   * Get evaluationId
   * @return evaluationId
  **/
  @javax.annotation.Nullable
  public String getEvaluationId() {
    return evaluationId;
  }


  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  public DocumentAttributes frontDocumentId(String frontDocumentId) {
    
    this.frontDocumentId = frontDocumentId;
    return this;
  }

   /**
   * Get frontDocumentId
   * @return frontDocumentId
  **/
  @javax.annotation.Nullable
  public String getFrontDocumentId() {
    return frontDocumentId;
  }


  public void setFrontDocumentId(String frontDocumentId) {
    this.frontDocumentId = frontDocumentId;
  }


  public DocumentAttributes backDocumentId(String backDocumentId) {
    
    this.backDocumentId = backDocumentId;
    return this;
  }

   /**
   * Get backDocumentId
   * @return backDocumentId
  **/
  @javax.annotation.Nullable
  public String getBackDocumentId() {
    return backDocumentId;
  }


  public void setBackDocumentId(String backDocumentId) {
    this.backDocumentId = backDocumentId;
  }


  public DocumentAttributes frontDocumentStoreId(String frontDocumentStoreId) {
    
    this.frontDocumentStoreId = frontDocumentStoreId;
    return this;
  }

   /**
   * Get frontDocumentStoreId
   * @return frontDocumentStoreId
  **/
  @javax.annotation.Nullable
  public String getFrontDocumentStoreId() {
    return frontDocumentStoreId;
  }


  public void setFrontDocumentStoreId(String frontDocumentStoreId) {
    this.frontDocumentStoreId = frontDocumentStoreId;
  }


  public DocumentAttributes backDocumentStoreId(String backDocumentStoreId) {
    
    this.backDocumentStoreId = backDocumentStoreId;
    return this;
  }

   /**
   * Get backDocumentStoreId
   * @return backDocumentStoreId
  **/
  @javax.annotation.Nullable
  public String getBackDocumentStoreId() {
    return backDocumentStoreId;
  }


  public void setBackDocumentStoreId(String backDocumentStoreId) {
    this.backDocumentStoreId = backDocumentStoreId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAttributes documentAttributes = (DocumentAttributes) o;
    return Objects.equals(this.documentType, documentAttributes.documentType) &&
        Objects.equals(this.status, documentAttributes.status) &&
        Objects.equals(this.description, documentAttributes.description) &&
        Objects.equals(this.nationality, documentAttributes.nationality) &&
        Objects.equals(this.ssn, documentAttributes.ssn) &&
        Objects.equals(this.passport, documentAttributes.passport) &&
        Objects.equals(this.matriculaConsular, documentAttributes.matriculaConsular) &&
        Objects.equals(this.name, documentAttributes.name) &&
        Objects.equals(this.address, documentAttributes.address) &&
        Objects.equals(this.dateOfIncorporation, documentAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, documentAttributes.stateOfIncorporation) &&
        Objects.equals(this.dateOfBirth, documentAttributes.dateOfBirth) &&
        Objects.equals(this.ein, documentAttributes.ein) &&
        Objects.equals(this.reasonCode, documentAttributes.reasonCode) &&
        Objects.equals(this.reason, documentAttributes.reason) &&
        Objects.equals(this.evaluationId, documentAttributes.evaluationId) &&
        Objects.equals(this.frontDocumentId, documentAttributes.frontDocumentId) &&
        Objects.equals(this.backDocumentId, documentAttributes.backDocumentId) &&
        Objects.equals(this.frontDocumentStoreId, documentAttributes.frontDocumentStoreId) &&
        Objects.equals(this.backDocumentStoreId, documentAttributes.backDocumentStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, status, description, nationality, ssn, passport, matriculaConsular, name, address, dateOfIncorporation, stateOfIncorporation, dateOfBirth, ein, reasonCode, reason, evaluationId, frontDocumentId, backDocumentId, frontDocumentStoreId, backDocumentStoreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAttributes {\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    frontDocumentId: ").append(toIndentedString(frontDocumentId)).append("\n");
    sb.append("    backDocumentId: ").append(toIndentedString(backDocumentId)).append("\n");
    sb.append("    frontDocumentStoreId: ").append(toIndentedString(frontDocumentStoreId)).append("\n");
    sb.append("    backDocumentStoreId: ").append(toIndentedString(backDocumentStoreId)).append("\n");
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
    openapiFields.add("documentType");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("nationality");
    openapiFields.add("ssn");
    openapiFields.add("passport");
    openapiFields.add("matriculaConsular");
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("dateOfIncorporation");
    openapiFields.add("stateOfIncorporation");
    openapiFields.add("dateOfBirth");
    openapiFields.add("ein");
    openapiFields.add("reasonCode");
    openapiFields.add("reason");
    openapiFields.add("evaluationId");
    openapiFields.add("frontDocumentId");
    openapiFields.add("backDocumentId");
    openapiFields.add("frontDocumentStoreId");
    openapiFields.add("backDocumentStoreId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentAttributes is not found in the empty JSON string", DocumentAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      if ((jsonObj.get("passport") != null && !jsonObj.get("passport").isJsonNull()) && !jsonObj.get("passport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport").toString()));
      }
      if ((jsonObj.get("matriculaConsular") != null && !jsonObj.get("matriculaConsular").isJsonNull()) && !jsonObj.get("matriculaConsular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matriculaConsular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matriculaConsular").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("stateOfIncorporation") != null && !jsonObj.get("stateOfIncorporation").isJsonNull()) && !jsonObj.get("stateOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOfIncorporation").toString()));
      }
      if ((jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if ((jsonObj.get("reasonCode") != null && !jsonObj.get("reasonCode").isJsonNull()) && !jsonObj.get("reasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonCode").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("evaluationId") != null && !jsonObj.get("evaluationId").isJsonNull()) && !jsonObj.get("evaluationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluationId").toString()));
      }
      if ((jsonObj.get("frontDocumentId") != null && !jsonObj.get("frontDocumentId").isJsonNull()) && !jsonObj.get("frontDocumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontDocumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frontDocumentId").toString()));
      }
      if ((jsonObj.get("backDocumentId") != null && !jsonObj.get("backDocumentId").isJsonNull()) && !jsonObj.get("backDocumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backDocumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backDocumentId").toString()));
      }
      if ((jsonObj.get("frontDocumentStoreId") != null && !jsonObj.get("frontDocumentStoreId").isJsonNull()) && !jsonObj.get("frontDocumentStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontDocumentStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frontDocumentStoreId").toString()));
      }
      if ((jsonObj.get("backDocumentStoreId") != null && !jsonObj.get("backDocumentStoreId").isJsonNull()) && !jsonObj.get("backDocumentStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backDocumentStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backDocumentStoreId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentAttributes>() {
           @Override
           public void write(JsonWriter out, DocumentAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentAttributes
  * @throws IOException if the JSON string is invalid with respect to DocumentAttributes
  */
  public static DocumentAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentAttributes.class);
  }

 /**
  * Convert an instance of DocumentAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
