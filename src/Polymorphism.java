public class Polymorphism {
    // Polymorphism means "many forms"
    // This happens when multiple classes are related through Inheritance
}
class Animal {
    public void animalSound() {
        System.out.println("The Animal makes a sound!");
    }
}
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee!");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The pig says: bow wow!");
    }
}
class Ready {
    public static void main(String [] args){
        Dog dog1 = new Dog();
        Pig pig1 = new Pig();
        pig1.animalSound();
        dog1.animalSound();
    }
}