package Adaptor.ClassAdaptor;

// 클라이언트에서 사용하고 싶은 기존의 서비스
class Service {
    void specificMethod(int specialData) {
        System.out.println("기존 서비스 기능 호출 + " + specialData);
    }
}

// Client Interface (클라이언트가 접근해서 사용할 어댑터 모듈)
interface Target {
    void method(int data);
}

// Adapter (서비스를 클라이언트에서 사용하게 할 수 있도록 호환 처리 해주는 어댑터)
class Adapter extends Service implements Target {

    // 어댑터의 메소드가 호출되면, 부모 클래스 Adaptee의 메소드를 호출
    public void method(int data) {
        specificMethod(data);
    }
}

class Client {
    public static void main(String[] args) {
        // 1. 어댑터 생성
        Target adapter = new Adapter();

        // 2. 인터페이스의 스펙에 따라 메소드를 실행하면 기존 서비스의 메소드가 실행된다.
        adapter.method(1);
    }
}
