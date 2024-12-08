package State.Gumball;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int number) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuaterState(this);
        hasQuarterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        count = number;

        if(number > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    void setState(State state) {
        this.state = state;
    }
    void releaseBall(){
        System.out.println("rolling out slot...");
        if(count != 0){
            count--;
        }
    }
    State getSoldOutState() {
        return soldOutState;
    }
    State getNoQuarterState() {
        return noQuarterState;
    }
    State getHasQuarterState() {
        return hasQuarterState;
    }
    State getSoldState() {
        return soldState;
    }
    int getCount(){
        return count;
    }

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
