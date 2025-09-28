import java.util.*;

public class d2array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        
        int matrix[][]= new int[n][n2] ;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++){
                matrix[i][j]= sc.nextInt();
                
            }
            
        }   

        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
     }
}
