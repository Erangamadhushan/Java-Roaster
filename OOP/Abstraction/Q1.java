package OOP.Abstraction;

abstract class Bike {
    abstract void run();
    
}

class Honda extends Bike {
    void run() {
        System.out.println("running !");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Bike obj = new Honda();

        obj.run();
        //obj.changeGear();
    }
}
