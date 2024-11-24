package Factory.AbstractFactoryMethod;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ComponentAbstractFactoryMethod factory = null;

        // 윈도우 컴포넌트 생성
        factory = new WindowFactoryMethod();
        List<Component> list = factory.createOperation();

        System.out.println(list);
        for(Component c: list) {
            c.render();
        }
    }
}
