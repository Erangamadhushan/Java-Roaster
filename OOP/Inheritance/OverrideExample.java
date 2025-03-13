package OOP.Inheritance;

class Animal {
    void breath() {
        System.out.println("Breathing ....");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swimming ...");

    }

    // @ Override
    void breath() {
        System.out.println("Bubbling ...");
    }
}
public class OverrideExample {
    
}
