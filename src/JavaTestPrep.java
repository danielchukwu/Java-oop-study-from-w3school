public class JavaTestPrep {

    public void swapTwoNumbers(float a, float b){
        float x = a;
        a = b;
        b = x;

        System.out.println("a: " + a + "| b: " + b);
//        return a, b;
    }

    public static void main (String [] args) {
        // className variableName = new className();
        JavaTestPrep swapNumbers = new JavaTestPrep();

        // a = 5.0 | b = 10.0
        swapNumbers.swapTwoNumbers(5f, 10f);
    }
}