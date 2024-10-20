package Factory;
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
