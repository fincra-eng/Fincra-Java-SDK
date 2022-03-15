package DEFAULT.api;

import DEFAULT.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResolveApi
 */
public class ResolveApiTest {

    private final ResolveApi api = new ResolveApi();

    
    /**
     * Resolve Bank Account
     *
     * This endpoint resolves bank account information based the account number and bank code provided. This is only valid for Nigerian bank accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveBankAccountTest() throws ApiException {
        // api.resolveBankAccount();

        // TODO: test validations
    }
    
}
