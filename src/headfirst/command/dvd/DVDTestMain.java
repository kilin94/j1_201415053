package headfirst.command.dvd;

public class DVDTestMain {
  public static void main(String args[]) {
    RemoteControlWithUndo remote=new RemoteControlWithUndo();
    DVD dvd=new DVD();
    DVDPlayCommand play=new DVDPlayCommand(dvd);
    DVDStopCommand stop=new DVDStopCommand(dvd);
    DVDRWCommand rw=new DVDRWCommand(dvd);
    DVDFFCommand ff=new DVDFFCommand(dvd);
    remote.setCommand(0,play,stop,rw,ff);
    
    remote.playButtonWasPushed(0);
    remote.rwButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.ffButtonWasPushed(0);
    remote.stopButtonWasPushed(0);
  }
}