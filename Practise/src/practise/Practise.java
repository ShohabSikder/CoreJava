package practise;

import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Your number");
//        int number = sc.nextInt();
//
//        int number1 = number / 100;
//        int remaingAmount = number % 100;
//
//        int number2 = remaingAmount / 10;
//        remaingAmount = remaingAmount % 10;
////          
////          
//
//        System.out.println(number1 + number2 + remaingAmount);
        
//         Random int Matching
         System.out.println("Enter your number");
         int number=sc.nextInt();
          int answer=(int)(Math.random()*10);
        
        if(number==answer){
            System.out.println("Hurray you won "+number);
        }
        else {
            System.out.println("Better luck next time "+answer);
        }
       
        
        
        
    }

}
