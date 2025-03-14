package Basics.Assignment1_3;

public class Q3 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 13;
        num2 = 8;
        System.out.printf("num1=%d; num2=%d;\n",num1, num2);
        num1 %= num2;
        System.out.printf("The result after modulus operation is :"+num1);
    }
}
