public class Abstraction {
    // What is Abstraction?
    // it is basically hiding certain details and only showing essential information accessible to the user

    // What are Abstract Classes and Abstract Methods?
    // Abstract Classes are classes that cannot be used to create objects(to access it, it must be inherited)
    // Abstract Methods are methods that can only be used in an abstract class, and it does not have any body
}
abstract class Alien {            // Abstract Class
    abstract public void speak(); // abstract methods have no-body
    public void sleep(){          // non-abstract methods can be used in abstract classes
        System.out.println("Alien sleeps: Argghhkatukatu!!!");
    }
}
class GreenAlien extends Alien {
    public void speak(){
        System.out.println("Alien Speaks: Za luta katula");
    }
}

class AlienReady {
    public static void main(String [] args){
        GreenAlien alien1 = new GreenAlien();

        alien1.speak();
        alien1.sleep();
    }
}