package arrays;
import java.util.*;
public class arraysim {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

       String input[]=new String[n];
        for(int i=0;i<n;i++){
            input[i]= sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(input[i]);
        }
    }
    
}
