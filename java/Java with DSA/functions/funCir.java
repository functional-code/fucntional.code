import java.util.*;

class funCir {
    public static void printCirp(double n){
        double cir=2*3.14*n;
        System.out.println(cir);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double n= sc.nextFloat();
        printCirp(n);
    }
}
