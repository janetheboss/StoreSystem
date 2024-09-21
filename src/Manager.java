import java.util.List;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Delete an order by index
    public void deleteOrder(Store store, int orderIndex) {
        List<Order> orders = store.getOrders();
        if (orderIndex >= 0 && orderIndex < orders.size()) {
            orders.remove(orderIndex);
            System.out.println("Order deleted successfully.");
        } else {
            System.out.println("Invalid order index.");
        }
    }

    // Edit an order by adding or removing products
    public void editOrder(Store store, int orderIndex, String action, Product product, int quantity) {
        List<Order> orders = store.getOrders();
        if (orderIndex >= 0 && orderIndex < orders.size()) {
            Order order = orders.get(orderIndex);
            if ("add".equalsIgnoreCase(action)) {
                order.addProduct(product, quantity);
                System.out.println("Product added to the order.");
            } else if ("remove".equalsIgnoreCase(action)) {
                order.removeProduct(product, quantity);
                System.out.println("Product removed from the order.");
            } else {
                System.out.println("Invalid action. Use 'add' or 'remove'.");
            }
        } else {
            System.out.println("Invalid order index.");
        }
    }

    // Edit customer details
    public void editCustomer(Store store, int customerId, String newName, int newId) {
        List<Customer> customers = store.getCustomers();
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                customer.setName(newName);
                customer.setId(newId);
                System.out.println("Customer information updated.");
                return;
            }
        }
        System.out.println("Customer not found.");
    }
}
