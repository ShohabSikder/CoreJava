
package sortingarray;

import java.util.Arrays;


public class SortingArray {

    
    public static void main(String[] args) {
       int []myArray= new int[]{2,5,6,8,1,10};
        System.out.println("Ascending "+Arrays.toString(myArray));
        int n;
        for(int i=0; i<myArray.length;i++){
        for(int j=0;j<myArray.length-1; j++){
            if(myArray[j]<myArray[j+1]){
            n=myArray[j];
            myArray[j]=myArray[j+1];
            myArray[j+1]=n;
               
            }
             System.out.println("My Array "+Arrays.toString(myArray));
        }
        
        }
        System.out.println("Ascending number : "+Arrays.toString(myArray));
    }
    
}
