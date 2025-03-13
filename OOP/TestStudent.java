package OOP;

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " - " + name);
    }
}
public class TestStudent {
    public static void main(String[] args ){
        Student stu1 = new Student();
        // Insert Data
        stu1.insertRecord(1, "Rahul");
        

        //Display Data
        stu1.displayInformation();

    }
}
