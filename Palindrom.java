public class Palindrom {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            // Print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
