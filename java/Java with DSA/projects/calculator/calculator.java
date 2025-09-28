import java.util.* ;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("add/sub/mul/div");
        String cal = sc.next();

        /*plus */
        switch (cal) {
            case "add": System.out.print(a +b); ;
                
                break;
            case "sub": System.out.print(a -b); ;
                
                break;
            case "mul": System.out.print(a*b); ;
                
                break;
            case "div": System.out.print(a/b); ;
                
                break;
        
            default:
                break;
        }
        System.out.println(" is your answer");

    }    

}
