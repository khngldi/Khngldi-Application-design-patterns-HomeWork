public class MotorCycleFactory extends VehicleFactory {
    private String type;
    private int obiem;

    public MotorCycleFactory(String type, int obiem) {
        this.type = type;
        this.obiem = obiem;
    }

    @Override
    public IVehicle createVehicle() {

        return new Motorcycle(type, obiem);
    }
}
