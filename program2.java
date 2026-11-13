
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

class OOPSConcepts {
    public static void main(String[] args) {
        System.out.println("NAME: UMME AIMAN");
        System.out.println("REG NO: 25BTIT115");
        System.out.println("------------------------------");

        Dog d = new Dog();
        d.sound();

        System.out.println("Inheritance demonstrated");
        System.out.println("Polymorphism demonstrated");
    }
}
