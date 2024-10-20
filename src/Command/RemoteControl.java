package Command;

public class RemoteControl {
    Command onSlot[] = new Command[7];
    Command offSlot[] = new Command[7];

    public RemoteControl(){
        for(int i = 0; i < 7; i++){
            onSlot[i] = null;
            offSlot[i] = null;
        }
    }

    public void setSlot(int num, Command onCommand, Command offCommand){
        onSlot[num] = onCommand;
        offSlot[num] = offCommand;
    }

    public void pushOnSlot(int num){
        onSlot[num].execute();
    }

    public void pushOffSlot(int num){
        offSlot[num].execute();
    }
}
