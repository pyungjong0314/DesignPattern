package State.Elevator;

public class AdaptElevator {
    private ElevatorState elevatorState;

    public AdaptElevator() {
        this.elevatorState = StopState.getInstance();
    }

    public void setElevatorState(ElevatorState state) {
        this.elevatorState = state;
    }

    public void pushUpButton() {
        elevatorState.pushUpButton();
        this.setElevatorState(UpState.getInstance());
    }

    public void pushDownButton() {
        elevatorState.pushDownButton();
        this.setElevatorState(DownState.getInstance());
    }

    public void pushStopButton() {
        elevatorState.pushStopButton();
        this.setElevatorState(StopState.getInstance());
    }

    public static void main(String[] args) {
        AdaptElevator elevator = new AdaptElevator();

        elevator.pushStopButton();
        elevator.pushDownButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushUpButton();
    }
}
