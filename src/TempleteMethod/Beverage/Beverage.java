package TempleteMethod.Beverage;

public abstract class Beverage {
    public void recipe(){
        boilWater();
        add();
        pourInCup();
        if(wantCondiments()){
            System.out.println("첨가물 추가");
        }
    }

    public abstract void add();

    public void boilWater(){
        System.out.println("물 추가");
    }

    public void pourInCup(){
        System.out.println("컵");
    }

    // hook
    boolean wantCondiments(){
        return true;
    }
}
