package Decorate;

public class Sugar extends Condiment {
    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", 설탕";
    }
    
    public double cost(){
        return coffee.cost() + 0.5;
    }
}
