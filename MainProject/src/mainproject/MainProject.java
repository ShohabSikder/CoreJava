
package mainproject;

import findPrimeNumber.DoMath;
import java.util.Scanner;


public class MainProject {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter your number");
            int num=sc.nextInt();
            
            DoMath prime= new DoMath();
            
            System.out.println(prime.primeNumber(num));
    }
    
}
