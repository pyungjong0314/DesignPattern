package Strategy.Card;

public class User {
    public static void main(String[] args) {
        // 쇼핑카트 전략 컨텍스트 등록
        ShoppingCart cart = new ShoppingCart();

        // 쇼핑 물품
        Item A = new Item("맥북 프로", 10000);
        Item B = new Item("플레이스테이션", 30000);
        cart.addItem(A);
        cart.addItem(B);

        // LUNACard로 결제 전략
        cart.pay(new LUNACardStrategy("kang@kw.ac.kr", "designpattern"));

        // KAKAOBank로 결제 전략
        cart.pay(new KAKAOCardStrategy("강평종", "123456789"));
    }
}
