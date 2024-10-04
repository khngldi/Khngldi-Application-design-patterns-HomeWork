package SRP;

import SRP.Order;

public class Calculator {
    public double calculatetotalprice(Order order){
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}
