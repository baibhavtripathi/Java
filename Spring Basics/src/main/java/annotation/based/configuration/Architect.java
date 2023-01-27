package annotation.based.configuration;

import org.springframework.stereotype.Component;

@Component
public class Architect implements EngineeringStaff {

    @Override
    public void role() {
        System.out.println("Architect design solutions");
    }
}
