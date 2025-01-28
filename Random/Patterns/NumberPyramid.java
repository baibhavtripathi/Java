import java.util.Scanner;

public class NumberPyramid {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print Numbers
            //Ascending Order
            for(int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            //Descending Order
            for(int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j);
            }
            // Newline
            System.out.println();
        }
        sc.close();
   } 
}
