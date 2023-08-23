
package recursion;


public class Recursion {

   
    public static void main(String[] args) {
//     long result= factorial(5);
     long result=fib(6);
        System.out.println(result);
    }

////    private static long factorial(int n) {
////       
////        if(n>0){
////        
////            System.out.println(n-1);
////            return n+factorial(n-1);
////        }
////        else{
////         return 0;
////        }
//       
//        
//    
//}
    
    public static int fib(int index){
        switch (index) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                System.out.println(fib(index-1)+fib(index-2));
                return fib(index-1)+fib(index-2);
        }
        
//        if(index==0){
//    return 0;
//    }
//    else if(index==1){
//        
//    return 1;
//    }
//    else{
//        System.out.println(fib(index-1)+fib(index-2));
//        return fib(index-1)+fib(index-2);
//    }
    
    }
            
}