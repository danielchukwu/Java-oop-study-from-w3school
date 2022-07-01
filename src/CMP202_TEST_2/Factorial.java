package CMP202_TEST_2;

import java.util.Scanner;

// Java
// Program: Write a method that takes in user input and find the factorial of the user input
public class Factorial {

    public void findFactorial (int num) {
        int factorial = num;
        int oldNum = num -1;  // 3, 2, 1.

        for (int i = 0; i < num; i++) {
//            System.out.println(factorial + " * " + oldNum);

            if (oldNum > 0){
                factorial = factorial * oldNum;
                oldNum--;
            }
//            System.out.println(factorial);
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }

    public static void main (String [] args) {
        // Take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find it's Factorial: ");
        int enteredNumber = input.nextInt(); // user enters int

        Factorial checkNum = new Factorial();
        checkNum.findFactorial(enteredNumber);

    }
}
