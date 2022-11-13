package homework06;

public class TestMain {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Person p =  new Person("唐僧", horse);

        FactoryTraffic factoryTraffic = new FactoryTraffic();
        factoryTraffic.getWork(p.getVehicles());
    }
}
