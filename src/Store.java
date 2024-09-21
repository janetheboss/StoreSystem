import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory;
    private List<Customer> customers;
    private List<Order> orders;

    public Store() {
        this.inventory = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void createOrder(Customer customer, List<Product> productList) {
        Order order = new Order(customer);
        for (Product product : productList) {
            order.addProduct(product, 1);
        }
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void displayInventory() {
        System.out.println("Store Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    public void displayCustomers() {
        System.out.println("Store Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void displayOrders() {
        System.out.println("Store Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
