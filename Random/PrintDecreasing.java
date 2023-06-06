import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        printDecreasing(sc.nextInt());
    }

    public static void printDecreasing(int n){
        if(n==1) {
            System.out.println(n);
            System.out.println(n);
        } else {
            System.out.println(n);
            printDecreasing(n-1);
            System.out.println(n);
        }
    }

}
