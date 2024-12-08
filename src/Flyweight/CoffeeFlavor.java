package Flyweight;
import java.util.*;

class CoffeeFlavor {
    private final String name;
    CoffeeFlavor(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Menu acts as a factory and cache for CoffeeFlavour flyweight objects
class Menu {
    private Map<String, CoffeeFlavor> flavours = new HashMap<>();

    CoffeeFlavor lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavor(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}

class Order {
    private final int tableNumber;
    private final CoffeeFlavor flavour;
    Order(int tableNumber, CoffeeFlavor flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }
    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}

class CoffeeShop {
    private final List<Order> orders = new ArrayList<Order>();
    private final Menu menu = new Menu();

    void takeOrder(String flavourName, int table) {
        CoffeeFlavor flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    void service() {
        for (Order order : orders)
            order.serve();
    }

    String report() {
        return "\ntotal CoffeeFlavour objects made: "
                + menu.totalCoffeeFlavoursMade();
    }
}