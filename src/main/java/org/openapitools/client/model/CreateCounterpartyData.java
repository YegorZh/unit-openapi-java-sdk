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
import org.openapitools.client.model.CreateAchCounterparty;
import org.openapitools.client.model.CreateCounterpartyRelationships;
import org.openapitools.client.model.CreatePlaidCounterparty;
import org.openapitools.client.model.CreatePlaidCounterpartyAttributes;



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
public class CreateCounterpartyData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCounterpartyData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateCounterpartyData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateCounterpartyData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateAchCounterparty> adapterCreateAchCounterparty = gson.getDelegateAdapter(this, TypeToken.get(CreateAchCounterparty.class));
            final TypeAdapter<CreatePlaidCounterparty> adapterCreatePlaidCounterparty = gson.getDelegateAdapter(this, TypeToken.get(CreatePlaidCounterparty.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateCounterpartyData>() {
                @Override
                public void write(JsonWriter out, CreateCounterpartyData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateAchCounterparty`
                    if (value.getActualInstance() instanceof CreateAchCounterparty) {
                      JsonElement element = adapterCreateAchCounterparty.toJsonTree((CreateAchCounterparty)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreatePlaidCounterparty`
                    if (value.getActualInstance() instanceof CreatePlaidCounterparty) {
                      JsonElement element = adapterCreatePlaidCounterparty.toJsonTree((CreatePlaidCounterparty)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateAchCounterparty, CreatePlaidCounterparty");
                }

                @Override
                public CreateCounterpartyData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateAchCounterparty
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateAchCounterparty.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateAchCounterparty;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateAchCounterparty'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateAchCounterparty failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateAchCounterparty'", e);
                    }
                    // deserialize CreatePlaidCounterparty
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreatePlaidCounterparty.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreatePlaidCounterparty;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreatePlaidCounterparty'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreatePlaidCounterparty failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreatePlaidCounterparty'", e);
                    }

                    if (match == 1) {
                        CreateCounterpartyData ret = new CreateCounterpartyData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateCounterpartyData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateCounterpartyData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCounterpartyData(CreateAchCounterparty o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCounterpartyData(CreatePlaidCounterparty o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateAchCounterparty", CreateAchCounterparty.class);
        schemas.put("CreatePlaidCounterparty", CreatePlaidCounterparty.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateCounterpartyData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateAchCounterparty, CreatePlaidCounterparty
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateAchCounterparty) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreatePlaidCounterparty) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateAchCounterparty, CreatePlaidCounterparty");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateAchCounterparty, CreatePlaidCounterparty
     *
     * @return The actual instance (CreateAchCounterparty, CreatePlaidCounterparty)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateAchCounterparty`. If the actual instance is not `CreateAchCounterparty`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateAchCounterparty`
     * @throws ClassCastException if the instance is not `CreateAchCounterparty`
     */
    public CreateAchCounterparty getCreateAchCounterparty() throws ClassCastException {
        return (CreateAchCounterparty)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreatePlaidCounterparty`. If the actual instance is not `CreatePlaidCounterparty`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePlaidCounterparty`
     * @throws ClassCastException if the instance is not `CreatePlaidCounterparty`
     */
    public CreatePlaidCounterparty getCreatePlaidCounterparty() throws ClassCastException {
        return (CreatePlaidCounterparty)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCounterpartyData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateAchCounterparty
    try {
      CreateAchCounterparty.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateAchCounterparty failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreatePlaidCounterparty
    try {
      CreatePlaidCounterparty.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreatePlaidCounterparty failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateCounterpartyData with oneOf schemas: CreateAchCounterparty, CreatePlaidCounterparty. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CreateCounterpartyData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCounterpartyData
  * @throws IOException if the JSON string is invalid with respect to CreateCounterpartyData
  */
  public static CreateCounterpartyData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCounterpartyData.class);
  }

 /**
  * Convert an instance of CreateCounterpartyData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
