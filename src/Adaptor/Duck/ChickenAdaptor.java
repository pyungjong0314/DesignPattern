package Adaptor.Duck;

public class ChickenAdaptor implements Duck{
    Chicken chicken;

    public ChickenAdaptor(Chicken chicken){
        this.chicken = chicken;
    }

    public void duckSwim(){
        chicken.chickenSwim();
    }
}
