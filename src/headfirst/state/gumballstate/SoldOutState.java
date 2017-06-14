package headfirst.state.gumballstate;

public class SoldOutState implements State {  // �����̾�
  GumballMachine gm;
  public SoldOutState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter() { // �ȹٲ�
    System.out.println("sold out You can not Insert a quarter");
  }
  public void ejectQuarter() { // �ȹٲ�
    System.out.println("SOLD OUT can not eject");
  }
  public void turnCrank() { // �ȹٲ�
    System.out.println("SOLD OUT can not turn");
  }  
  public void dispense() { // �ȹٲ�
    System.out.println("SOLD OUT can not dispense");
  }
}