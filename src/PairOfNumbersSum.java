// Python - 3.10
// Topic - White Board Coding Interview
// program - I am going to give you a collection of numbers, and I need you to take this collection of numbers and find a matching pair that is
//           equal to a sum that I am going to give you as well
// Inputs(arrays) and outputs(sum)
// collection 1 : [1, 2, 3, 9] sum = 8
// collection 2 : [1, 2, 4, 4] sum = 8

import java.util.HashSet;

public class PairOfNumbersSum {
    // These are my inputs and my outputs right
    // collection 1 : [1, 2, 3, 9] sum = 8
    // collection 2 : [1, 2, 4, 4] sum = 8
    // Interviewer: Ya those are the inputs and outputs for now

    // Me: Can I assume that the list is always going to be sorted
    // Interviewer: good question. well for now you can

    // Me: Do I have memory? and what is the most important factor in this code, is it time or space
    // Interviewer: It's time, and you do have memory

    // Me: What should the return of the Algorithm be. Boolean or the pair found, or just string saying pair found or something
    // Interviewer: Giggles. well I think returning a boolean value should be fine

    // Me: I noticed in collection1 that there is no pair that adds up to 8. so that would return false and in collection2 we have a pair 4, 4
    // Interviewer: Okay that's good

    // Me: Can a pair be the same number in the collection at a particular index with itself
    // Interviewer: No, we want pairs at different index

    // ANSWER 1:
    // Me: Okay the first solution that comes to mind is that we could use a double for loop on the same collection with two pointers and just loop and check to see if any pair
    // we come across adds up to the sum. But with that algorithm won't be very efficient with a Big O of O(n^2) Quadratic Time
    // Interviewer: Okay that sounds like one way to do it without a doubt but then again just like you said, that algorithm isn't the best scalability wise and it's too costly\
    //              for the company

    // ANSWER 2:
    // Me: Given that our input is sorted, in a single loop we could use a double pointer, 1 at the start and the other at the end of the list. Then we want to check if that's a
    //     pair --> if it is we found our match, if not we want to check is the pair greater than the goal sum, or lesser
    //     if pair > sum: we want to decrement the pointer at the end of the list and check if we've found a pair again
    //     else if pair < sum: we want to increment the first pointer and check if we've found a pair again
    //     | we continue this process until we find a pair, in a case were we want were the first pointer is equal to the last pointer we want to return False and stop the program

    // Interviewer: That is an absolutely amazing answer, how about we code that algorithm. What language would you like to use for this exercise i know for sure it's either js or python
    // Me: Well today I'll be using java

    // Me: I was just thinking of how i would handle input parameter error to our algorithm. To Handle incorrect inputs to this algorithm. I am thinking of having a function
    //     that takes both inputs ArrayList and integer and checks if they are the correct data type, if they are not we just return False. But since java requires you to
    //     input the correct types and throws an error if you don't, I can simply use a try catch block
    // Interviewer: I think that would be okay


    static boolean pairFound(int [] col, int goalSum){
        int fp = 0;  // first pointer
        int lp = col.length - 1;  // last pointer

        // How code will run: explained
        // {1, 2, 4, 4} | sum = 8
        //        ^  ^
        while (fp < lp){
            if ((col[fp] + col[lp]) == goalSum){
                return true;
            } else if ((col[fp] + col[lp]) < goalSum) {
                fp++;
                continue;
            } else if ((col[fp] + col[lp]) > goalSum) {
                lp--;
                continue;
            }
        }

        return false;
    }

    // Interviewer: That was Good. I love that. So this Algorithm has an O(n) Linear Time Complexity,
    //              What if the collection wasn't sorted. What would you do in such a case.

    // ANSWER 3:
    // Me: given that a list is unordered we could achieve linear time by iterating linearly and on every item we come across in the array, we want to check if that element is a compliment
    //     to any item in our compliments set data structure, if it is there is a pair --> return True; else we add the compliment of that item to the comliments ds, and we move on to
    //     the next item on the loop.
    // {1, 2, 4, 4}
    // compliments = {}

    static boolean pairFound2(int [] col, int goalSum){
        HashSet<Integer> compliments = new HashSet<Integer>();
        for (int num : col){
            if (compliments.contains(num)){
                return true;
            } else {
                compliments.add(goalSum-num);
                continue;
            }
        }
        return false;
    }
    public static void main(String [] args) {
        int [] collection1 = {1, 2, 3, 9};
        int [] collection2 = {1, 2, 4, 4};

        int goalSum = 8;

//        Answer 1
        boolean pair_found = pairFound(collection2, goalSum);
        System.out.println("Pair Found: " + pair_found);

//        Answer 2
        boolean pair_found2 = pairFound2(collection2, goalSum);
        System.out.println("Pair Found: " + pair_found2);

    }
}
