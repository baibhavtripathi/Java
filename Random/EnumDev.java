enum Level { LOW, MID, HIGH}


public class EnumDev {
    public static void main(String[] args) {
        System.out.println(Level.LOW.ordinal());

        for (Level lev : Level.values()) {
            System.out.println(lev);
        }

        Level levelObject = Level.HIGH;

        String res = switch(levelObject) {
            case LOW -> "Low Level";
            case MID -> "Mid Level";
            case HIGH -> "High Level";
            default -> "Invalid Level";
        };

        System.out.println(res);
    }
}
