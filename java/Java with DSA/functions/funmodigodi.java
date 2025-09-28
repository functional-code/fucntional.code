import java.util.*;

class funmodigodi {
    public static void printeli(int n){
        if(n>18){
            System.out.println("eligible for voting");
        }
        else if(n>0 & n<18){
            System.out.println("not eligible for voting");
        }
        else{
            System.out.println("invalid");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        printeli(n);
    }
}
