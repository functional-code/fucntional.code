import java.util.*;

public class concatenation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstname = sc.next();
        String lastname = sc.next();
        String fullName = firstname +" "+ lastname;
        System.err.println(fullName);
        System.out.println(fullName.length());

        //charat

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare

        // String name1= "tonny";
        // String name2 ="tonny";

        // if(name1.compareTo(name2) ==0){
        //     System.out.println("ok");
        // }
        // else{
        //     System.out.println("Not o");
        // }

        //compare
        String sentence =" My name is Tanishq";
        String nameo=sentence.substring(0,3);
        System.out.println(nameo);
    }
}
