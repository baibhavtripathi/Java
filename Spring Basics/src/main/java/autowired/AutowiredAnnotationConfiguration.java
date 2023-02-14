package autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:messages.properties")
@ComponentScan(basePackages = "autowired")
public class AutowiredAnnotationConfiguration {

}
