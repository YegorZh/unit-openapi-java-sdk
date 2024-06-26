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
import unit.java.sdk.model.FreezeAccountRequest;
import unit.java.sdk.model.UnitAccountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for FreezeAnAccountApi
 */
@Ignore
public class FreezeAnAccountApiTest {

    private final FreezeAnAccountApi api = new FreezeAnAccountApi();

    
    /**
     * Freeze Account by Id
     *
     * Freeze Account via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String accountId = null;
        FreezeAccountRequest freezeAccountRequest = null;
        UnitAccountResponse response = 
        api.execute(accountId, freezeAccountRequest);
        
        // TODO: test validations
    }
    
}
