//2nd
package headfirst.command.undo;

public class LightOffCommand implements Command{
  Light light;
  int level;
  public LightOffCommand(Light light){
    this.light=light;
  }
  public void execute(){  // �ۿ��� execute�� �����ϴϱ� ���� ��ü�� ���� ������
    level=light.getLevel(); // ������ �Һ� ���� ������ ����
    light.off();
  }
   public void undo(){
     light.dim(level);
   }
}