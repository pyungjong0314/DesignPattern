package Strategy.Card;

import java.util.*;

class Item {
    public String name;
    public int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }
}

class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = 0;
        for (Item item : items) {
            amount += item.price;
        }
        paymentMethod.pay(amount);
    }
}
