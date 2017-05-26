// 5th
package headfirst.command.dvd;

public class RemoteControlWithUndo{
  Command[] playCommands;
  Command[] stopCommands;
  Command[] rwCommands;
  Command[] ffCommands;
  
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    playCommands=new Command[7];
    stopCommands=new Command[7];
    rwCommands=new Command[7];
    ffCommands=new Command[7];
    
    // Null Object Pattern
    Command noCommand=new NoCommand();
    
    for (int i=0; i<7;i++){
      playCommands[i]=noCommand;
      stopCommands[i]=noCommand;
      rwCommands[i]=noCommand;
      ffCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  
  public void setCommand(int slot, Command playCommand, Command stopCommand, Command rwCommand, Command ffCommand){
    playCommands[slot]=playCommand;
    stopCommands[slot]=stopCommand;
    rwCommands[slot]=rwCommand;
    ffCommands[slot]=ffCommand;
  }
  
  public void playButtonWasPushed(int slot){
    playCommands[slot].execute();
    undoCommand=playCommands[slot];
  }
  public void stopButtonWasPushed(int slot){
    stopCommands[slot].execute();
    undoCommand=stopCommands[slot];
  }
  public void rwButtonWasPushed(int slot){
    rwCommands[slot].execute();
    undoCommand=rwCommands[slot];
  }
  public void ffButtonWasPushed(int slot){
    ffCommands[slot].execute();
    undoCommand=ffCommands[slot];
  }
  
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
}