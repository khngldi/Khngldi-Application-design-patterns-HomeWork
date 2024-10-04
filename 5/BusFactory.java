public class BusFactory extends VehicleFactory {
    private int vmestimost;

    public BusFactory(int vmestimost) {
        this.vmestimost = vmestimost;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(vmestimost);
    }
}
