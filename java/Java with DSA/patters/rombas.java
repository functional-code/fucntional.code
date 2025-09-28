import java.util.*;

class rombas {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int o=1;o<=(n-i);o++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=n;j++){
               
                System.out.print("*");
            }System.out.println();
        }
    }  
}
