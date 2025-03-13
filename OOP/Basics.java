package OOP;

public class Basics {
    int id; //field or data member or instance variable
    String name;
    public static void main(String[] args) {
        Basics new1 = new Basics();
        //Object of Basic

        new1.id = 1234;
        new1.name = "This is a Basics Object";

        System.out.println("ID : "+new1.id);
        System.out.println("Name :"+new1.name);
    }
}
