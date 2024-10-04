public class TruckFactory extends VehicleFactory {
    private int loadCapacity;
    private int axleCount;

    public TruckFactory(int loadCapacity, int axleCount) {
        this.loadCapacity = loadCapacity;
        this.axleCount = axleCount;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(loadCapacity, axleCount);
    }
}
