package headfirst.state.gumballstate;

public class NoQuarterState implements State {
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter() { // �ٲ�
    System.out.println("You Inserted a quarter");
    gm.setState(gm.getHasQuarterState());
  }
  public void ejectQuarter() { // �ȹٲ�
    System.out.println("no quarter");
  }
  public void turnCrank() { // �ȹٲ�
    System.out.println("WHY TURN.. no quarter");
  }  
  public void dispense() { // �ȹٲ�
    System.out.println("WHY NO PAY first.. no quarter");
  }
}