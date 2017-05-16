// 5th
package headfirst.command.undo;

public class RemoteControlWithUndo{
  //Command slot;
  Command[] onCommands; // array�� ���� ����:������ ���س��� (M ����, Ű�ﶧ ����)
  Command[] offCommands;
  
  Command undoCommand; //���� ���°��� undo
  
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    
    //Null Object Pattern
    Command noCommand=new NoCommand();
    
    for (int i=0; i<7;i++){
      onCommands[i]=noCommand;  //7�� �ʱ�ȭ (���� obj������ ���� ����), �ʱ�ȭ�Ǹ� 7���߿� 1���� �־ ����
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  
  //slot��ȣ �ۿ��� ��� ��������
  public void setCommand(int slot, Command c){ //���� ��ü�� ��ư ���� X  command�� ��ư ����
    //slot=c;
    onCommands[slot]=c;
  }
  
  public void onButtonWasPushed(int slot){
    //slot.execute();
    onCommands[slot].execute();
    undoCommand=onCommands[slot]; //�� �ϳ� �����ϸ� �װ� undo�� �ִ´�
  }
  
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
  
  public void UndoButtonWasPushed(){
    undoCommand.undo();
  }
}