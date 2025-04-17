import java.util.Scanner;

public class Arrays_A {

    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // int marks[]={97,99,92};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // marks[0] = 97;
        // marks[1] = 99;
        // marks[2] = 98;
        // System.out.println((marks[0]));
        // System.out.println((marks[1]));
        // System.out.println((marks[2]));
        for(int i =0; i<size;i++){
numbers[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
