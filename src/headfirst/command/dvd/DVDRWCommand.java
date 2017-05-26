//2nd
package headfirst.command.dvd;

public class DVDRWCommand implements Command{
  DVD dvd;
  int pos;
  public DVDRWCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    pos=dvd.getPos();
    dvd.RW();
  }
  public void undo(){
    dvd.prePos(pos);
  }
}