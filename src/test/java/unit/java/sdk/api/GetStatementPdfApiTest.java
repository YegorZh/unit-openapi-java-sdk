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
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetStatementPdfApi
 */
@Ignore
public class GetStatementPdfApiTest {

    private final GetStatementPdfApi api = new GetStatementPdfApi();

    
    /**
     * Get PDF Statement by Id
     *
     * Get a PDF Statement from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String statementId = null;
        File response = 
        api.execute(statementId);
        
        // TODO: test validations
    }
    
}
