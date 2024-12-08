package State.Gumball;

public class NoQuaterState implements State{
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("동전을 넣었습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter(){
        System.out.println("동전을 넣으세요.");
    }
    public void turnCrank(){
        System.out.println("동전을 넣으세요.");
    }
    public void dispense(){
        System.out.println("동전을 넣으세요.");
    }
}
