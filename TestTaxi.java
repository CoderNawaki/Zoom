public class TestTaxi {
    public static void main(String[] args) {
        Car car = new Taxi(5);

        car.getClass();

    }

}

class Car {
    public Car() {
        System.out.println("This is a vehicle.");
    }

    public Car(int num) {

        System.out.println("this vehicle carries" + num + "peoplle");
    }
}

class Taxi extends Car {
    public Taxi() {

        System.out.println("It has a taximeter");
    }

    public Taxi(int num) {
        super(5);
        System.out.println("calling super");

    }

}
