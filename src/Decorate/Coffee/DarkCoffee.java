package Decorate.Coffee;

public class DarkCoffee extends Coffee {
    public DarkCoffee(){
        description = "다크 커피";
    }

    public double cost(){
        return 2.0;
    }
}
