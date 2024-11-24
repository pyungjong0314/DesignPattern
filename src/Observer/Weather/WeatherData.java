package Observer.Weather;
import java.util.*;

public class WeatherData implements Subject {
    double temper;
    double press;
    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer O : observers){
            O.update(temper, press);
        }
    }

    public void measureChange(){
        notifyObservers();
    }

    public void setMeasure(double t, double p){
        temper = t;
        press = p;
        measureChange();
    }
}
