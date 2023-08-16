
package array;


public class TowDMethod {
    public int doSum(int [][] myArray){
    int total=0;
    for (int row=0; row<myArray.length; row++){
  
        for(int col=0; col<myArray[row].length; col++){
        total +=myArray[row][col];
        }
        
    }
    return total;
    }
}
