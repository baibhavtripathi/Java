package autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service(value = "customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerLoginServiceImpl.class);
    /**
     * @param customerLoginDTO
     * @return String status message
     * @throws CustomerLoginException
     */
    @Autowired
    private CustomerLoginRepository customerLoginRepository;
    @Override
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws CustomerLoginException {
        CustomerLoginDTO customerLoginFetched =
                customerLoginRepository.getCustomerLoginByLoginName(customerLogin.getLoginName());
        if (Objects.equals(customerLogin.getPassword(), customerLoginFetched.getPassword()))
            return "SUCCESS";
        LOGGER.error("Service.WRONG_CREDENTIALS");
        throw new CustomerLoginException("Service.WRONG_CREDENTIALS");
    }
}
