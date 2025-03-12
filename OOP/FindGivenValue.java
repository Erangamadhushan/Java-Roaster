package OOP;

import java.util.Scanner;
public class FindGivenValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        int[] numberList = {12, 34, 45, 61, 50, 91, 40, 69, 78, 47, 22};
        System.out.println("Enter Check Number here :");
        int checkNumber = scanner.nextInt();
        scanner.nextLine();

        for(int loopNumber:numberList) {
            if(loopNumber == checkNumber) {
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Given Number not included !!");
        }
        else {
            System.out.println("Given Number is included !!");
        }


        scanner.close();
    }
}
