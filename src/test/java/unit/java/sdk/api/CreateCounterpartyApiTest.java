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


package unit.java.sdk.api;

import unit.java.sdk.ApiException;
import unit.java.sdk.model.CreateCounterparty;
import unit.java.sdk.model.UnitCounterpartyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CreateCounterpartyApi
 */
@Ignore
public class CreateCounterpartyApiTest {

    private final CreateCounterpartyApi api = new CreateCounterpartyApi();

    
    /**
     * Create Counterparty
     *
     * Create a counterparty via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        CreateCounterparty createCounterparty = null;
        UnitCounterpartyResponse response = 
        api.execute(createCounterparty);
        
        // TODO: test validations
    }
    
}
