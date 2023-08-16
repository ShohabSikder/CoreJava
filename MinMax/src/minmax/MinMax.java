package minmax;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your attemp number");
//        int number=sc.nextInt();
//        
//        int max=0,min=99999999;
//        int inputNumber;
//        int sum=0;
//        int avgNumber=number;
//        
//        while(number>0){
//            System.out.println("Enter Your Number");
//            inputNumber=sc.nextInt();
//            sum+=inputNumber;
//           if(max<inputNumber){
//            max=inputNumber;
//           
//        }
//           if(min>inputNumber){
//            min=inputNumber;
//            
//           }
//           number--;
//        }
//            avgNumber=sum/avgNumber;
//            System.out.println("Max is "+max);
//            System.out.println("Min is "+min);
//            System.out.println("Sum is "+sum);
//            System.out.println("AVG is "+(double)avgNumber);

//            Factorial Number
        System.out.println("Enter your Number");
        int number = sc.nextInt();
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;

        }
        System.out.println("Factorial is " + number + " is " + result);
//        
//        System.out.println("Enter your number");
//        int n=sc.nextInt();
//        
//        int n1=0,n2=1,sum=0;
//        System.out.println(n1);
//        System.out.println(n2);
//        
//        for(int i=3; i<=n;i++){
//            sum=n1+n1;
//            System.out.println(sum);
//            n1=n2;
//            n2=sum;
//        }
    }

}
