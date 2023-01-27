package annotation.based.configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Developer implements EngineeringStaff {
    private List<String> skills;
    @Override
    public void role() {
        System.out.println("Developer create solutions");
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
