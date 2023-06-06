import java.util.ArrayList;
import java.util.List;

public class NBitBinaryStringRecursive {

    private static List<String> nBitBinaryString(int n) {
        if (n==0) {
            return new ArrayList<String> (List.of(""));
        } else {
            List<String> binary_string = new ArrayList<>();
            for (String iterable_element : nBitBinaryString(n-1)) {
                binary_string.add(iterable_element+"0");
                binary_string.add(iterable_element+"1");
            }
            return binary_string;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(nBitBinaryString(3));
    }
}
