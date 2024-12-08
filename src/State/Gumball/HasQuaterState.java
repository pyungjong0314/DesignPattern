package State.Gumball;

public class HasQuaterState implements State{
    GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("동전은 한번만");
    }
    public void ejectQuarter(){
        System.out.println("동전이 반환되었습니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println("손잡이를 돌렸습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    public void dispense(){
        System.out.println("상품이 나올 수 없습니다.");
    }
}
