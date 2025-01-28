import java.util.Scanner;

public class SwastikaPattern {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in);) {
         System.out.print("Enter Swastika size: ");
         int size = sc.nextInt();
         int totalSize = 2*size - 1;
         // first half
         for (int i = 1; i <= size; i++) {
            if (i == 1) {
               System.out.print("#");
               for (int j = 2; j <= (size - 1); j++) {
                  System.out.print(" ");
               }
               for (int j = size; j <= totalSize; j++) {
                  System.out.print("#");
               }
            } else {
               System.out.print("#");
               for (int j = 2; j <= totalSize; j++) {
                  if (i == size || j == size) {
                     System.out.print("#");
                  } else System.out.print(" ");
               }
            }
            // Newline
            System.out.println();
         }
         // second half
         for (int i = size + 1; i <= totalSize; i++) {
            if (i != totalSize) {
               for (int j = 1; j < totalSize; j++) {
                  if (i == size || j == size) {
                     System.out.print("#");
                  } else System.out.print(" ");
               }
               System.out.print("#");
            } else {
               for (int j = 1; j <= size; j++) {
                  System.out.print("#");
               }
               for (int j = size + 1; j < totalSize; j++) {
                  System.out.print(" ");
               }
               System.out.print("#");
            }
            // Newline
            System.out.println();
         }
      } catch (Exception e) {
         System.err.println(e.getLocalizedMessage());
      }
   } 
}
