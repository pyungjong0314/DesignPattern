package Decorate.Synchronize;

public class Client {
    public static void main(String[] args) {
        IData data = new MyData();

        // 시간 측정 하고 싶을 때
        IData data1 = new timerMeasureDecorator(data);
        data1.setData(1);

        // 동시성이 적용된 로직 안의 코드를 시간 측정 하고 싶을 때
        IData data2 = new SynchronizedDecorator(new timerMeasureDecorator(data));
        data2.setData(1);

        // 동시성이 적용된 코드를 시간 측정 하고 싶을 떄
        IData data3 = new timerMeasureDecorator(new SynchronizedDecorator(data));
        data3.setData(1);
    }
}
