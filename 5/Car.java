public class Car implements IVehicle {
    private String marka;
    private String model;
    private String topliva;

    public Car(String marka, String model, String topliva) {
        this.marka = marka;
        this.model = model;
        this.topliva = topliva;
    }

    @Override
    public void drive() {
    }

    @Override
    public void zapravka() {
    }
}

