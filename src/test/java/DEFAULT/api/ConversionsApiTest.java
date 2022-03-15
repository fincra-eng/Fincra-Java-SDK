package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversionsApi
 */
public class ConversionsApiTest {

    private final ConversionsApi api = new ConversionsApi();

    
    /**
     * Get a conversion
     *
     * This endpoint fetches a specific conversion performed by a business. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getaconversionTest() throws ApiException {
        String conversionId = null;
        // api.getaconversion(conversionId);

        // TODO: test validations
    }
    
    /**
     * Get all conversions
     *
     * This endpoint provides a list of all conversions performed by a business. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getallconversionsTest() throws ApiException {
        String businessId = null;
        // api.getallconversions(businessId);

        // TODO: test validations
    }
    
    /**
     * Initiate a conversion
     *
     * This endpoint provides information on the conversion rate between two currencies e.g NGN to USD     REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | business | string | This could be the ID of the business or the ID of a sub-account of the businessRequired | | quoteReference | string | To get a quote reference, you will need to call the generate quote endpoint Required |  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateaconversionTest() throws ApiException {
        // api.initiateaconversion();

        // TODO: test validations
    }
    
}
