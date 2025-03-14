package Basics.Assignment2;

import java.util.Scanner;
public class Q2 {
     
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while(running) {
            System.out.println("Search Area :");
            System.out.println(" ---------------------------------------------- ");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Rectangle");
            System.out.println("4. Cylinder");
            System.out.println("5. Exit");
            System.out.println(" ---------------------------------------------- ");

            System.out.println("Enter your choice here :");
            int choice = scanner.nextInt();
            scanner.nextLine();

            double area;
            switch(choice) {
                case 1:
                    System.out.println("Enter side length here :");
                    int side = scanner.nextInt();
                    scanner.nextLine();
                    area = Math.pow(side,2);
                break;
                case 2:
                    System.out.println("Enter radius here :");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    area = Math.PI * Math.pow(radius, 2);
                break;
                case 3:
                    System.out.println("Enter length here :");
                    double length = scanner.nextDouble();
                    scanner.nextLine();
                    double width = scanner.nextDouble();
                    scanner.nextLine();
                    area = length * width;
                break;
                case 4:
                    System.out.println("Enter radius here :");
                    double cylinderRadius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Cylinder height :");
                    double cylinderHeight = scanner.nextDouble();
                    scanner.nextLine();
                    area = 2 * Math.PI * cylinderRadius * cylinderHeight;
                break;
                case 5:
                    System.out.println("Exit Successfully from the program !");
                    running = false;
                break;
                default:
                    System.out.println("Given Input is Invalid");
            }
        }

        scanner.close();
    }
}
