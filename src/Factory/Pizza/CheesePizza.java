package Factory.Pizza;
public class CheesePizza extends Pizza {
    PizzaIngreFactory pizzaIngreFactory;

    public CheesePizza(PizzaIngreFactory pizzaIngreFactory){
        this.pizzaIngreFactory = pizzaIngreFactory;
    }

    public void prepare(){
        dough = pizzaIngreFactory.createDough();
    }
}
