package OOP;

import java.time.LocalTime;
public class SwitchStatement {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        switch(time.getHour()) {
            case 12:
                System.out.println("Good Morning !!");
            break;
            case 18:
                System.out.println("Good Evening !!");
            break;
            case 20:
                System.out.println("Good Night !!");
            break;
            default:
                System.out.println("Something went wrong !!");
        }
    }
}
