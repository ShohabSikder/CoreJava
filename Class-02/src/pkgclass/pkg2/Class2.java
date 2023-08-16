
package pkgclass.pkg2;

import java.util.Scanner;

public class Class2 {

   
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
//        Calculation of Number

//        System.out.println("Please your enter nubmer");
//       
//        int sum=0;
//        int n=sc.nextInt();
//         for(int i=1; i<=n; i++){
//            int number =sc.nextInt();
//            sum+=number;
//         }
//        
//         System.out.println(sum);

System.out.println("Please your enter number");
        
        int n=sc.nextInt();
        int sum=0;
//     
     for(int i=1; i<=n; i++){
         int number=sc.nextInt(); 
         sum+=number;
         if(number<0){ 
          System.out.println("Stop");
          break;
     }
    
         } 
     System.out.println(sum);
        

   
    }
    
}
