package headfirst.command.simpleremote;

public class LightOffCommand implements Command{
  Light light;
  public LightOffCommand(Light light){
    this.light=light;
  }
  public void execute(){  // 밖에선 execute만 실행하니까 실제 객체가 뭔지 감춰짐
    light.off();
  }
}  