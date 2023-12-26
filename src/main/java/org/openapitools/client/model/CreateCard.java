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
import org.openapitools.client.model.CreateBusinessCreditCard;
import org.openapitools.client.model.CreateBusinessDebitCard;
import org.openapitools.client.model.CreateBusinessVirtualCreditCard;
import org.openapitools.client.model.CreateBusinessVirtualDebitCard;
import org.openapitools.client.model.CreateBusinessVirtualDebitCardAttributes;
import org.openapitools.client.model.CreateCardRelationships;
import org.openapitools.client.model.CreateIndividualDebitCard;
import org.openapitools.client.model.CreateIndividualVirtualDebitCard;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCard extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCard.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCard.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCard' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateIndividualDebitCard> adapterCreateIndividualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(CreateIndividualDebitCard.class));
            final TypeAdapter<CreateBusinessDebitCard> adapterCreateBusinessDebitCard = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessDebitCard.class));
            final TypeAdapter<CreateBusinessCreditCard> adapterCreateBusinessCreditCard = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessCreditCard.class));
            final TypeAdapter<CreateIndividualVirtualDebitCard> adapterCreateIndividualVirtualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(CreateIndividualVirtualDebitCard.class));
            final TypeAdapter<CreateBusinessVirtualDebitCard> adapterCreateBusinessVirtualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessVirtualDebitCard.class));
            final TypeAdapter<CreateBusinessVirtualCreditCard> adapterCreateBusinessVirtualCreditCard = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessVirtualCreditCard.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateCard>() {
                @Override
                public void write(JsonWriter out, CreateCard value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateIndividualDebitCard`
                    if (value.getActualInstance() instanceof CreateIndividualDebitCard) {
                      JsonElement element = adapterCreateIndividualDebitCard.toJsonTree((CreateIndividualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateBusinessDebitCard`
                    if (value.getActualInstance() instanceof CreateBusinessDebitCard) {
                      JsonElement element = adapterCreateBusinessDebitCard.toJsonTree((CreateBusinessDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateBusinessCreditCard`
                    if (value.getActualInstance() instanceof CreateBusinessCreditCard) {
                      JsonElement element = adapterCreateBusinessCreditCard.toJsonTree((CreateBusinessCreditCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateIndividualVirtualDebitCard`
                    if (value.getActualInstance() instanceof CreateIndividualVirtualDebitCard) {
                      JsonElement element = adapterCreateIndividualVirtualDebitCard.toJsonTree((CreateIndividualVirtualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateBusinessVirtualDebitCard`
                    if (value.getActualInstance() instanceof CreateBusinessVirtualDebitCard) {
                      JsonElement element = adapterCreateBusinessVirtualDebitCard.toJsonTree((CreateBusinessVirtualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateBusinessVirtualCreditCard`
                    if (value.getActualInstance() instanceof CreateBusinessVirtualCreditCard) {
                      JsonElement element = adapterCreateBusinessVirtualCreditCard.toJsonTree((CreateBusinessVirtualCreditCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard");
                }

                @Override
                public CreateCard read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateIndividualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateIndividualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateIndividualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateIndividualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateIndividualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateIndividualDebitCard'", e);
                    }
                    // deserialize CreateBusinessDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateBusinessDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateBusinessDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateBusinessDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateBusinessDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateBusinessDebitCard'", e);
                    }
                    // deserialize CreateBusinessCreditCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateBusinessCreditCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateBusinessCreditCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateBusinessCreditCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateBusinessCreditCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateBusinessCreditCard'", e);
                    }
                    // deserialize CreateIndividualVirtualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateIndividualVirtualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateIndividualVirtualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateIndividualVirtualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateIndividualVirtualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateIndividualVirtualDebitCard'", e);
                    }
                    // deserialize CreateBusinessVirtualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateBusinessVirtualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateBusinessVirtualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateBusinessVirtualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualDebitCard'", e);
                    }
                    // deserialize CreateBusinessVirtualCreditCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateBusinessVirtualCreditCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateBusinessVirtualCreditCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualCreditCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateBusinessVirtualCreditCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualCreditCard'", e);
                    }

                    if (match == 1) {
                        CreateCard ret = new CreateCard();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateCard: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateCard() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCard(CreateBusinessCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCard(CreateBusinessDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCard(CreateBusinessVirtualCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCard(CreateBusinessVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCard(CreateIndividualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCard(CreateIndividualVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateIndividualDebitCard", CreateIndividualDebitCard.class);
        schemas.put("CreateBusinessDebitCard", CreateBusinessDebitCard.class);
        schemas.put("CreateBusinessCreditCard", CreateBusinessCreditCard.class);
        schemas.put("CreateIndividualVirtualDebitCard", CreateIndividualVirtualDebitCard.class);
        schemas.put("CreateBusinessVirtualDebitCard", CreateBusinessVirtualDebitCard.class);
        schemas.put("CreateBusinessVirtualCreditCard", CreateBusinessVirtualCreditCard.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateCard.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateIndividualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateBusinessDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateBusinessCreditCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateIndividualVirtualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateBusinessVirtualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateBusinessVirtualCreditCard) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard
     *
     * @return The actual instance (CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateIndividualDebitCard`. If the actual instance is not `CreateIndividualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualDebitCard`
     * @throws ClassCastException if the instance is not `CreateIndividualDebitCard`
     */
    public CreateIndividualDebitCard getCreateIndividualDebitCard() throws ClassCastException {
        return (CreateIndividualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateBusinessDebitCard`. If the actual instance is not `CreateBusinessDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessDebitCard`
     * @throws ClassCastException if the instance is not `CreateBusinessDebitCard`
     */
    public CreateBusinessDebitCard getCreateBusinessDebitCard() throws ClassCastException {
        return (CreateBusinessDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateBusinessCreditCard`. If the actual instance is not `CreateBusinessCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessCreditCard`
     * @throws ClassCastException if the instance is not `CreateBusinessCreditCard`
     */
    public CreateBusinessCreditCard getCreateBusinessCreditCard() throws ClassCastException {
        return (CreateBusinessCreditCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateIndividualVirtualDebitCard`. If the actual instance is not `CreateIndividualVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualVirtualDebitCard`
     * @throws ClassCastException if the instance is not `CreateIndividualVirtualDebitCard`
     */
    public CreateIndividualVirtualDebitCard getCreateIndividualVirtualDebitCard() throws ClassCastException {
        return (CreateIndividualVirtualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateBusinessVirtualDebitCard`. If the actual instance is not `CreateBusinessVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessVirtualDebitCard`
     * @throws ClassCastException if the instance is not `CreateBusinessVirtualDebitCard`
     */
    public CreateBusinessVirtualDebitCard getCreateBusinessVirtualDebitCard() throws ClassCastException {
        return (CreateBusinessVirtualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateBusinessVirtualCreditCard`. If the actual instance is not `CreateBusinessVirtualCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessVirtualCreditCard`
     * @throws ClassCastException if the instance is not `CreateBusinessVirtualCreditCard`
     */
    public CreateBusinessVirtualCreditCard getCreateBusinessVirtualCreditCard() throws ClassCastException {
        return (CreateBusinessVirtualCreditCard)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateIndividualDebitCard
    try {
      CreateIndividualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateIndividualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateBusinessDebitCard
    try {
      CreateBusinessDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateBusinessDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateBusinessCreditCard
    try {
      CreateBusinessCreditCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateBusinessCreditCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateIndividualVirtualDebitCard
    try {
      CreateIndividualVirtualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateIndividualVirtualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateBusinessVirtualDebitCard
    try {
      CreateBusinessVirtualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateBusinessVirtualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateBusinessVirtualCreditCard
    try {
      CreateBusinessVirtualCreditCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateBusinessVirtualCreditCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateCard with oneOf schemas: CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CreateCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCard
  * @throws IOException if the JSON string is invalid with respect to CreateCard
  */
  public static CreateCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCard.class);
  }

 /**
  * Convert an instance of CreateCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
