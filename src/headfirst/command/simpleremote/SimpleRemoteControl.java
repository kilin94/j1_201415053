package headfirst.command.simpleremote;

public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command c){ //실제 객체와 버튼 연결 X  command와 버튼 연결
    slot=c;
  }
  
  public void buttonWasPressed(){
    slot.execute();
  }
}