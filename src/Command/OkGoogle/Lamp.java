package Command.OkGoogle;

class Lamp {
    public void turnOn(){
        System.out.println("Lamp on");
    }
}

class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp lamp){
        this.lamp = lamp;
    }

    public void run(){
        lamp.turnOn();
    }
}