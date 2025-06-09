class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class singleinheritance1 {
    public static void main(String[] args) {
        Animal a = new Animal();  // Base class object
        Dog d = new Dog();        // Derived class object

        a.sound();  // Output: Animal makes a sound
        d.sound();  // Output: Dog barks
    }
}
