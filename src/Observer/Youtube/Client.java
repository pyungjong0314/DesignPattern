package Observer.Youtube;

public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        // 옵저버 리스트 추가
        api.addObserver(new KoreanUser("강평종"));
        api.addObserver(new KoreanUser("JAVA"));

        // 온습도기에서 현재 상태의 온습도 정보가 갱신됨
        api.measurementsChanged();
    }
}
