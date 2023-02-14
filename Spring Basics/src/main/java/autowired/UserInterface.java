package autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class UserInterface {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserInterface.class);

    public static void main(String[] args) {
        Environment env = null;
        ApplicationContext applicationContext;
        try {
            applicationContext = new AnnotationConfigApplicationContext(AutowiredAnnotationConfiguration.class);
            env = applicationContext.getEnvironment();
            CustomerLoginController controller = applicationContext.getBean(CustomerLoginController.class);
            CustomerLoginDTO customerLogin = new CustomerLoginDTO();
            customerLogin.setLoginName("Alex");
            customerLogin.setPassword("123");

            controller.authenticateCustomer(customerLogin);
            LOGGER.info(env.getProperty("SUCCESS"));
        } catch (CustomerLoginException exception) {
            LOGGER.error(env.getProperty(exception.getMessage()));
        }
    }
}
