package CMP202;
// JAVA
// Program - This is a java program that creates a method, a method that checks if a number is prime or not
// What is a Prime Number though: A prime number is any number that can only be divided by one and itself without remainder e.g 2, 3, 5, 7, 11
public class IsNumberPrime {

    public void isPrimeNumber(int number) {
        // To find out if a number is prime: we divide the number by 2, 3, 5, 7, 11, if none of these numbers can divide it with a remainder of 0, it is a prime number

        int [] divNums = {2, 3, 5, 7, 11};   // This is just a list, same as [2, 3, 5, 7, 11]

        for (int i = 0; i < divNums.length; i++){    // loop through list
            if (number != divNums[i]){               // if number equals not equal to itself: enter body and divide
                if (number % divNums[i] == 0){
                    System.out.println(number + " is not a prime number");
                    return;
                }
            }
        }

        // if None of the divNums could divide our number. Then
        System.out.println(number + " Is a prime number");
    }

    public static void main (String [] args) {
        // Object creation
        // className variableName = new className();
        IsNumberPrime isPrime = new IsNumberPrime();

        isPrime.isPrimeNumber(10); // object calls method
    }
}
