public class clearBit {
    public static void main(String args[]){
        int n = 2;
        int pos =3;
        int bitMask =1<<pos;

        int numnot = ~bitMask ;
        int newnum = numnot & n ;
        System.out.println(newnum);


        //  int newnum = bitMask | pos ;

        // System.out.println( newnum);
    }
}
