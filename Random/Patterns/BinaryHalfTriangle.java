import java.util.Scanner;

public class BinaryHalfTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            for (int i = 1; i <= rows; i++) {
                int val = i % 2;
                for (int j = 1; j <= i; j++) {
                    System.out.print(val);
                    val = 1 - val;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
