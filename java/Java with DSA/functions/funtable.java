import java.util.*;

class funtable {
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            int t= i*n;
            System.out.println(t);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        printTable(n);
    }
}
