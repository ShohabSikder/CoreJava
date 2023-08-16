
package scanertest;

import java.util.Scanner;


public class ScanerTest {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
//        String greetings;
//        
//        System.out.println("Pls enter greeting;");
//        greetings=sc.nextLine();
//        System.out.println(greetings+" Java");



//        float n1,n2;
//        System.out.println("Please enter number 1");
//        n1=sc.nextInt();
//        System.out.println("Please enter number 1");
//        n2=sc.nextInt();
//        float sum=n1/n2;
//        System.out.println(sum);


            //Calculation of sum
//        int number,sum=0; 
//        for(int i=1; i<=10; i++){
//            System.out.println("Pls enter your number "+i);
//            number=sc.nextInt();
//            sum+=number; //sum=sum+number
//            
//            
//        }
//        System.out.println("Total sum is "+sum);
        

        //Calculation of sum
//        int number,sum=0; 
//        for(int i=5; i<=10; i++){
//            System.out.println("Pls enter your number "+i);
//            number=sc.nextInt();
//            sum+=number; //sum=sum+number
//            
//            
//        }
//        System.out.println("Total sum is "+sum);
        
        //Area Of circle
        System.out.println("enter a number for radius: ");
        double radius=sc.nextDouble();
        
        double area=radius*radius*3;
        
        System.out.println("The area for the circle of radius " +radius+" is "+area);
        
    }
    
}
