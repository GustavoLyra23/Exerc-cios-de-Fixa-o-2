package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public void setPrice(Double price) {
    }

    public Double getPrice() {
        return price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal() {
        return price * quantity;
    }

    public String toString() {
        String builder = product.getName() + ", " +
                "Quantity: " + quantity + "," +
                "Subtotal: $" + subTotal();
        return builder;
    }
}
