
package multidimensionalarray;

import java.util.Arrays;


public class MultidimensionalArray {

  
    public static void main(String[] args) {
//        int[][] matrix=new int[3][3];
//        
//        matrix[0][0]=5;
//        matrix[0][1]=8;
//        matrix[0][2]=9;
//        
//        matrix[1][0]=10;
//        matrix[1][1]=55;
//        matrix[1][2]=15;
//        
//        System.out.println(Arrays.deepToString(matrix));
        
//        for(int i=0; i<matrix.length;){}

//        int [][] matrix={{10,20,30},{10,20,30},{10,20,30}};
        int [][] matrix={{10,20,30},{40,50,60},{70,80,90}};
        
         System.out.println(Arrays.deepToString(matrix));
         for(int row=0; row<3; row++){
             for(int column=0; column<3; column++){
                 System.out.print(matrix[row][column]+" ");
             }
             
             System.out.println("");
         }
    }
    
}
