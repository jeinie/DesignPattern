public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) { // 어떤 조명인지 받아서
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
