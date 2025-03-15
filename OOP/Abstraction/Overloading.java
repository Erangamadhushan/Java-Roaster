package OOP.Abstraction;

class Calculation {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        obj.sum(10,20);
        obj.sum(12, 34, 56);
    }
}
