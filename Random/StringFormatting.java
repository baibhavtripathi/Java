import java.util.Locale;

public class StringFormatting {
    public static void main(String[] args) {
        /*
            format() is a static method of the String class. 
            formatted() is a method of an instance of the String class. formatted was added much later, that is: JDK 15! 
                        - As a usability enhancement for text blocks. There’s no difference in functionality.
        */
        System.out.println(String.format("My name is %s.", "Lakhan"));
        System.out.println("My name is %s.".formatted("Shyam"));
        int number = 9999999;

        // using the default locale if none specified
        System.out.println(String.format("Number: %,d", number));

        // using the GERMAN locale as the first argument
        System.out.println(String.format(Locale.GERMAN, "Number in German: %,d", number));
        // using the UK locale as the first argument
        System.out.println(String.format(Locale.UK , "Number in UK: %,d", number));
    
    }
}
