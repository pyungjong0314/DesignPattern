package Strategy;
public class Duck {
    String name;
    FlyBehavior flyBehavior;
    
    public void swim(){
        System.out.println("오리가 수영하는 중");
    }

    public void performfFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
}
