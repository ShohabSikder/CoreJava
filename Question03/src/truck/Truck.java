
package truck;


class Truck extends Vehicle {
    int weight;

    
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; 
        } else {
            return regularPrice;
        }
    }
}


    

