import java.util.*;
public class SolidRhombus {
    public static void main(String[] args) {
        int i, n=5,j ;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){

                System.out.print("  ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
    
}
