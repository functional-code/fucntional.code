import java.util.*;
class funoddn {
    
    public static void printOddn(int n){
        int w= 1;
    for(int i=1;i<=n;i++){
       
        if((i%2)!=0){
           
            w= w+i;
          
        }

        else{
        }
         
        
    }
    System.out.println(w);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        printOddn(n);
    }
}
