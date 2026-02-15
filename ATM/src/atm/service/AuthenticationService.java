package atm.service;

import atm.exception.InvalidPinException;
import atm.model.Customer;

public class AuthenticationService {

    public void authenticate(Customer customer, String inputPin) throws InvalidPinException {
        if (customer.isLocked()) {
            throw new InvalidPinException("Account is locked due to multiple invalid PIN attempts.");
        }
        if (!customer.validatePin(inputPin)) {
            throw new InvalidPinException("Invalid PIN entered.");
        }
    }
}
