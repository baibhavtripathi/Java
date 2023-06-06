public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("Is array sorted? " + isArraySorted(new int[] {1,2,3,6,5}, 5));
    }

    public static boolean isArraySorted(int[] arr, int n) {
        if (n <= 1) return true;
        return (arr[n-1] < arr[n-2])? false: isArraySorted(arr, n-1);
    } 
}