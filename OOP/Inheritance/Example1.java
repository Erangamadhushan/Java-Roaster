package OOP.Inheritance;

class Vehicle {
    int speed;
    int maxSpeed;
    String color;
    public Vehicle(int speed, int maxSpeed, String color) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void start() {
        System.out.println("Starting....");
    }

}

class Car extends Vehicle {
    int numDoors;
    public Car(int speed, int maxSpeed, String color, int numDoors) {
        super(speed, maxSpeed, color);
        this.numDoors = numDoors;
    }

    public void drive() {
        System.out.println("Driving....");
    }
}
public class Example1 {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Car newCar = new Car(100, 180, "black", 4);

        newCar.start();
        newCar.drive();

    }
}
