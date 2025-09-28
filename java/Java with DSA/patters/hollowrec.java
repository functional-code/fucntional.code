import  java.util.* ;

public class hollowrec {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a==1){

            for(int j =1 ; j<=4;j= j+1){
            for( int i =1 ; i<=4;i= i+1){
               if(j==1 || i==1 || i ==4 || j==4){ 
                System.out.print("*");   
               }
               else{
                System.out.print(" ");
               }
            }System.out.println();
            }


        }
        else if(a==0){
            System.out.println("stopped");
        }
        else{
            System.out.println("invalid");
        }
    }
}
