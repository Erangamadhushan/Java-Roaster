package OOP.Abstraction;

class Calculation {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}
public class Overloading1 {
    public static void main(String[] args) {
        Calculation obj = new Calculation();

        obj.sum(10.5, 10.5);
        obj.sum(20, 30);
    
    }
}
