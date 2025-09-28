import java.util.Scanner;

public class transpose {
    public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int colm =sc.nextInt();

        int matrix[][]=new int[row][colm];

        for(int i=0;i<colm;i++){
            for(int j=0;j<row;j++){
                matrix[j][i]=sc.nextInt();
            }
        }
        
        for(int i=0;i<colm;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]);
            }System.out.println();
        }
    }
}
