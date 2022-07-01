package CMP202;
// JAVA
// Program - This is a java program that creates a method, a method that prints the first 100 multiples of 3
// For Example - 3 * 3 = 9, then 9 * 3 = 27, then 27 * 3 = 81, then keep multiplying by 3 for 100 times
public class First100MultipleOf3 {

    public void printFirst100MultipleOf3 () {
        int num;   // declaration
        num = 3;   // initialization

        for (int i = 0; i < 100; i++){ // loop runs for 100 times then stops
            num = num * 3;   // num = 3 * 3, then num = 9 * 3, then num = 27 * 3, repeats for 100 times
            System.out.println(num);
        }
    }

    public static void main(String [] args){
        // Object creation
        // className variableName = new className();
        First100MultipleOf3 threeMultiples = new First100MultipleOf3();

        threeMultiples.printFirst100MultipleOf3();
    }
}
