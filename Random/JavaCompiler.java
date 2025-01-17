public class JavaCompiler {
    public static void main(String[] args) {
        pattern12(4);
    }

    static void pattern12(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j);
            for(int k = 0; k < (2*(n-i)); k++)
                System.out.print(" ");
            for(int j = n; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
