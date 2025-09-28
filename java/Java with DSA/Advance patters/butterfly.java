import java.util.*;

class butterfly {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       for(int i=1 ;i<=n;i++){
        for(int a=1;a<=i;a++){
            System.out.print("*"+" ");
        }
        
        for(int b=1;b<=2*(n-i);b++){
            System.out.print("  ");
        }

        for(int c=1;c<=i;c++){
            System.out.print("*"+" ");
        }System.out.println();
       

//next
       }

         for(int i=n ;i>=0;i--){
        for(int a=1;a<=i;a++){
            System.out.print("*"+" ");
        }
        
        for(int b=1;b<=2*(n-i);b++){
            System.out.print(" "+" ");
        }

        for(int c=1;c<=i;c++){
            System.out.print("*"+" ");
        }System.out.println();
       


       }
        
    }
}
