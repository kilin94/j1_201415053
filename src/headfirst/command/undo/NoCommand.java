// 4th : Null Object
package headfirst.command.undo;

public class NoCommand implements Command {
  public void execute(){} // or ���⼭ ��� sysout("do nothing...);
  public void undo(){} // or sysout("do nothing...");
}