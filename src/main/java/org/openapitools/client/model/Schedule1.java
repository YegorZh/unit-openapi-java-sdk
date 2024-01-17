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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.MonthlySchedule;



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
public class Schedule1 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Schedule1.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Schedule1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Schedule1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MonthlySchedule> adapterMonthlySchedule = gson.getDelegateAdapter(this, TypeToken.get(MonthlySchedule.class));

            return (TypeAdapter<T>) new TypeAdapter<Schedule1>() {
                @Override
                public void write(JsonWriter out, Schedule1 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MonthlySchedule`
                    if (value.getActualInstance() instanceof MonthlySchedule) {
                      JsonElement element = adapterMonthlySchedule.toJsonTree((MonthlySchedule)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MonthlySchedule");
                }

                @Override
                public Schedule1 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MonthlySchedule
                    try {
                      // validate the JSON object to see if any exception is thrown
                      MonthlySchedule.validateJsonElement(jsonElement);
                      actualAdapter = adapterMonthlySchedule;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'MonthlySchedule'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for MonthlySchedule failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'MonthlySchedule'", e);
                    }

                    if (match == 1) {
                        Schedule1 ret = new Schedule1();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Schedule1: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Schedule1() {
        super("oneOf", Boolean.FALSE);
    }

    public Schedule1(MonthlySchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MonthlySchedule", MonthlySchedule.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Schedule1.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MonthlySchedule
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MonthlySchedule) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MonthlySchedule");
    }

    /**
     * Get the actual instance, which can be the following:
     * MonthlySchedule
     *
     * @return The actual instance (MonthlySchedule)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MonthlySchedule`. If the actual instance is not `MonthlySchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MonthlySchedule`
     * @throws ClassCastException if the instance is not `MonthlySchedule`
     */
    public MonthlySchedule getMonthlySchedule() throws ClassCastException {
        return (MonthlySchedule)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedule1
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with MonthlySchedule
    try {
      MonthlySchedule.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MonthlySchedule failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Schedule1 with oneOf schemas: MonthlySchedule. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of Schedule1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedule1
  * @throws IOException if the JSON string is invalid with respect to Schedule1
  */
  public static Schedule1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedule1.class);
  }

 /**
  * Convert an instance of Schedule1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

