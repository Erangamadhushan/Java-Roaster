package OOP.Abstraction;

abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("Running safety !");
    }
}
public class basics {
    public static void main(String[] args) {
        Honda h = new Honda();
        Bike b = new Honda();

        h.run();
        b.run();
    }
}
