package CMP202_2021_TESTQUESTIONS;
// Java
// Program - Write a program that finds the quadratic equation of some inputs

public class QuadraticEquation {

    public void findQESolution(int a, int b, int c){
        // Declaration of our variables to be used
        double sqr_result, top, top2, bottom, final_result, inside_sqr, final_result2;

        // 1st: top
        // (/b² - 4ac)
        inside_sqr = Math.pow(b, 2d) - (4 * a * c);
        if (inside_sqr != Math.abs(inside_sqr)){
            System.out.println("The Solution for this Quadratic Equation is Unknown. Thank You!");
            return;
        }
        sqr_result = Math.sqrt(inside_sqr);
//        if (sqr_result )
        // -b +- (/b² - 4ac)
        top = -b + sqr_result;
        top2 = -b - sqr_result;

        // 2nd: bottom
        // 2a
        bottom = 2 * a;

        final_result = top / bottom;
        final_result2 = top2 / bottom;

        System.out.println("a: " + final_result + " | b: " + final_result2);
    }

    public static void main(String [] args) {
        System.out.println("Hello World!");

        QuadraticEquation qe = new QuadraticEquation();
        qe.findQESolution(5, 20, 6);
//        System.out.println();
    }

}
