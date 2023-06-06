public class MaximumOfThree {
    public static void main(String[] args) {
        System.out.println(maximumOf3(1, 2, 3));
    }
    public static int maximumOf3(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) return a;
            else return c;
        } else {
            if (b >= c) return b;
            else return c;
        }
    }
}
