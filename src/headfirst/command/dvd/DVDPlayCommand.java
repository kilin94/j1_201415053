//2nd
package headfirst.command.dvd;

public class DVDPlayCommand implements Command{
  DVD dvd;
  int pos;
  public DVDPlayCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    pos=dvd.getPos();
    dvd.play();
  }
  public void undo(){
    dvd.prePos(pos);
  }
}