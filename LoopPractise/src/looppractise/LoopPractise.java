
package looppractise;

import java.util.Scanner;


public class LoopPractise {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//       Write a program to print numbers from 1 to 10.
//        System.out.println("Enter your 1st first");
//        int num1=sc.nextInt();
//        System.out.println("Enter your 2nd first");
//        int num2=sc.nextInt();
//       for(int i=num1;i<=num2;i++){ 
//            System.out.println(i);
//       }
       
//       Write a program to calculate the sum of first 10 natural number
//        int sum=0;
//        for(int i=1;i<=10;i++){ 
//            sum+=i;
//       }
//        System.out.println(sum);
//        
//          Write a program that prompts the user to input a positive integer. It should then 
//                  print the multiplication table of that number.   
        System.out.println("Enter your Number");
        int number=sc.nextInt();
        int result=1;
        for(int i=1;i<=10;i++){ 
            result=number*i;
            System.out.println(number+" x "+i+" = "+result);
            
            
       }
        
    }
    
}
