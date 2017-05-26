//2nd
package headfirst.command.dvd;

public class DVDFFCommand implements Command{
  DVD dvd;
  int pos;
  public DVDFFCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    pos=dvd.getPos();
    dvd.FF();
  }
  public void undo(){
    dvd.prePos(pos);
  }
}