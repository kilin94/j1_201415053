//3rd
package headfirst.command.undo;

public class Light{
  int level;
  public Light(){
  }
  public void on(){ //off도 추가
    level=100;
    System.out.println("Light is on");
  }
  public void off(){
    level=0;
    System.out.println("Light is off");
  }
  public void dim(int level){ // 옛날 레벨 받아서 현재 레벨로
    this.level=level;
  }
  public int getLevel(){
    return level;
  }
}