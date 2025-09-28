import java.util.*;

public class findmyxxxx2d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int coulom = sc.nextInt();

        int matrix[][]=new int[row][coulom];

        for(int i=0;i<row;i++){
            for(int j=0;j<coulom;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        int x = sc.nextInt();

         for(int i=0;i<row;i++){
            for(int j=0;j<coulom;j++){
               if (matrix[i][j]==x) {
                    System.out.println("The input is on index row "+i +"and coulom "+j);
               }
            }
        }

    }
}
