
public class NumberPyramid {

    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers 
            for (j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
