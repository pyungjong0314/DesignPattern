package Iterator.Menu;
import java.util.*;

public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("버거와 감자튀김", "버거 세트 설명", 3.99);
        addItem("커피 세트", "커피 세트 설명", 2.99);
        addItem("파스타", "파스타 설명", 3.55);
    }

    public void addItem(String name, String description, double price) {
        MenuItem item = new MenuItem(name, description, price);
        menuItems.put(item.getName(), item);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
