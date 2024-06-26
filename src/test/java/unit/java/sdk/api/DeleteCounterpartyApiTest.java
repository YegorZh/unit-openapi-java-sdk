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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DeleteCounterpartyApi
 */
@Ignore
public class DeleteCounterpartyApiTest {

    private final DeleteCounterpartyApi api = new DeleteCounterpartyApi();

    
    /**
     * Delete Counterparty by Id
     *
     * Delete Counterparty via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String counterpartyId = null;
        
        api.execute(counterpartyId);
        
        // TODO: test validations
    }
    
}
