import java.util.*;

public class fibonaccirec {

    static void fabo(int a ,int b ,int n){
        if(n==0){
            return;
        }

        System.out.println(a);
        fabo(b, b+a, n-1);
    }
  
    public static void main(String args[]){
        fabo(0, 1, 10);


    }
    
}
