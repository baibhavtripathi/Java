public class SwitchExpression {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday" -> System.out.println("First day of the week");
            case "Tuesday" -> System.out.println("Second day of the week");
            case "Wednesday" -> System.out.println("Third day of the week");
            case "Thursday" -> System.out.println("Fourth day of the week");
            case "Friday" -> System.out.println("Fifth day of the week");
            case "Saturday" -> System.out.println("Sixth day of the week");
            case "Sunday" -> System.out.println("Seventh day of the week");
            default -> System.out.println("Invalid day");
        }
    }
}
