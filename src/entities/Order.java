package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDate moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDate moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {

    }

    public double total() {
        return 0.0;
    }

    //@override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        builder.append("Order Moment " + moment + "\n");
        builder.append("Order status :" + status + "\n");
        builder.append("Client: " + client.getName() + " - " + client.getEmail() + "\n");
        builder.append("Order items:");
        for (OrderItem c : items) {
            builder.append(c + "\n");
            sum += c.subTotal();
        }
        builder.append(String.format("%.2f", sum));
        return builder.toString();
    }
}
