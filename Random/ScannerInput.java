import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(sc.nextInt());
        System.out.println(sc.nextLine().trim());
    }
}