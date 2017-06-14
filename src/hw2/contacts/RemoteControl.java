package hw2.contacts;

public class RemoteControl{
  Command[] insertCommands;
  Command[] deleteCommands;
  Command[] updateCommands;
  Command[] findCommands;
  Command[] createCommands;
  Command[] dropCommands;
  Command[] findAllCommands;
  Command[] closeCommands;
  
  public RemoteControl(){
    insertCommands=new Command[7];
    deleteCommands=new Command[7];
    updateCommands=new Command[7];
    findCommands=new Command[7];
    createCommands=new Command[7];
    dropCommands=new Command[7];
    findAllCommands=new Command[7];
    closeCommands=new Command[7];
    
    // Null Object Pattern
    Command noCommand=new NoCommand();
    
    for (int i=0; i<7;i++){
      insertCommands[i]=noCommand;
      deleteCommands[i]=noCommand;
      updateCommands[i]=noCommand;
      findCommands[i]=noCommand;
      createCommands[i]=noCommand;
      dropCommands[i]=noCommand;
      findAllCommands[i]=noCommand;
      closeCommands[i]=noCommand;
    }
  }
  
  public void setCommand(int slot, Command insertCommand, Command deleteCommand, Command updateCommand, Command findCommand,
                        Command createCommand,Command dropCommand,Command findAllCommand,Command closeCommand){
    insertCommands[slot]=insertCommand;
    deleteCommands[slot]=deleteCommand;
    updateCommands[slot]=updateCommand;
    findCommands[slot]=findCommand;
    createCommands[slot]=createCommand;
    dropCommands[slot]=dropCommand;
    findAllCommands[slot]=findAllCommand;
    closeCommands[slot]=closeCommand;
  }
  
  public void insertButtonWasPushed(int slot){
    insertCommands[slot].execute();
  }
  public void deleteButtonWasPushed(int slot){
    deleteCommands[slot].execute();
  }
  public void updateButtonWasPushed(int slot){
    updateCommands[slot].execute();
  }
  public void findButtonWasPushed(int slot){
    findCommands[slot].execute();
  }
  public void createButtonWasPushed(int slot){
    createCommands[slot].execute();
  }
  public void dropButtonWasPushed(int slot){
    dropCommands[slot].execute();
  }
  public void findAllButtonWasPushed(int slot){
    findAllCommands[slot].execute();
  }
  public void closeButtonWasPushed(int slot){
    closeCommands[slot].execute();
  }
}