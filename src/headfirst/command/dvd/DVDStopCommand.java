//2nd
package headfirst.command.dvd;

public class DVDStopCommand implements Command{
  DVD dvd;
  int pos;
  public DVDStopCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    pos=dvd.getPos();
    dvd.stop();
  }
  public void undo(){
    dvd.prePos(pos);
  }
}