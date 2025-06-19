// Base class (Parent)
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Creating object of child class

        myDog.sound();  // Inherited method from Animal
        myDog.bark();   // Method of Dog class
    }
}
