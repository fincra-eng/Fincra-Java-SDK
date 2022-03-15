package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
public class WalletsApiTest {

    private final WalletsApi api = new WalletsApi();

    
    /**
     * Get all the wallets for a Business
     *
     * This endpoints lists all wallets belonging to a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getallthewalletsforaBusinessTest() throws ApiException {
        String businessID = null;
        // api.getallthewalletsforaBusiness(businessID);

        // TODO: test validations
    }
    
    /**
     * Get a wallet
     *
     * This endpoint provides the information regarding a specific wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getawalletTest() throws ApiException {
        String walletID = null;
        // api.getawallet(walletID);

        // TODO: test validations
    }
    
}
