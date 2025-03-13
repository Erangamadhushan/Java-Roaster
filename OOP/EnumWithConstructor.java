package OOP;

enum Size {
    SMALL(10), MEDIUM(20), LARGE(30);

    private int value; // Instance variable


    // Constructor
    Size(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }
}

public class EnumWithConstructor {
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        System.out.println("Size: " + s + ", Value: " + s.getValue());
    }
}
