import java.util.*;
class funaverage {
    public static void printAvg( float a,float b,float c){
        float n=(a+b+c)/3;
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float a =sc.nextInt();
        float b =sc.nextInt();
        float c =sc.nextInt();

        printAvg(a, b, c);



    }
}
