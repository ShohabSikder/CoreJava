
package totalprice;

import java.util.Scanner;
import price.Price;


public class TotalPrice {

   
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Price price= new Price();
        System.out.println("Enter your unit price");
        double unitprice=s.nextDouble();
        System.out.println("Enter your unit price");
        double quantity=s.nextDouble();
        
        price.setQuantity(quantity);
        price.setUnitPrice(unitprice);
        
        
        double actualPrice=0.0;
        double totalPrice=price.calculateTotalPrice();
        double discount=0.0;
        if(totalPrice>=100){
            discount=totalPrice*.05;
        actualPrice=totalPrice-discount;
        }
        else{
        actualPrice=totalPrice;
        }
        System.out.println("You have to pay "+Math.round(actualPrice)+"\nDiscount is "+discount);
        System.out.println("Thank You, Keep in touch");
    }
    
}
