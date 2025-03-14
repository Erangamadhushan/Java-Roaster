package Basics.Assignment1_2;

public class Q1 {
    static double PI = 3.14159d;
    public static void main(String[] args) {
        double radius = 2.4;
        double area = PI * Math.pow(radius,2);
        System.out.println("Area of Circle is :" + area);

        radius += 2;
        double newArea = PI * Math.pow(radius, 2);
        System.out.println("Area of New circle is :" + newArea);
    }
}
