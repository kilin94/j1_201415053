package headfirst.command.simpleremote;

public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command c){ //���� ��ü�� ��ư ���� X  command�� ��ư ����
    slot=c;
  }
  
  public void buttonWasPressed(){
    slot.execute();
  }
}