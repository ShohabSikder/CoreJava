
package evidencepractise;

import java.util.Scanner;


public class EvidencePractise {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter Your 1st Number");
//        int number1=sc.nextInt();
//        System.out.println("Enter Your 1st Number");
//        int number2=sc.nextInt();
//        System.out.println("Enter Your 1st Number");
//        int number3=sc.nextInt();
//        int maxNumber=0,minNumber=0;
//
//        if(number1>number2 && number1>number3){
//        maxNumber=number1;
//        }
//        else if(number2>number1 && number2>number3){
//        maxNumber=number2;
//        }
//        else{
//        maxNumber=number3;
//        }
//
//
//        if(number1<number2 && number1<number3){
//        minNumber=number1;
//        }
//        else if(number2<number1 && number2<number3){
//        minNumber=number2;
//        }
//        else{
//        minNumber=number3;
//        }
//
//        System.out.println("Max Number is "+maxNumber+" Min number is "+minNumber);


        System.out.println("Enter your Start Number");
        int number1=sc.nextInt();
        System.out.println("Enter your end Number");
        int number2=sc.nextInt();

        for(int i=number1; i<=number2;i++){
             int count=0;
            for(int p=1; p<=i;p++){
                if(i%p==0){
                    count+=1;
                }   
            }
            if(count==2){
                    System.out.println(number1+" This is prime number");
                }
                else{
                    System.out.println(number1+" This is not prime number");
                }
        }
        
        
        
            


    }

}
