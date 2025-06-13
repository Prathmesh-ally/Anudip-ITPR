// Save this in a file named abstraction.java

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
        myCat.sleep();  // This method is inherited from Animal
    }
}
