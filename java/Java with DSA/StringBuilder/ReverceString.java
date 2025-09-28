package StringBuilder;

public class ReverceString {
    public static void main(String args[]){
        StringBuilder name = new StringBuilder("tanishq");

        for(int i=0;i<name.length();i++){
            name.insert(i, name.charAt(name.length()-1));
            name.deleteCharAt(name.length()-1);
        }
System.out.println(name);
    }
}
