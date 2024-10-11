public class Product implements ICloneable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public Product clone() {
        return new Product(this.name, this.price);
    }

    @Override
    public String toString() {
        return "name='" + name + "', price=" + price ;
    }
}
