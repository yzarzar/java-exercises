package Inheritance;

public class Main {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cow = new Cow();
        Animal cat = new Cat();

        animal.sound();
        cow.sound();
        cat.sound();
    }
}
