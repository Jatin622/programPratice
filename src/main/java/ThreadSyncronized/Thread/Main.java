package ThreadSyncronized.Thread;
//example of runnable
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();

        // Use Dog as a Runnable for a thread
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// A class implementing Runnable and extending Animal
class Dog extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog is running in a separate thread");
    }
}

