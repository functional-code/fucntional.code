package StringBuilder;

public class StingBiulder {
    public static void main(String args[]){
        StringBuilder name= new StringBuilder("tony");
        System.out.println(name);
        System.out.println(name.charAt(0));
       
       //set
        name.setCharAt(0,'h');
       System.out.println(name);
       
       //insert
       name.insert(0,'s');
        System.out.println(name);

        //del
        name.delete(0, 2);
        System.out.println(name);

        //last mein

        
    }
}
