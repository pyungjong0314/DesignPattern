package Command.OkGoogle;

class Heater {
    public void powerOn(){
        System.out.println("Heater on");
    }
}

class HeaterOnCommand implements Command{
    private Heater heater;

    public HeaterOnCommand(Heater heater){
        this.heater = heater;
    }

    public void run(){
        heater.powerOn();
    }
}
