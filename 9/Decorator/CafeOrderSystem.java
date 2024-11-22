public class CafeOrderSystem {
    public static void main(String[] args) {
        Beverage order = new Espresso();
        order = new Milk(order);
        order = new Sugar(order);
        order = new WhippedCream(order);

        System.out.println("Order: " + order.getDescription());
        System.out.println("Total cost: $" + order.getCost());

        Beverage teaOrder = new Tea();
        teaOrder = new Sugar(teaOrder);
        teaOrder = new Milk(teaOrder);

        System.out.println("Order: " + teaOrder.getDescription());
        System.out.println("Total cost: $" + teaOrder.getCost());
    }
}
