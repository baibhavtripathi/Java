public class SwitchExpression {
    public static void main(String[] args) {
        String Days = "Monday";
        String res = switch (Days) {
            case "Monday" -> "First Day of the Week";
            case "Tuesday" -> "Second Day of the Week";
            case "Wednesday" -> "Third Day of the Week";
            case "Thursday" -> "Fourth Day of the Week";
            case "Friday" -> "Fifth Day of the Week";
            case "Saturday" -> "Sixth Day of the Week";
            case "Sunday" -> "Seventh Day of the Week";
            default -> "Invalid Day";
        };
    }
}
