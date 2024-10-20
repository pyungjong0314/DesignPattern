
package Factory;
public class NYPizzaIngreFactory implements PizzaIngreFactory {
    public Dough createDough(){
        return new ThinDough();
    }
}
