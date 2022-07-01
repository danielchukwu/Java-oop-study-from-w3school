package CMP202;   // ignore this line, it shouldn't be added in your code
// JAVA
// Program - This is a java program that creates a method, a method that checks if a number is even or odd
public class CheckEvenOrOdd {

    public void isNumberEvenOrOdd(int number){
        // number % 2: This says after dividing number by 2 what is the remainder
        // e.g 5 % 2 = 1, 4 % 2 = 0. So after dividing what is the remainder

        if (number % 2 == 0){          // if remainder is 0
            System.out.println(number + " is an Even number");
        } else if (number % 2 != 0) {  // if remainder not 0
            System.out.println(number + " is an Odd number");
        }
    }
    public static void main(String [] args) {
        // Object creation
        // className variableName = new className();
        CheckEvenOrOdd myNumber = new CheckEvenOrOdd();

        myNumber.isNumberEvenOrOdd(10);  // object calls method
    }
}
