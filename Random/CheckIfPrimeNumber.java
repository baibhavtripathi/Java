import java.util.Scanner;

public class CheckIfPrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter a number to check for prime: ");
            int n = sc.nextInt();
            System.out.println(checkifPrime(n));
            System.out.println(checkifPrimeNumber(n));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static boolean checkifPrime(int n) {
        if (n <= 1)     return false;
        if (n == 2 || n == 3)    return true;
        if (n%2 == 0 || n%3 == 0)    return false;

        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n%i == 0)   return false;
        }
        return true;
    }

    static boolean checkifPrimeNumber(int n) {
        if (n <= 1)     return false;
        if (n == 2 || n == 3)    return true;
        if (n%2 == 0 || n%3 == 0)    return false;

        for (int i = 5; i <= (int) Math.sqrt(n); i += 6) {
            if (n%i == 0 || n%(i+2) == 0)   return false;
        }
        return true;
    }
}
