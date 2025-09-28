import java.util.*;

class marks2 {
  public static void main( String args[]){
    Scanner sc = new Scanner(System.in) ;
    int a = sc.nextInt();
    int marks = sc.nextInt();
    if(a==1){
        System.out.println("Enter Marks");      
    }

    else{
      marks = 0 ;
    }

    if(marks==0){
      System.out.println("Invalid");
    }

    else{
       do{
            System.out.println("good");
            marks = 0 ;
        }while(marks>=90);
        do{
            System.out.println("ok");
            marks = 0 ;
        }while (marks <=89);

        do{
            System.out.println("good");
            marks = 0 ;
        }while( marks>=60);

        do{
            System.out.println("chutiya hai tu");
            marks = 0 ;
        }while(marks<=50);
    }
    


  }    
}



lavda sala chutiya && use karna tha lavda busdike 