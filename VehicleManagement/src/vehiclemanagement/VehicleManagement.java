
package vehiclemanagement;

import truck.Car;
import truck.MotorCycle;
import truck.Vehicle;


public class VehicleManagement {

   
    public static void main(String[] args) {
        Vehicle car= new Car();
        Vehicle MotorCycle= new MotorCycle();
        
        
        car.start();
        MotorCycle.start();
        car.stop();
        MotorCycle.stop();
    }
    
}
