public class Tea implements Beverage {
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
