import java.util.*;

class funcounter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int k = sc.nextInt();
        
         int zero =0;
            int positive=0;
            int negetive =0;
        for(int i=1;i<=k;i++){
              int n= sc.nextInt();
           
            if(n==0){
                zero= zero +1;
            }
            else if(n>0){
                positive= positive +1;
            }
            else if(n<0){
                negetive= negetive +1;
            }
        }
        System.out.println("Total positive num = "+positive);
        System.out.println("total ngetive num = "+negetive);
        System.out.println("Total zero num = "+zero);
    }
}
