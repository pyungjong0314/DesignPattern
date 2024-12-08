package State.power;

interface PowerState {
    void powerButtonPush(LaptopContext cxt);

    void typebuttonPush();
}

class OnState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("노트북 전원 OFF");
        cxt.changeState(new OffState());
    }

    @Override
    public void typebuttonPush() {
        System.out.println("키 입력");
    }

    @Override
    public String toString() {
        return "노트북이 전원 ON 인 상태 입니다.";
    }
}

class OffState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("노트북 전원 ON");
        cxt.changeState(new OnState());
    }

    @Override
    public void typebuttonPush() {
        throw new IllegalStateException("노트북이 OFF 인 상태");
    }

    @Override
    public String toString() {
        return "노트북이 전원 OFF 인 상태 입니다.";
    }
}

class SavingState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext cxt) {
        System.out.println("노트북 전원 on");
        cxt.changeState(new OnState());
    }

    @Override
    public void typebuttonPush() {
        throw new IllegalStateException("노트북이 절전 모드인 상태");
    }

    @Override
    public String toString() {
        return "노트북이 절전 모드 인 상태 입니다.";
    }
}