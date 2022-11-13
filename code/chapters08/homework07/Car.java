package homework07;

public class Car {
    private int temperature;
    // private Air air;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (Car.this.temperature > 40) {
                System.out.println("吹冷气");
            } else if (Car.this.temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }
}
