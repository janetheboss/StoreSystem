import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() >= quantity) {
            product.reduceQuantity(quantity);
            products.add(product);
            System.out.println(quantity + " " + product.getName() + "(s) added to the cart.");
        } else {
            System.out.println("Not enough stock for product: " + product.getName());
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (products.contains(product)) {
            product.reduceQuantity(-quantity);
            products.remove(product);
            System.out.println(quantity + " " + product.getName() + "(s) removed from the cart.");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order for " + customer.getName() + ":\n");
        for (Product product : products) {
            orderDetails.append(product.toString()).append("\n");
        }
        return orderDetails.toString();
    }
}
