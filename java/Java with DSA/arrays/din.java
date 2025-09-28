package arrays;
import java.util.*;

public class din {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int marks[]= new int[n];

        for(int i=1;i<n;i++){
            marks[i]=sc.nextInt();
        }
       
        int x =sc.nextInt();
        if(x>=0 & x<n){
        System.out.println(marks[x]);
        }
        else{
            System.out.println("invalid");
        }

    }

}
