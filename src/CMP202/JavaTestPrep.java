package CMP202; // ignore this line, it shouldn't be added in your code

// JAVA
// Program - This is a java program that creates a method, a method that swaps two numbers and prints the result out
public class JavaTestPrep {
    public void swapTwoNumbers(int a, int b){
        int x = a;
        a = b;
        b = x;

        System.out.println("a: " + a + "| b: " + b);
    }

    public static void main (String [] args) {
        // Object creation
        // className variableName = new className();
        JavaTestPrep swapNumbers = new JavaTestPrep();

        swapNumbers.swapTwoNumbers(5, 10); // object calls method
    }
}