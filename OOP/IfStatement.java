package OOP;

    
public class IfStatement {
    public static void main(String[] args) {
        int hour = 10;

        if(hour < 12) {
            System.out.println("Good Morning !!");
        }
        else if(hour < 18) {
            System.out.println("Good Afternoon !!");
        }
        else {
            System.out.println("Good day !!");
        }
    }
}