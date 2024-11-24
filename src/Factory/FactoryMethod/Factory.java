package Factory.FactoryMethod;

// 공장 객체 추상화 (추상 클래스)
abstract class AbstractFactory {

    // 객체 생성 전처리 후처리 메소드 (final로 오버라이딩 방지)
    final IProduct createOperation() {
        IProduct product = createProduct(); // 서브 클래스에서 구체화한 팩토리 메서드 실행
        product.setting(); // .. 이밖의 객체 생성에 가미할 로직 실행
        return product; // 제품 객체를 생성하고 추가 설정하고 완성된 제품을 반환
    }

    // 팩토리 메소드 : 구체적인 객체 생성 종류는 각 서브 클래스에 위임
    abstract protected IProduct createProduct();
}

// 공장 객체 A (ProductA를 생성하여 반환)
class ConcreteFactoryA extends AbstractFactory {
    private ConcreteFactoryA() {}

    private static class singleInstance{
        private static final ConcreteFactoryA INSTANCE = new ConcreteFactoryA();
    }

    public static ConcreteFactoryA getInstance() {
        return singleInstance.INSTANCE;
    }

    @Override
    protected IProduct createProduct() {
        return new ConcreteProductA();
    }
}

// 공장 객체 B (ProductB를 생성하여 반환)
class ConcreteFactoryB extends AbstractFactory {
    private ConcreteFactoryB() {}

    private static class singleInstance {
        private static final ConcreteFactoryB INSTANCE = new ConcreteFactoryB();
    }

    public static ConcreteFactoryB getInstance() {
        return singleInstance.INSTANCE;
    }

    @Override
    protected IProduct createProduct() {
        return new ConcreteProductB();
    }
}
