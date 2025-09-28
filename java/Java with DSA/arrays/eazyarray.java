package arrays;
import java.util.*;

public class eazyarray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int marks[]= new int[n];

        for(int i=1;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            System.out.println(marks[i]);
        }

    }

}
