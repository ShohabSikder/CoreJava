
package question02;

import java.util.Scanner;


public class Question02 {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        
//        int result=1;
        int fact=1;
        
        for(int i=num; i>=1; i--){
        fact=fact*i;
        
        }
        System.out.println("Factorial is "+fact);
        
    }
    
}
