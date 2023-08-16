
package multidimentionaltomethod;

import array.TowDMethod;

public class MultidimentionalToMethod {

    
    public static void main(String[] args) {
        TowDMethod num= new TowDMethod();
        
        int [][] numbers={{1,2,3,4},{5,6,7,8}};
        int [][] marks={{10,20,30,40},{50,60,70,80}};
        
        System.out.println("Number is "+num.doSum(numbers));
        System.out.println("mark is "+num.doSum(marks));
        
//        int [][] marks= new int [5][3]; 
        
    }
    
}
