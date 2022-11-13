package homework06;

public class FactoryTraffic {
    public void getWork(Vehicles vehicles) {
        if (vehicles instanceof Horse) {
            ((Horse) vehicles).work();
        } else if (vehicles instanceof Boat) {
            ((Boat) vehicles).work();
        }
    }
}
