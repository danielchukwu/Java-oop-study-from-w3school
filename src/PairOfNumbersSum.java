// Python - 3.10
// Topic - White Board Coding Interview
// program - I am going to give you a collection of numbers, and i need you to take this collection of numbers and find a matching pair that is
//           equal to a sum that i am going to give you as well
// Inputs(arrays) and outputs(sum)
// collection 1 : [1, 2, 3, 9] sum = 8
// collection 2 : [1, 2, 4, 4] sum = 8

import java.util.Arrays;

public class PairOfNumbersSum {
    static void pairFound(int [] col1, int [] col2){
        System.out.println(Arrays.toString(col1));
        System.out.println(Arrays.toString(col2));

        System.out.println("Hello world");
    }

    public static void main(String [] args) {
        int [] collection1 = {1, 2, 3, 9};
        int [] collection2 = {1, 2, 4, 4};

        pairFound(collection1, collection2);
    }
}
