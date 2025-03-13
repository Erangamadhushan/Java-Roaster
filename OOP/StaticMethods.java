package OOP;

public class StaticMethods {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized !");
        b = 12;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
