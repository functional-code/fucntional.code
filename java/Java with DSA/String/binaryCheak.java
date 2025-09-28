public class binaryCheak {
    public static void main(String args[]){
        // Your code here
        String n= "00";
        int o=0;
        int k =0;
        for(int i=0;i<=n.length()-1;i++){
            if(n.charAt(i)>'1' || n.charAt(i)<'0'){
                System.out.println(" n is not a Binary String");
                k =k+1;
                break;
            }  
        }
        if(k!=1){
            System.out.println("its a boy");
        }

        

    }
}
