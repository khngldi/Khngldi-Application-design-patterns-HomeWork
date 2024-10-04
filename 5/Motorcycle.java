public class Motorcycle implements IVehicle {
    private String type;
    private int obiem;

    public Motorcycle(String type, int obiem) {
        this.type = type;
        this.obiem = obiem;
    }

    @Override
    public void drive() {
    }

    @Override
    public void zapravka() {
    }
}
