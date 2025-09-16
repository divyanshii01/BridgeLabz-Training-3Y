import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

class Order {
    int id;
    List<Product> products = new ArrayList<>();

    Order(int id) { this.id = id; }

    void addProduct(Product p) { products.add(p); }

    void showProducts() {
        System.out.println("Order " + id + " has products:");
        for (Product p : products) System.out.println(" - " + p.name);
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) { this.name = name; }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order " + o.id);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        Order o1 = new Order(101);

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        o1.addProduct(p1);
        o1.addProduct(p2);

        c.placeOrder(o1);
        o1.showProducts();
    }
}
