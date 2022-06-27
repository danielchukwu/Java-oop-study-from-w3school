public class Encapsulation {
    // Encapsulation: is the hiding of "sensitive" data from the user
    // declare class variables/attributes as private
    // provide public get and set methods to access and update the value of a private variable

    private String name;
    private int age;
    private float grade;

    // Private variables are only accessible within a class.
    // However, it is possible to access them if we provide public get and set methods
    // The get method returns the variable value, and the set method sets the value.

    public void setName(String name){   // Setter for our encapsulated(hidden from user) data
        this.name = name;
    }
    public String getName(){            // Getter for our encapsulated(hidden from user) data
        return this.name;
    }

    // main method: without a door you can't enter a house, without a main(String[] args) you can't run a java program
    public static void main(String [] args) {
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Daniel");          // Set Name
        String name = obj1.getName();    // Get Name

        System.out.println(name);
    }
}
