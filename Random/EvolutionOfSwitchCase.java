public class EvolutionOfSwitchCase {
    public static void main(String[] args) {
        // Java 7 : Switch Statement
        // Until Java 7 only integers could be used in switch case and this had been the standard for a long time:

        int value = 5;
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Unknown");
        }

        //Java 8 : Switch Statement
        // In Java 8 strings & enum were introduced in case values and switch statements started to evolve

        // String Switch Case :

        String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("Week day");
                break;
            case "Tuesday":
                System.out.println("Week day");
                break;
            case "Wednesday":
                System.out.println("Week day");
                break;
            case "Thursday":
                System.out.println("Week day");
                break;
            case "Friday":
                System.out.println("Week day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }
        //Enum Switch Case

        enum DAYS {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        DAYS days = DAYS.SUNDAY;
        switch (days) {
            case MONDAY:
                System.out.println("Weekdays");
                break;
            case TUESDAY:
                System.out.println("Weekdays");
                break;
            case WEDNESDAY:
                System.out.println("Weekdays");
                break;
            case THURSDAY:
                System.out.println("Weekdays");
                break;
            case FRIDAY:
                System.out.println("Weekdays");
                break;
            case SATURDAY:
                System.out.println("Weekends");
                break;
            case SUNDAY:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Unknown");
        }

        // ------------------------------------------------------------------------ //
        /**
         *  Java 17 : Switch Statement / Expression :
            Java 17 LTS is the latest long-term support release for the Java SE platform and it was released on September 15, 2021.

            Switch expression features

            Pattern matching
            Gaurded pattern
            Null cases
         */
        // features introduced till now- multiple lables for a case, return the value using -> (w/o break or yield)
        String dayOfTheWeek = "Saturday";
        String res = switch(dayOfTheWeek) {
            case "Sunday", "Saturday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekdays";
            default -> "Not a week day!";
        };
        System.out.println("Java 17 - Switch Result: " + res);

        // Pattern matching
        // Gaurded Pattern
        // Null Checker
        /*
        Gaurded Patterns :
            Let’s take this use case.

            Inside the case label where I have checked for a “Employee” instance , I want to do an additional check.

            Thinking traditionally , you could be doing this after the case statement.

            Something like this:

            case Employee emp:

            if(emp.getDept().equals("IT")) {

            yield "This is IT Employee";

            }

            But Java 17 has introduced “Guarded Patterns” . You can do this check in the case label itself like below

            return switch (obj) {
                case Integer i -> "It is an integer";
                case String s -> "It is a string";
                case Employee employee && employee.getDept().equals("IT") -> "IT Employee";
                default -> "It is none of the known data types";
            };
        Null Cases :
            You could never pass a null value to switch statements prior to Java 17 without a Null pointer exception being thrown.

            Java 17 allows you to handle it this way

            case null -> "It is a null object";

            If you have the above switch expression you will never get Null Pointer exception if the object you pass is null.
         */

    }
    // static double getDoubleUsingSwitch(Object o) {
    //     return switch (o) {
    //         case Integer i -> i.doubleValue();
    //         case Float f -> f.doubleValue();
    //         case String s -> Double.parseDouble(s);
    //         default -> 0d;
    //     };
    // }
}
