import java.util.*;


class condi {
    public static void main( String args[]){

        
        Scanner sc = new Scanner(System.in);

       int age = sc.nextInt();

        if(age > 18) {
            System.out.println("adult");
        }

        else {
            System.out.println("not adult");
        }
    //odd.even

    if( age % 2 == 0)
    {
        System.out.println("even");
    }

    else 
    {
        System.out.println("odd");
    } 

    //grater,equal , smaller

    int a = sc.nextInt();
    int b = sc.nextInt();

    if( a == b){
        System.out.println("a is equal");
    }

    else  if (a >b){
      
            System.out.println(" a is grater");
        }
        else{
            System.out.println("b is grater");
        }
    




    }
}