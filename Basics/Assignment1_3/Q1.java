package Basics.Assignment1_3;

public class Q1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 7;
        num2 = 8;
        num3 = 11;

        System.out.printf("num1=%d; num2=%d; num3=%d",num1, num2, num3);

        num1 = num2;
        num1 = num3;
        System.out.printf("\nnum1=%d; num2=%d; num3=%d",num1, num2, num3);
    }
}
