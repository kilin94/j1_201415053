// 5th
package headfirst.command.undo;

public class RemoteControlWithUndo{
  //Command slot;
  Command[] onCommands; // array로 구현 단점:갯수를 정해놔야 (M 측면, 키울때 문제)
  Command[] offCommands;
  
  Command undoCommand; //여기 들어온거의 undo
  
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    
    //Null Object Pattern
    Command noCommand=new NoCommand();
    
    for (int i=0; i<7;i++){
      onCommands[i]=noCommand;  //7개 초기화 (실제 obj넣으면 문제 가능), 초기화되면 7개중에 1개만 있어도 가능
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  
  //slot번호 밖에서 몇번 눌렀는지
  public void setCommand(int slot, Command c){ //실제 객체와 버튼 연결 X  command와 버튼 연결
    //slot=c;
    onCommands[slot]=c;
  }
  
  public void onButtonWasPushed(int slot){
    //slot.execute();
    onCommands[slot].execute();
    undoCommand=onCommands[slot]; //뭘 하나 실행하면 그걸 undo에 넣는다
  }
  
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
  
  public void UndoButtonWasPushed(){
    undoCommand.undo();
  }
}