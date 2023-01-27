package xml.based.configuration;

public class Architect implements EngineeringStaff {

    private String level;

    public Architect(String jobLevel) {
        level = jobLevel;
    }

    @Override
    public void role() {
        System.out.println("Architect design solutions");
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
