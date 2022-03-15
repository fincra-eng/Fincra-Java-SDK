package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuotesApi
 */
public class QuotesApiTest {

    private final QuotesApi api = new QuotesApi();

    
    /**
     * Get a quote
     *
     * This endpoint is used for generating a quote.  REQUEST BODY   | Field | Data Type | Description | |------| ------------- | ----------- | | sourceCurrency | string | e.g _USD_ required| | destinationCurrency | string |  e.g _NGN_ required| | amount | string | required| | action | string | the values can be either \&quot;_send_\&quot; for conversions and disbursement or \&quot;_receive_\&quot; for collectionsrequired| | transactionType | string | the values here can be either _disbursement_ or _collection_ or _conversion_required | | business | string | This could be the ID of the business or the ID of a sub-account of the business required| | feeBearer | string | required  | | paymentDestination | string | See the note below | | paymentMethod | string | see the note below | | destinationCountry | string | This is the location where the money would be received required | | paymentScheme | string | This is the valid payment scheme for the destination currency you want to generate a quote for.Payment scheme is required for USD,EUR and GBP |  NOTE  If destination currency is either USD,EUR,GBP a payment scheme is required .  The values of the _paymentDestination_ and _paymentMethod_ are either required or optional depending on the value of the _transactiontype_ field.  When the value of the the _transactiontype_ field is _disbursement_, We will then have the below fields as: *   paymentDestination required *   paymentMethod optional   When the value of the the _transactiontype_ field is _conversion_, We will then have the below fields as: *   paymentDestination optional *   paymentMethod optional  When the value of the the _transactiontype_ field is _collection_, We will then have the below fields as: *   paymentDestination required *   paymentMethod required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getaquoteTest() throws ApiException {
        // api.getaquote();

        // TODO: test validations
    }
    
}
