
package evd;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] myArray= new int[100];
        
        for( int i=0; i<myArray.length;i++){
            myArray[i]=(int)(Math.random()*100);
        }
        System.out.println("Array list :"+Arrays.toString(myArray));
        
        System.out.println("Enter your index number");
        int IndexNum=sc.nextInt();
        
        try{
         int value= myArray[IndexNum];
            System.out.println("Your value is :"+value);
        }
        
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println(e);       
           }
    }
}
