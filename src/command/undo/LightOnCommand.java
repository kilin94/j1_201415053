//2nd
package headfirst.command.undo;

public class LightOnCommand implements Command{
  Light light;
  int level;
  public LightOnCommand(Light light){
    this.light=light;
  }
  public void execute(){  // �ۿ��� execute�� �����ϴϱ� ���� ��ü�� ���� ������
    level=light.getLevel(); // ������ �Һ� ���� ������ ����
    light.on();
  }
   public void undo(){
     light.dim(level);
   }
}