package Factory.Pizza;
public abstract class Pizza {
    String name;
    Dough dough;

    public abstract void prepare();

    public void cut(){
        System.out.println("자르기");
    }
    
    public void box(){
        System.out.println("포장하기");
    }
}
