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
import unit.java.sdk.model.ExecuteFilterParameter10;
import unit.java.sdk.model.ListPageParametersObject;
import unit.java.sdk.model.UnitStatementsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListStatementsApi
 */
@Ignore
public class GetListStatementsApiTest {

    private final GetListStatementsApi api = new GetListStatementsApi();

    
    /**
     * Get List Statements
     *
     * Get List Statements from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ListPageParametersObject page = null;
        ExecuteFilterParameter10 filter = null;
        String sort = null;
        UnitStatementsResponse response = 
        api.execute(page, filter, sort);
        
        // TODO: test validations
    }
    
}
