package arrays;
import java.util.*;

public class arrayname {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String name[]=new String[n];

        for(int i=0;i<n;i++){
            name[i]= sc.next();
        }
            int f =sc.nextInt();
        System.out.println("name on posi "+f+" "+name[f]);
    }
}
