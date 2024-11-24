
package Factory.Pizza;
public class NYPizzaIngreFactory implements PizzaIngreFactory {
    public Dough createDough(){
        return new ThinDough();
    }
}
