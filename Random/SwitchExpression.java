import java.time.Month;

public class SwitchExpression {
    enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }
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

        // introduced switch expression in Java 
        /*
         * You can return values from a switch block and hence switch statements became switch expressions
         * You can have multiple values in a case label
         * You can return value from a switch expression through the arrow operator or through the “break” keyword
         * ERROR: Mixing of '->' and ':' case statement styles is not allowed within a switch
         */
        System.out.println(  switch(Day) {
            case "Monday":
                yield "It's Monday";
            case "Tuesday":
                yield "Second Day of the Week";
            case "Wednesday":
                yield "Third Day of the Week";
            case "Thursday":
                yield "Fourth Day of the Week";
            case "Friday":
                yield "Fifth Day of the Week";
            case "Saturday":
                yield "Sixth Day of the Week";
            case "Sunday":
                yield "Seventh Day of the Week";
            default:
                yield "Invalid Day";
        });
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

        // Multiple case labels :
        String whatDayItIs = switch (Day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(whatDayItIs);

        /*
         * Java 17 introduced -
         * Switch expression features
            1. Pattern matching
            2. Gaurded pattern
            3. Null cases
         */

        // Pattern Matching
        Object obj = "Hello";
        String patternMatchingSwitchResult = switch (obj) {
            case String s -> s + ": It's a String";
            case Integer i -> "It's an Integer";
            default -> "It's neither a String nor an Integer";
        };
        System.out.println(patternMatchingSwitchResult);
        System.out.println(getDoubleUsingSwitch(10));
        // Guarded Pattern
        
        // System.out.println(getDoubleValueUsingGuardedPatterns(
        //     "10.5"
        // ));
        // String guardedPatternSwitchExpResult = switch (obj) {
        //     case String s && s.equals("Hello") -> s + ": It's a String";
        //     case Integer i -> "It's an Integer";
        //     default -> "It's neither!";
        // };
        // System.out.println(gaurdedPatternSwitchExpResult);

        // Null cases
        // case null -> "It is a null object";
        // case null is not allowed for Enums Switch. As we can't have null in Enums.

        switch (null) {
            case null -> System.out.println("It is a null object");
            default -> System.out.println("It is not a null object");
        };
        

        /*Ordering Subclasses
            When using subclasses with pattern matching in switch, the order of the cases matters.
            Let’s consider an example where the String case comes after the CharSequence case.
        */
        Object obj1 = "10.5";
        double convertStringToDouble = switch (obj1) {
                case CharSequence c -> Double.parseDouble(c.toString());
                case String s -> Double.parseDouble(s);
                default -> 0d;
        };
        System.out.println(convertStringToDouble);

        // Since String is a subclass of CharSequence, our example will result in the following compilation error:
        /*
            [ERROR] Failed to execute goal ... on project core-java-17: Compilation failure
            [ERROR] /D:/Projects/.../HandlingNullValuesUnitTest.java:[12,18] this case label is dominated by a preceding case label
            Copy
            The reasoning behind this error is that there is no chance that the execution goes to the second case since any string object passed to the method would be handled in the first case itself.
        */
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }

    static double getDoubleValueUsingGuardedPatterns(Object o) {
        return switch (o) {
            case String s && s.length() > 0 -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
