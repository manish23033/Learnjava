
import java.util.Scanner;

public class Fibbonacci {

    public static void fibSeriese(int a, int b, int n) {
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.println(b);
                int temp = b;
                b = a + b;
                a = temp;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        System.out.println(a);
        fibSeriese(a, b, n);
    }

}
