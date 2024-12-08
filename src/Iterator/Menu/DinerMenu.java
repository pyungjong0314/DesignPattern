package Iterator.Menu;
import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT", "BLT 설명", 2.99);
        addItem("감자 샐러드", "감자 샐러드 설명", 3.29);
        addItem("핫도그", "핫도그 설명", 3.05);
    }

    public void addItem(String name, String description, double price) {
        MenuItem item = new MenuItem(name, description, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("메뉴가 가득 찼습니다.");
        }
        else{
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
