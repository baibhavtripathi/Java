import java.math.BigInteger;

public class BigIntegerImpl {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("-90");
        BigInteger B = BigInteger.valueOf(34);
        System.out.println(A.toString());
        System.out.println(A.add(B));
        System.out.println(A.remainder(B));
        System.out.println(A.abs());
    }
}
