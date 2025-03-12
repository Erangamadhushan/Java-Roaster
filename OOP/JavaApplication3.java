package OOP;

    
public class JavaApplication3 {
    {
        System.out.println("This is Initializer block");
    }
    static {
        System.out.println("Static Initializer block");
    }

    public JavaApplication3() {
        System.out.println("Default Constructor invoked !");
    }

    public static void main(String[] args) {
        JavaApplication3 obj = new JavaApplication3();
        System.out.println("This is main() method");
    }
}

/* Output :

    Static Initializer block
    This is Initializer block
    Default Constructor invoked !
    This is main() method
 */
