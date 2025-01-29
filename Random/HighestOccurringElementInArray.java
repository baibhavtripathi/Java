import java.util.Scanner;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class HighestOccurringElementInArray {
    public static void main(String[] args) throws IOException {
        /*
        * // Medium size Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int arraySize = sc.nextInt();

        // Java Stream + Scanner
        System.out.println("Enter your array: ");
        int[] nums = Arrays.stream(new int[arraySize])
                            .map(i -> sc.nextInt())
                            .toArray();

        // One Line Input - Java Stream + Scanner
        System.out.print("Enter your array: ");
        int[] nums = Arrays.stream(sc.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        sc.close();
        */
        // For Faster, Efficient and Large input (e.g. 10^6 range)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your array: ");
        int[] nums = Arrays.stream(br.readLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        System.out.println("Smallest Number With Highest Frequency - "+ mostFrequentElement(nums));
    }

    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int highestFrequency = 0, smallestNumberWithHighestFrequency = Integer.MAX_VALUE;

        // Build frequency map
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find the element with the highest frequency and smallest value
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if (count > highestFrequency || (count == highestFrequency && key < smallestNumberWithHighestFrequency)) {
                highestFrequency = count;
                smallestNumberWithHighestFrequency = key;
            }
        }
        return smallestNumberWithHighestFrequency;
    }
}
