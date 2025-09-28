import java.util.*;

public class BubbleSorting {
    public static void printArray(int array[]){
        for( int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        return;
    }
    public static void main(String args[]){
        int array[]= {7,8,3,1,2};

        //bubble Sorting
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        printArray(array);
       
    }
    
}
