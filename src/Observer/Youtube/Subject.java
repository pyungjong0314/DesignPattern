package Observer.Youtube;

import java.util.Observable;
import java.util.Random;

class WeatherAPI extends Observable {
    float temp; // 온도
    float humidity; // 습도
    float pressure; // 기압

    void measurementsChanged() {
        // 현재의 온습도 데이터를 랜덤값으로 얻는 것으로 비유하였다.
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        /* 부모 클래스 Observable의 부모 메서드 */
        setChanged(); // 내부 플래그를 true 로 만들어 알림이 동작하게 끔 한다
        notifyObservers(); // 옵저버들에게 알림 전파
    }
}