import java.util.*;

public class mailReplace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String mail =sc.nextLine();
        // String name = mail.replace("@gmail.com"," ");
        // System.out.println(name);
        int p = 0;

        for(int i=0;i<mail.length();i++){
            if( mail.charAt(i) == '@'){
               p= p+i;
            }
            
        }
        String result= mail.substring(0, p);
        System.out.println(result);
    }
}
