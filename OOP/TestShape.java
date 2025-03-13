package OOP;

class Shapes {
    int length;
    int width;
    String name;

    void insert(int l, int w, String n) {
        length = l;
        width = w;
        name = n;
    }

    void calculateArea() {
        System.out.println("Area of " + name + " = " + width*length);
    }
}
public class TestShape {
    public static void main(String[] args) {
        Shapes rectangle = new Shapes();
        Shapes square = new Shapes();

        rectangle.insert(12, 5, "rectangle");
        square.insert(12, 12, "Square");

        // Calculate Area of each shape

        rectangle.calculateArea();
        square.calculateArea();
    }
}
