public class Customer {
    private String name;
    private int id;
    private Order cart;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.cart = new Order(this);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getCart() {
        return cart;
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void removeFromCart(Product product, int quantity) {
        cart.removeProduct(product, quantity);
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + id + ")";
    }
}
