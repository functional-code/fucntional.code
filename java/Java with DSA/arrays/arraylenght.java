package arrays;
import java.util.*;

public class arraylenght {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int number[]= new int[n];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }

        int x =sc.nextInt();

        for(int i=0;i<number.length;i++){
            if(x== number[i]){
                System.out.println("x found at "+ i);
            }
            else{
            }
        }
    }
}
