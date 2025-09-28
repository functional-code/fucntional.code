public class xnrec {
 static void rec( int n , int x){
        if ( n==0) {
            return;
        }
        x= x*x;
        n =x*n;
        System.out.println( nd);
        rec(n--, x);
    }
    public static void main(String args[]){
        rec(6, 4);

    }
}
