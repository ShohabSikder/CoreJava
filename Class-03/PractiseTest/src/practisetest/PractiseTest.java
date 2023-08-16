
package practisetest;

import java.util.Scanner;


public class PractiseTest {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in); 
       
//   Program asks for a user name. The user will input a name. Program print Welcome ‘user
//name’
    
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Welcome "+name);
        
        
       
//    Program as for input two numbers. The user will input two numbers. Program print the
//summation of two numbers.
        System.out.println("Enter your number");
        int number1=input.nextInt();
        System.out.println("Enter your number");
        int number2 =input.nextInt();
        
        int sum=number1+number2;
        System.out.println("The sum is "+sum);
        
  
// Program as for input two numbers. The user will input two numbers. Program print the
//Modulus of two numbers.
    System.out.println("Enter your number");
        int number1=input.nextInt();
        System.out.println("Enter your number");
        int number2 =input.nextInt();
        
          number2=number1%number2;
        System.out.println("The Modulus is "+number2);
        
//       Program asks for Marks. The user will input a Marks. Program print Your Mark is ‘Marks’. 
      

        System.out.println("Please enter your mark");
         int number=input.nextInt();
        System.out.println("Your Mark is "+number);
        


    }
    
}
