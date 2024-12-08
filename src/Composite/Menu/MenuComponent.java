package Composite.Menu;
import java.util.*;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDescription(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void print(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public abstract Iterator createIterator();
}
