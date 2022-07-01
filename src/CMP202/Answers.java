package CMP202;
import java.util.Scanner;
public class Answers {
    // What is a constructor?
    // - A constructor is the first method that is called when an object of a class is created, it is used to initialize the object of that class

    // What is Method Overloading?
    // - Method Overloading is basically having methods with identical names but different signatures within a class

    // What is Method Overriding?
    // - Method Overriding simply means having the same method in a child class that is also in the parent class

    // What is an Interface?
    // - An Interface is a java class that provides abstraction and can only be inherited by other classes, it allows no object creation

    // A Class?
    // - A class is a blueprint for creating objects with attributes and behaviours

    // What is an Error?
    // - indicates trouble that primarily happens due to scarcity of system resources
    // What is an Exception?
    // - indicates issues that occur during runtime or compile time

    // Try and Catch?
    // - These are keywords that help handle exceptions due to data or coding errors during runtime
    // - A Try block is where the exception occurs
    // - A Catch block is where the exception is handled

    // Example of an exception handled
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        try {
            int data = input.nextInt();  // If instead of an integer, the user enters a string --> an exception is thrown, and it is handled by the catch
            Math.round(data);   // There will be an exception: Because you can only round a number not a string
        } catch (Exception e){
            System.out.println("Exception handled!");
        }
    }
}
