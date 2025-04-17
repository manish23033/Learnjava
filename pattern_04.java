public class pattern_04 {
    public static void main(String[] args) {
        int i , j,k ;
            for(i =1; i<=4;i++){
                k=1;
                for(j=1;j<=4; j++){
                    if(j>=5-i&&j<=4) {
                     System.out.print(k++);  
                     
                      
                    }
                    else{
                        System.out.print("");
                    }
                    // System.out.print("\n");
                }

                    System.out.println();
    }
}
}
