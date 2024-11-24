package Singletion;

class SingletonLazyHolder {
    private SingletonLazyHolder() {}

    // Holder로 만들어, 클래스가 메모리에 로드되지 않고 getInstance 메서드가 호출되어야 로드됨
    private static class SingleInstanceHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
