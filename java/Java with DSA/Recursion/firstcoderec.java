import java.util.*;

class firstcoderec{

    public static void printNum(int n){
        if(n==0){
            return;
        }
        //if not ggiven any coundition there will be
        // stac overflow
        System.out.println(n);
        printNum(n-1);

    }

    public static void main(String args[]){
        int n = 5;     
        printNum(n);
    }
}