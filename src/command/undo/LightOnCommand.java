//2nd
package headfirst.command.undo;

public class LightOnCommand implements Command{
  Light light;
  int level;
  public LightOnCommand(Light light){
    this.light=light;
  }
  public void execute(){  // 밖에선 execute만 실행하니까 실제 객체가 뭔지 감춰짐
    level=light.getLevel(); // 현재의 불빛 정도 레벨에 저장
    light.on();
  }
   public void undo(){
     light.dim(level);
   }
}