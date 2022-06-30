// Python - 3.10
// Topic - White Board Coding Interview
// program - I am going to give you a collection of numbers, and I need you to take this collection of numbers and find a matching pair that is
//           equal to a sum that I am going to give you as well
// Inputs(arrays) and outputs(sum)
// collection 1 : [1, 2, 3, 9] sum = 8
// collection 2 : [1, 2, 4, 4] sum = 8

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



    static boolean pairFound(int [] col, int goalSum){
        // System.out.println(Arrays.toString(col));

        int fp = 0;  // first pointer
        int lp = col.length;  // last pointer



        return false;
    }

    public static void main(String [] args) {
        int [] collection1 = {1, 2, 3, 9};
        int [] collection2 = {1, 2, 4, 4};
        System.out.println(collection2.length + "|" + collection1.length );


        int goalSum = 8;

        pairFound(collection1, goalSum);
    }
}
