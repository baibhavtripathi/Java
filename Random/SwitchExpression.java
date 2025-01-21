public class SwitchExpression {
    public static void main(String[] args) {
        /*
         * Until Java 7 only integers could be used in switch case.
         * In Java 8 strings & enum were introduced in case values.
         * In Java 12, switch expression was introduced. 
         * In Java 14, switch expression was enhanced. 
         */
        String Day = "Monday";
        // Old way of Switch Statement - String Switch Case :
        switch(Day) {
            case "Monday":
                System.out.println("First Day of the Week");
                break;
            case "Tuesday":
                System.out.println("Second Day of the Week");
                break;
            case "Wednesday":
                System.out.println("Third Day of the Week");
                break;
            case "Thursday":
                System.out.println("Fourth Day of the Week");
                break;
            case "Friday":
                System.out.println("Fifth Day of the Week");
                break;
            case "Saturday":
                System.out.println("Sixth Day of the Week");
                break;
            case "Sunday":
                System.out.println("Seventh Day of the Week");
                break;
            default:
                System.out.println("Not valid day.");
        }

        // Old way of Switch Statement - Enum Switch Case :
        enum Month {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
        }
        Month month = Month.JAN;
        switch (month) {
            case Month.JAN:
                System.out.println("It's January");
                break;
            case Month.FEB:
                System.out.println("It's February");
                break;
            case Month.MAR:
                System.out.println("It's March");
                break;
            case Month.APR:
                System.out.println("It's April");
                break;
            case Month.MAY:
                System.out.println("It's May");
                break;
            case Month.JUN:
                System.out.println("It's June");
                break;
            case Month.JUL:
                System.out.println("It's July");
                break;
            case Month.AUG:
                System.out.println("It's August");
                break;
            case Month.SEP:
                System.out.println("It's September");
                break;
            case Month.OCT:
                System.out.println("It's October");
                break;
            case Month.NOV:
                System.out.println("It's November");
                break;
            case Month.DEC:
                System.out.println("It's December");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }


        // New way of Switch expression
        String res = switch (Day) {
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
