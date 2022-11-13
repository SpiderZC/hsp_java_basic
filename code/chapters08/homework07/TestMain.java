package homework07;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car(21);

        Car.Air air = car.new Air();
        air.flow();

    }
}
