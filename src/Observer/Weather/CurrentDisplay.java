package Observer.Weather;
public class CurrentDisplay implements Observer, DisplayElement {
    double temper;
    double press;
    WeatherData weatherData;

    CurrentDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display(){
        System.out.println(temper + " " + press);
    }
    
    public void update(double t, double p){
        temper = t;
        press = p;
        display();
    }

}
