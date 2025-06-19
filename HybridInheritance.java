// Interface 1
interface Sports {
    void play();
}

// Interface 2
interface Music {
    void sing();
}

// Base class
class Person {
    void display() {
        System.out.println("Name: Shravani");
    }
}

// Derived class that combines all
class Student extends Person implements Sports, Music {
    public void play() {
        System.out.println("Shravani plays badminton.");
    }

    public void sing() {
        System.out.println("Shravani sings classical music.");
    }

    void study() {
        System.out.println("Shravani studies Java.");
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();   // From Person
        s.study();     // Own method
        s.play();      // From Sports interface
        s.sing();      // From Music interface
    }
}
