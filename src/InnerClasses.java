public class InnerClasses {
    // An Inner Class or Nested Class
    // is a class within a class
}

class OuterClass{
    int x = 5;
    class InnerClass{
        int y = 10;
    }
}

class WeReady {
    public static void main(String[] args) {
        OuterClass firstClass = new OuterClass();
        OuterClass.InnerClass secondClass = firstClass.new InnerClass();

        System.out.println(firstClass.x);
        System.out.println(secondClass.y);
    }
}
