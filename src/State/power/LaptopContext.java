package State.power;

public class LaptopContext {
    PowerState powerState;

    LaptopContext() {
        this.powerState = new OffState();
    }

    void changeState(PowerState state) {
        this.powerState = state;
    }

    void setSavingState() {
        System.out.println("노트북 절전 모드");
        changeState(new SavingState());
    }

    void powerButtonPush() {
        powerState.powerButtonPush(this);
    }

    void typebuttonPush() {
        powerState.typebuttonPush();
    }

    void currentStatePrint() {
        System.out.println(powerState.toString());
    }
}
