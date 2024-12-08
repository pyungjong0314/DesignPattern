package Composite.Menu;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent m) {
        menus = m;
    }

    public void printMenu() {
        menus.print();
    }

    public static void main(String[] args){
        MenuComponent pancakeMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu =  new Menu("디저트 메뉴", "디저트 메뉴 설명");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("파스타", "파스타 설명", 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("파이", "파이 설명", 1.5));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
