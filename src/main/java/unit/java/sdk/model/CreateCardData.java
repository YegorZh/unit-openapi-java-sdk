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
import unit.java.sdk.model.CreateBusinessCreditCard;
import unit.java.sdk.model.CreateBusinessDebitCard;
import unit.java.sdk.model.CreateBusinessVirtualCreditCard;
import unit.java.sdk.model.CreateBusinessVirtualDebitCard;
import unit.java.sdk.model.CreateBusinessVirtualDebitCardAttributes;
import unit.java.sdk.model.CreateCardRelationships;
import unit.java.sdk.model.CreateIndividualDebitCard;
import unit.java.sdk.model.CreateIndividualVirtualDebitCard;
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
@JsonDeserialize(using = CreateCardData.CreateCardDataDeserializer.class)
@JsonSerialize(using = CreateCardData.CreateCardDataSerializer.class)
public class CreateCardData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCardData.class.getName());

    public static class CreateCardDataSerializer extends StdSerializer<CreateCardData> {
        public CreateCardDataSerializer(Class<CreateCardData> t) {
            super(t);
        }

        public CreateCardDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateCardData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateCardDataDeserializer extends StdDeserializer<CreateCardData> {
        public CreateCardDataDeserializer() {
            this(CreateCardData.class);
        }

        public CreateCardDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateCardData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateBusinessCreditCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessCreditCard.class.equals(Integer.class) || CreateBusinessCreditCard.class.equals(Long.class) || CreateBusinessCreditCard.class.equals(Float.class) || CreateBusinessCreditCard.class.equals(Double.class) || CreateBusinessCreditCard.class.equals(Boolean.class) || CreateBusinessCreditCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessCreditCard.class.equals(Integer.class) || CreateBusinessCreditCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessCreditCard.class.equals(Float.class) || CreateBusinessCreditCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessCreditCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessCreditCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessCreditCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessCreditCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessCreditCard'", e);
            }

            // deserialize CreateBusinessDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessDebitCard.class.equals(Integer.class) || CreateBusinessDebitCard.class.equals(Long.class) || CreateBusinessDebitCard.class.equals(Float.class) || CreateBusinessDebitCard.class.equals(Double.class) || CreateBusinessDebitCard.class.equals(Boolean.class) || CreateBusinessDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessDebitCard.class.equals(Integer.class) || CreateBusinessDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessDebitCard.class.equals(Float.class) || CreateBusinessDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessDebitCard'", e);
            }

            // deserialize CreateBusinessVirtualCreditCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessVirtualCreditCard.class.equals(Integer.class) || CreateBusinessVirtualCreditCard.class.equals(Long.class) || CreateBusinessVirtualCreditCard.class.equals(Float.class) || CreateBusinessVirtualCreditCard.class.equals(Double.class) || CreateBusinessVirtualCreditCard.class.equals(Boolean.class) || CreateBusinessVirtualCreditCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessVirtualCreditCard.class.equals(Integer.class) || CreateBusinessVirtualCreditCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessVirtualCreditCard.class.equals(Float.class) || CreateBusinessVirtualCreditCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessVirtualCreditCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessVirtualCreditCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessVirtualCreditCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualCreditCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualCreditCard'", e);
            }

            // deserialize CreateBusinessVirtualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessVirtualDebitCard.class.equals(Integer.class) || CreateBusinessVirtualDebitCard.class.equals(Long.class) || CreateBusinessVirtualDebitCard.class.equals(Float.class) || CreateBusinessVirtualDebitCard.class.equals(Double.class) || CreateBusinessVirtualDebitCard.class.equals(Boolean.class) || CreateBusinessVirtualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessVirtualDebitCard.class.equals(Integer.class) || CreateBusinessVirtualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessVirtualDebitCard.class.equals(Float.class) || CreateBusinessVirtualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessVirtualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessVirtualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessVirtualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualDebitCard'", e);
            }

            // deserialize CreateIndividualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateIndividualDebitCard.class.equals(Integer.class) || CreateIndividualDebitCard.class.equals(Long.class) || CreateIndividualDebitCard.class.equals(Float.class) || CreateIndividualDebitCard.class.equals(Double.class) || CreateIndividualDebitCard.class.equals(Boolean.class) || CreateIndividualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateIndividualDebitCard.class.equals(Integer.class) || CreateIndividualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateIndividualDebitCard.class.equals(Float.class) || CreateIndividualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateIndividualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateIndividualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateIndividualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateIndividualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateIndividualDebitCard'", e);
            }

            // deserialize CreateIndividualVirtualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateIndividualVirtualDebitCard.class.equals(Integer.class) || CreateIndividualVirtualDebitCard.class.equals(Long.class) || CreateIndividualVirtualDebitCard.class.equals(Float.class) || CreateIndividualVirtualDebitCard.class.equals(Double.class) || CreateIndividualVirtualDebitCard.class.equals(Boolean.class) || CreateIndividualVirtualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateIndividualVirtualDebitCard.class.equals(Integer.class) || CreateIndividualVirtualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateIndividualVirtualDebitCard.class.equals(Float.class) || CreateIndividualVirtualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateIndividualVirtualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateIndividualVirtualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateIndividualVirtualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateIndividualVirtualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateIndividualVirtualDebitCard'", e);
            }

            if (match == 1) {
                CreateCardData ret = new CreateCardData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateCardData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateCardData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateCardData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateCardData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCardData(CreateBusinessCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardData(CreateBusinessDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardData(CreateBusinessVirtualCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardData(CreateBusinessVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardData(CreateIndividualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardData(CreateIndividualVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateBusinessCreditCard", CreateBusinessCreditCard.class);
        schemas.put("CreateBusinessDebitCard", CreateBusinessDebitCard.class);
        schemas.put("CreateBusinessVirtualCreditCard", CreateBusinessVirtualCreditCard.class);
        schemas.put("CreateBusinessVirtualDebitCard", CreateBusinessVirtualDebitCard.class);
        schemas.put("CreateIndividualDebitCard", CreateIndividualDebitCard.class);
        schemas.put("CreateIndividualVirtualDebitCard", CreateIndividualVirtualDebitCard.class);
        JSON.registerDescendants(CreateCardData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateCardData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateBusinessCreditCard, CreateBusinessDebitCard, CreateBusinessVirtualCreditCard, CreateBusinessVirtualDebitCard, CreateIndividualDebitCard, CreateIndividualVirtualDebitCard
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateBusinessCreditCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessVirtualCreditCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessVirtualDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateIndividualDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateIndividualVirtualDebitCard.class, instance, new HashSet<Class<?>>())) {
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

    if (getActualInstance() instanceof CreateIndividualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateIndividualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessCreditCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessCreditCard)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateIndividualVirtualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateIndividualVirtualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessVirtualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessVirtualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessVirtualCreditCard) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessVirtualCreditCard)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

