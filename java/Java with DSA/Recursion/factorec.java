public class factorec {
    public static void printFac( int n, int i,int fa){
        if(i==n){
            fa = i*fa;
            System.out.println(fa);
            return;
        }
        fa = i*fa;

        printFac(n, i+1, fa);
        
    }

    public static void calculateFac(int n){

        int fac_num1 = calculateFac(n-1);
        int fac_fi = fac_num1*fac_fi;

    }

    public static void main( String args[]){
        int n = 5;
        printFac(n,1,1);
        calculateFac(n);

    }
    
}
