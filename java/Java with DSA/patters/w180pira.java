import java.util.*;

class w180pria{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //outter loop
        for(int i=1 ; i<=n ;i++){
         //inner loop - space print
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         //inner loop = printing star
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }System.out.println();
        }
        
    }
}