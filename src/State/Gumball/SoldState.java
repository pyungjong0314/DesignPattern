package State.Gumball;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("잠시만 기다려주세요.");
    }
    public void ejectQuarter(){
        System.out.println("이미 상품을 뽑았습니다.");
    }
    public void turnCrank(){
        System.out.println("손잡이는 한번만 돌려주세요.");
    }
    public void dispense(){
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("SOLD OUT");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
