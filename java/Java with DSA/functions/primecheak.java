import java.util.*;

class primecheak {

    public static void printPrime(int n){
        if((n%2)==0){
            System.out.println("Its prime");
            
        }
        else{
            System.out.println("not prime");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);

    }
    
}
