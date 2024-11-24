package Command.Light;

public class LightOffCommand {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void button(){
        light.off();
    }
}
