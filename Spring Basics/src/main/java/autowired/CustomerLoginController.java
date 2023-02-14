package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerLoginController {
    @Autowired private CustomerLoginService service;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws CustomerLoginException {
        return service.authenticateCustomer(customerLogin);
    }
}
