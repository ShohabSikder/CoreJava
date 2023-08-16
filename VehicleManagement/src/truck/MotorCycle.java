
package truck;


public class MotorCycle extends Vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    
    @Override
    public void start() {
        System.out.println("Motor Cycle Start");
    }

    @Override
    public void stop() {
        System.out.println("MotorCyle Stop");
    }
}
