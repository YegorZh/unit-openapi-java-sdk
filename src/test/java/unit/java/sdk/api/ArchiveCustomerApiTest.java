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
import unit.java.sdk.model.ArchiveCustomerRequest;
import unit.java.sdk.model.UnitCustomerResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ArchiveCustomerApi
 */
@Ignore
public class ArchiveCustomerApiTest {

    private final ArchiveCustomerApi api = new ArchiveCustomerApi();

    
    /**
     * Archive Customer by Id
     *
     * Archive a Customer via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String customerId = null;
        ArchiveCustomerRequest archiveCustomerRequest = null;
        UnitCustomerResponse response = 
        api.execute(customerId, archiveCustomerRequest);
        
        // TODO: test validations
    }
    
}
