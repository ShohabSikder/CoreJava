
package question1;

import java.util.Scanner;


public class Question1 {

    
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        
        int sum=0;
        while(true){
            System.out.println("Enter Your number");
            int num=sc.nextInt();
            if(num<0){break;}
            sum+=num;
            
        }
        System.out.println("Sum :"+sum);
    }
    
}
