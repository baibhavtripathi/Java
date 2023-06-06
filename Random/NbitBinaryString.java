import java.util.Arrays;

public class NbitBinaryString {
    public static void main(String[] args) {
        int[] arr = new int[3];
        binary(arr, 3);
    } 

    private static void binary(int[] arr, int n) {
        if (n < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            arr[n - 1] = 0;
            binary(arr, n - 1);
            arr[n - 1] = 1;
            binary(arr, n - 1);
        }
    }
}
