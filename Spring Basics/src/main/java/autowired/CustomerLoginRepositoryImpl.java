package autowired;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository(value = "customerLoginRepository")
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {
    /**
     * @param loginName username
     * @return CustomerLoginDTO obj
     */
    @Override
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
        Map<String, String> customerCredentials =
                Map.of("Alex","123", "Bob", "456");
        CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
        customerLoginDTO.setLoginName(loginName);
        customerLoginDTO.setPassword(customerCredentials.get(loginName));
        return customerLoginDTO;
    }
}
