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
import unit.java.sdk.model.CreateBusinessApplication;
import unit.java.sdk.model.CreateIndividualApplication;
import unit.java.sdk.model.CreateSoleProprietorApplication;
import unit.java.sdk.model.CreateTrustApplication;
import unit.java.sdk.model.CreateTrustApplicationAttributes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import unit.java.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = CreateApplicationData.CreateApplicationDataDeserializer.class)
@JsonSerialize(using = CreateApplicationData.CreateApplicationDataSerializer.class)
public class CreateApplicationData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateApplicationData.class.getName());

    public static class CreateApplicationDataSerializer extends StdSerializer<CreateApplicationData> {
        public CreateApplicationDataSerializer(Class<CreateApplicationData> t) {
            super(t);
        }

        public CreateApplicationDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateApplicationData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateApplicationDataDeserializer extends StdDeserializer<CreateApplicationData> {
        public CreateApplicationDataDeserializer() {
            this(CreateApplicationData.class);
        }

        public CreateApplicationDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateApplicationData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateBusinessApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessApplication.class.equals(Integer.class) || CreateBusinessApplication.class.equals(Long.class) || CreateBusinessApplication.class.equals(Float.class) || CreateBusinessApplication.class.equals(Double.class) || CreateBusinessApplication.class.equals(Boolean.class) || CreateBusinessApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessApplication.class.equals(Integer.class) || CreateBusinessApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessApplication.class.equals(Float.class) || CreateBusinessApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessApplication'", e);
            }

            // deserialize CreateIndividualApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateIndividualApplication.class.equals(Integer.class) || CreateIndividualApplication.class.equals(Long.class) || CreateIndividualApplication.class.equals(Float.class) || CreateIndividualApplication.class.equals(Double.class) || CreateIndividualApplication.class.equals(Boolean.class) || CreateIndividualApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateIndividualApplication.class.equals(Integer.class) || CreateIndividualApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateIndividualApplication.class.equals(Float.class) || CreateIndividualApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateIndividualApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateIndividualApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateIndividualApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateIndividualApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateIndividualApplication'", e);
            }

            // deserialize CreateSoleProprietorApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateSoleProprietorApplication.class.equals(Integer.class) || CreateSoleProprietorApplication.class.equals(Long.class) || CreateSoleProprietorApplication.class.equals(Float.class) || CreateSoleProprietorApplication.class.equals(Double.class) || CreateSoleProprietorApplication.class.equals(Boolean.class) || CreateSoleProprietorApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateSoleProprietorApplication.class.equals(Integer.class) || CreateSoleProprietorApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateSoleProprietorApplication.class.equals(Float.class) || CreateSoleProprietorApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateSoleProprietorApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateSoleProprietorApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateSoleProprietorApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateSoleProprietorApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateSoleProprietorApplication'", e);
            }

            // deserialize CreateTrustApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateTrustApplication.class.equals(Integer.class) || CreateTrustApplication.class.equals(Long.class) || CreateTrustApplication.class.equals(Float.class) || CreateTrustApplication.class.equals(Double.class) || CreateTrustApplication.class.equals(Boolean.class) || CreateTrustApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateTrustApplication.class.equals(Integer.class) || CreateTrustApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateTrustApplication.class.equals(Float.class) || CreateTrustApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateTrustApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateTrustApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateTrustApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateTrustApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateTrustApplication'", e);
            }

            if (match == 1) {
                CreateApplicationData ret = new CreateApplicationData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateApplicationData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateApplicationData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateApplicationData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateApplicationData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateApplicationData(CreateBusinessApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateIndividualApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateSoleProprietorApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateTrustApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateBusinessApplication", CreateBusinessApplication.class);
        schemas.put("CreateIndividualApplication", CreateIndividualApplication.class);
        schemas.put("CreateSoleProprietorApplication", CreateSoleProprietorApplication.class);
        schemas.put("CreateTrustApplication", CreateTrustApplication.class);
        JSON.registerDescendants(CreateApplicationData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateApplicationData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateBusinessApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateIndividualApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateSoleProprietorApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateTrustApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication
     *
     * @return The actual instance (CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBusinessApplication`. If the actual instance is not `CreateBusinessApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessApplication`
     * @throws ClassCastException if the instance is not `CreateBusinessApplication`
     */
    public CreateBusinessApplication getCreateBusinessApplication() throws ClassCastException {
        return (CreateBusinessApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateIndividualApplication`. If the actual instance is not `CreateIndividualApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualApplication`
     * @throws ClassCastException if the instance is not `CreateIndividualApplication`
     */
    public CreateIndividualApplication getCreateIndividualApplication() throws ClassCastException {
        return (CreateIndividualApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateSoleProprietorApplication`. If the actual instance is not `CreateSoleProprietorApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSoleProprietorApplication`
     * @throws ClassCastException if the instance is not `CreateSoleProprietorApplication`
     */
    public CreateSoleProprietorApplication getCreateSoleProprietorApplication() throws ClassCastException {
        return (CreateSoleProprietorApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateTrustApplication`. If the actual instance is not `CreateTrustApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTrustApplication`
     * @throws ClassCastException if the instance is not `CreateTrustApplication`
     */
    public CreateTrustApplication getCreateTrustApplication() throws ClassCastException {
        return (CreateTrustApplication)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateIndividualApplication) {
        if (getActualInstance() != null) {
          joiner.add(((CreateIndividualApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateSoleProprietorApplication) {
        if (getActualInstance() != null) {
          joiner.add(((CreateSoleProprietorApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessApplication) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateTrustApplication) {
        if (getActualInstance() != null) {
          joiner.add(((CreateTrustApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

