package Factory.FactoryMethod;

// 제품 객체 추상화 (인터페이스)
interface IProduct {
    void setting();
}

// 제품 구현체
class ConcreteProductA implements IProduct {
    public void setting() {
        System.out.println("A");
    }
}

class ConcreteProductB implements IProduct {
    public void setting() {
        System.out.println("B");
    }
}