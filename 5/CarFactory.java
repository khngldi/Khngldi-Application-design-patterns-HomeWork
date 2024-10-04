public class CarFactory extends VehicleFactory {
    private String marka;
    private String model;
    private String toplivo;

    public CarFactory(String marka, String model, String toplivo) {
        this.marka = marka;
        this.model = model;
        this.toplivo = toplivo;
    }

    @Override
    public IVehicle createVehicle() {
        return new Car(marka, model, toplivo);
    }
}
