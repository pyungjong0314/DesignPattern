package Iterator.Menu;
import java.util.*;

public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            System.out.println("----메뉴----");
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice()  + " : ");
            System.out.println(menuItem.getDescription());
        }
    }

    public static void main(String[] args){
        ArrayList menus = new ArrayList();
        Menu pancakeHouse = new PancakeHouse();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        menus.add(pancakeHouse);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
