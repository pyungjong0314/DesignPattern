package Strategy;
public class MalDuck extends Duck {
    public MalDuck(){
        flyBehavior = new FlyWithWings();
    }
}
