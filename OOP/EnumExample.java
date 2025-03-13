package OOP;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Color {
    PINK, PURPLE, BLUE, BLACK, WHITE, ORANGE, GREEN;
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        Color myFavoriteColor = Color.BLACK;
        System.out.println("My Favorite Color is :" + myFavoriteColor);

        switch(Day.MONDAY) {
            case MONDAY:
                System.out.println("Monday is Bad !");
            break;
            case TUESDAY:
                System.out.println("Tuesday is also Bad !");
            break;
            case WEDNESDAY:
                System.out.println("Wednesday is not Bad !");
            break;
            case THURSDAY:
                System.out.println("Thursday is also Bad !");
            break;
            case FRIDAY:
                System.out.println("Friday is not Bad !");
            break;

            default:
                System.out.println("Invalid Day Example");
        }
    }
}

