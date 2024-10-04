public class Truck implements IVehicle {
    private int loadCapacity;
    private int Countosi;

    public Truck(int loadCapacity, int Countosi) {
        this.loadCapacity = loadCapacity;
        this.Countosi = Countosi;
    }

    @Override
    public void drive() {
    }

    @Override
    public void zapravka() {
    }
}
