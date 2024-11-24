package Strategy.Duck;
public class MalDuck extends Duck {
    public MalDuck(){
        flyBehavior = new FlyWithWings();
    }
}
