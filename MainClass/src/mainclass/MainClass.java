
package mainclass;

import java.util.Scanner;
import random.Greetings;


public class MainClass {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
         String name=sc.next(); 
        
        Greetings ran=new Greetings();
        System.out.println(ran.greetings(name));
        
    }
    
}
