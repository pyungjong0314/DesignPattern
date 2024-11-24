package Factory.AbstractFactory;

class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;

        // 1. 공장군 1을 가동시킨다.
        factory = new ConcreteFactory1();

        // 2. 공장군 1을 통해 제품군 A1를 생성하도록 한다
        AbstractProductA product_A1 = factory.createProductA();
        System.out.println(product_A1.getClass().getName()); // ConcreteProductA1

        // 3. 공장군 2를 가동시킨다.
        factory = new ConcreteFactory2();

        // 4. 공장군 2를 통해 제품군 A2를 생성하도록 한다
        AbstractProductA product_A2 = factory.createProductA();
        System.out.println(product_A2.getClass().getName()); // ConcreteProductA2
    }
}
