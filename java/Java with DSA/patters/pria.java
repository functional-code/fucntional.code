import java.util.*;

class pria{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        if(a==1){
            int n = sc.nextInt();

            for(int j=n ; j>=1 ;j-- ){
                for(int i=j ; i>=1 ;i--){
                    System.out.print("*");
                }System.out.println();
            }


        }

        else if(a == 0){
            System.out.println("stopped");
        }
    }
}