
package Factory;
public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngreFactory pizzaIngreFactory = new NYPizzaIngreFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngreFactory);
        }
        return pizza;
    }
}
