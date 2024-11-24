package Singletion;

public enum SingletonEnum {
    INSTANCE; // 유일한 인스턴스 정의

    private int counter;

    // 메서드로 동작 구현
    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void resetCounter() {
        counter = 0;
    }
}

class Client {
    public static void main(String[] args) {
        // Singleton 인스턴스 접근
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        // Counter 증가
        singleton.incrementCounter();
        singleton.incrementCounter();
        System.out.println("Current Counter: " + singleton.getCounter());

        // 다른 곳에서도 동일 인스턴스 사용
        SingletonEnum anotherSingleton = SingletonEnum.INSTANCE;
        System.out.println("same instance? " + (singleton == anotherSingleton));
    }
}