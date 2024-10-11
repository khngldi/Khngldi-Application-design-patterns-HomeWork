public class Test {
    public static void main(String[] args) {
        Order originalOrder = new Order();
        originalOrder.setShippingCost(15.99);
        originalOrder.setPaymentMethod("Credit Card");

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 25.50);
        originalOrder.addProduct(product1);
        originalOrder.addProduct(product2);

        Discount discount1 = new Discount("Summer Sale", 50.00);
        Discount discount2 = new Discount("Loyalty Discount", 10.0);
        originalOrder.addDiscount(discount1);
        originalOrder.addDiscount(discount2);

        System.out.println("-----Original Order----");
        System.out.println(originalOrder);

        Order clonedOrder = originalOrder.clone();

        clonedOrder.setPaymentMethod("PayPal");
        clonedOrder.setShippingCost(9.99);
        clonedOrder.getProducts().get(0).setPrice(899.99);
        clonedOrder.addProduct(new Product("Keyboard", 45.00));
        clonedOrder.getDiscounts().remove(0);

        System.out.println("\n=== Cloned Order (After Modifications) ===");
        System.out.println(clonedOrder);

        System.out.println("\n=== Original Order (After Cloning and Modifications to Clone) ===");
        System.out.println(originalOrder);

        System.out.println("\n=== Instance Comparison ===");
        System.out.println("Are both orders the same instance? " + (originalOrder == clonedOrder));
    }
}
