package xml.based.configuration;

import java.util.List;

public class Developer implements EngineeringStaff{
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
