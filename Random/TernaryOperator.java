public class TernaryOperator {
    // condition ? expression1 : expression2;
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = (a > b) ? a : b;
        System.out.println("Result: " + result);

        /*
         * Write a function to check if a person can enter a club or not.
            If age is greater than or equal to 18, return "Can Enter". Otherwise, return "Cannot Enter".
            For example, if age = 21, the expected output is "Can Enter".
         * 
         */
        int age = 21;
        String validToEnterClub = (age >= 18) ? "Can Enter" : "Cannot Enter";
        System.out.println(validToEnterClub);
    } 
}
