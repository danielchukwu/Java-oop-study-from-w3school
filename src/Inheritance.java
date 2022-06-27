// Java - 16
// Lecture - Inheritance
public class Inheritance {
    // In Java, it is possible to inherit attributes and methods from one class to another
    // we do that using the - extends keyword

    // subclass (child) - the class that inherits from another class
    // superclass (parent) - the class being inherited from

    // Check out the Vehicle Class to see example
}
class Human {   // superclass
    protected String name;
    protected String age;
    public void walk(){
        System.out.println(this.name + " is walking");
    }
    public void jump(){
        System.out.println(this.name + " jumped");
    }
}

class Man extends Human { // subclass - inherits the variables and the functions walk() and jump()
    public static void main(String [] args){
        Man man1 = new Man();
        man1.name = "nathan";
        System.out.println(man1.name);
        man1.walk();
    }
}
