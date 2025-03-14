package Basics.Assignment1;

import java.util.Scanner;
public class Ass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number here :");
        int firstNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your second number here :");
        int secondNum = scanner.nextInt();

        scanner.nextLine();

        int sum = firstNum + secondNum;

        System.out.println("Summation of given two numbers :" + sum);


        scanner.close();
    }
}
