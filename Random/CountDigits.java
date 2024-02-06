import java.util.Scanner;
import java.lang.Math;

class CountDigits {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number to count the digits: ");
        int n = sc.nextInt();

        // count digits using loop

        int count = 0, x = n;
        while (x != 0) {
            count++;
            x /= 10;
        }
        System.out.println("The number of digits in number %d is - %d".formatted(n, count));


        // Using string length
        System.out.println("The number of digits in number %d is - %d".formatted(n, String.valueOf(n).length()));

        // Using Log
        System.out.println("The number of digits in number %d is - %d".formatted(n, (int)(Math.floor(Math.log10(n))+1)));
        sc.close();
    }
}