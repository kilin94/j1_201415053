// 4th : Null Object
package headfirst.command.undo;

public class NoCommand implements Command {
  public void execute(){} // or 여기서 출력 sysout("do nothing...);
  public void undo(){} // or sysout("do nothing...");
}