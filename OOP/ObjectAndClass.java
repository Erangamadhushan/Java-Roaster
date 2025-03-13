package OOP;

import java.time.LocalTime;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    String address;
    String gender;
}
public class ObjectAndClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.println("Enter Employee ID here :");
        e1.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Employee Name here :");
        e1.name = scanner.nextLine();

        System.out.println("Enter Employee Address here :");
        e1.address = scanner.nextLine();

        System.out.println("Enter Employee Gender here :");
        e1.gender = scanner.nextLine();

        System.out.println("Print Employee Details :");
        System.out.println(" ========================================================= ");
        System.out.println("Employee ID : " + e1.id);
        System.out.println("Employee Name :"+e1.name);
        System.out.println("Employee Address :"+e1.address);
        System.out.println("Employee Gender is :"+e1.gender);
        System.out.println(" ========================================================= ");

    }
}
