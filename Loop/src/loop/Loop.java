package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = 15;
//  
//        
//        while (count < 100) {
//    System.out.println(count);
//    count++;

//        System.out.println("Enter your first number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your Second  number");
//        int num2 = sc.nextInt();
//
//        while (num1 != 0) {
//            System.out.println("invalid");
//            if (num1 > num2) {
//                System.out.println("Max number is" + num1);
//                break;
//            } else if (num2 > num1) {
//                System.out.println("Max number is" + num2);
//                break;
//            } else if (num2 < num1) {
//                System.out.println("Min number is" + num2);
//                break;
//            } else {
//                System.out.println("Min number is" + num1);
//                break;
//            }
//        }





//        int number, max,min;
//        number = sc.nextInt();
//        max = number;
//        min=99999;
//        
//        do {
//            number = sc.nextInt();
//            if (number > max) {
//                max = number;
//                System.out.println("max is " + max);
//                
//            }
//            else if(number < max){
//               min=number;
//               System.out.println("Min is "+min);
//                
//                 }
//        } while (number != 0);
        
//        System.out.println("number " + number);
        
        
        
        
        





//int totalNumbers = sc.nextInt();
//    int minMax = 0;
//    for(int i = 1; i <= totalNumbers; i++){
//        System.out.print("Number " + i + ": ");
//        int inputNumbers = sc.nextInt();
//    }
//    System.out.println();
//
//    int smallest = Math.min(minMax);
//    System.out.println("Smallest = " + smallest);
//    int largest = Math.max(minMax); 
//    System.out.println("Largest = " + largest);
        







//        int totalNumbers = sc.nextInt();
////        int minMax = 0;
//        int smallest=99999;
//        int largest = 0;
//
//        for (int i = 1; i <= totalNumbers; i++) {
//            System.out.print("Number " + i + ": ");
//            int inputNumbers = sc.nextInt();
//            if (inputNumbers > largest) {
//                largest = inputNumbers;
//            } else if (inputNumbers < smallest) {
//                smallest = inputNumbers;
//            }
//        }
//        System.out.println();
//
//        System.out.println("Smallest = " + smallest);
//        System.out.println("Largest = " + largest);


//        for(int i=1; i<=4;i++){
//            for(int k=1;k<=4;k++){
//                
//                for(int j=k; j<=4; j++){
//                    System.out.println("i= "+i+" k= "+k+" J= "+j);
//                }
//            
//            }
//        
//        }
        
        int num1;
        num1=sc.nextInt();
         int num2;
         num2=sc.nextInt();

        int res=(num1>num2) ? (num1+num2):(num1-num2);
        System.out.println(res);
        
    }
}
