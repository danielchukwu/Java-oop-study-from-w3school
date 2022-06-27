// JAVA - 16.9
//
public class Car {
    String brand;
    String color;
    final int price;


    public Car(String _brand, String _color, int _price) {   // Class Constructor
        brand = _brand;
        color = _color;
        price = _price;
    }

    public static void main(String [] args){
        Car car1 = new Car("toyota", "red", 5_000_000);
        System.out.println(car1.brand);
    }
}
