package annotation.based.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "annotation.based.configuration")
public class SpringConfig {
//    @Bean
//    public Developer developer(){
//        return new Developer();
//    }
}
