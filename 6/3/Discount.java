public class Discount implements ICloneable<Discount> {
    private String type;
    private double amount;

    public Discount(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public Discount clone() {
        return new Discount(this.type, this.amount);
    }

    @Override
    public String toString() {
        return "type='" + type + "', amount=" + amount;
    }
}
