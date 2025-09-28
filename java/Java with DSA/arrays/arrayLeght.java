package arrays;
import java.util.*;

public class arrayLeght {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int marks[]= new int[n];

        for(int i=0;i<n;i++){

            marks[i]= sc.nextInt();
        }
        int f = sc.nextInt();
         System.out.println(marks[f]);
    }
}
