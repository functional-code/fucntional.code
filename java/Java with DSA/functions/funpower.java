import java.util.*;

class funpower {
    public static void printPower(int n,int x){
            int o=x;
        for(int i=1;i<=n;i++){
          o=o*x;
        }
        System.out.println(o);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        printPower(n, x);

    }
}
