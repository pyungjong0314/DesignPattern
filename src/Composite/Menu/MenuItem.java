package Composite.Menu;
import java.util.*;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public void print(){
        System.out.print(getName() + ", ");
        System.out.print(getPrice() + " : ");
        System.out.println(getDescription());
    }

    public Iterator createIterator(){
        return new NullItxerator();
    }
}
