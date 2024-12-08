package Iterator.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouse implements Menu {
    ArrayList menuItems;

    public PancakeHouse() {
        menuItems = new ArrayList();

        addItem("팬케이크 세트", "팬케이크 세트 설명", 2.99);
        addItem("블루베리 펜케이크", "블루베리 펜케이크 설명", 3.49);
        addItem("와플", "와플 설명", 3.57);
    }

    public void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
