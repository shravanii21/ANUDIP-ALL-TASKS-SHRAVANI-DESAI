// This is an example of Hierarchical Inheritance

// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class 1 - Car inherits from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

// Child class 2 - Bike inherits from Vehicle
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

// Main class to test
public class VehicleExample {
    public static void main(String[] args) {
        // Creating Car object
        Car car = new Car();
        car.start();   // Inherited from Vehicle
        car.drive();   // Specific to Car

        // Creating Bike object
        Bike bike = new Bike();
        bike.start();  // Inherited from Vehicle
        bike.ride();   // Specific to Bike
    }
}