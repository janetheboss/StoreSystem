import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product apple = new Product("Apple", 0.99, 100);
        Product banana = new Product("Banana", 0.59, 150);
        Product milk = new Product("Milk", 1.49, 50);

        store.addProduct(apple);
        store.addProduct(banana);
        store.addProduct(milk);

        Customer customer1 = new Customer("Alice", 1);
        Customer customer2 = new Customer("Bob", 2);

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        System.out.println("\nCustomer is adding products to the cart...");
        customer1.addToCart(apple, 2);
        customer1.addToCart(banana, 3);

        System.out.println("\nCustomer's Cart:");
        System.out.println(customer1.getCart());

        System.out.println("\nCustomer is removing a product from the cart...");
        customer1.removeFromCart(banana, 1);

        System.out.println("\nUpdated Cart:");
        System.out.println(customer1.getCart());

        store.displayInventory();
    }
}
