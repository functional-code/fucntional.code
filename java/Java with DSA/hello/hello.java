import java.util.*;

public class hello {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        /* System.out.println(lang);

         if(lang == 1)
        {
            System.out.println("hello");
        }

        else if( lang== 2){
            System.out.println("namaste");
        }

        else {
            System.out.println("bonjoi");
        }  */

        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("bonjoi");
            break;
            default : System.out.println("invalid button");
        }

    }
}
