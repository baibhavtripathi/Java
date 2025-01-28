import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter size of square: ");
            int size = sc.nextInt();
            for (int i = 1; i <= size; i++) {
                if (i == 1 || i == size) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("#");
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        if (j == 0 || j == size-1) {
                            System.out.print("#");
                        } else System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
