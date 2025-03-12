package OOP;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Method 1
        System.out.println("Metho 1 ");
        for(int i = 0; i < numbers.length;i++) {
            System.out.println("Printed Number is : " + numbers[i]);
        }

        System.out.println("Method 2");
        // Method 2
        for(int i:numbers) {
            System.out.println("Printed Number is : "+i);
        }
    }
}
