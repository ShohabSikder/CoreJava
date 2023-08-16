
package calculationtest2;

import java.util.Scanner;


public class CalculationTest2 {

    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        
//        int number;
//        int sum=0;
//        System.out.println("pls enter your number");
//         number=sc.nextInt();
//         
//         while(number>0){
//         sum+=number;
//             System.out.println("pls your enter number");
//             number=sc.nextInt();
//         }
//     System.out.println(sum);


//        int sales;
//        int discount;
        System.out.println("Enter your Sales number");
        double sales=sc.nextDouble();
        System.out.println("discount");
        double tax=sc.nextDouble();
        
        double totalPrice = sales+(sales*tax/100);
        System.out.println("Sales tax is  "+(int) totalPrice);    
       
    }
    
}
