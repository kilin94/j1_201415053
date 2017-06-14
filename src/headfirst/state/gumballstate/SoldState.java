package headfirst.state.gumballstate;

public class SoldState implements State {
  GumballMachine gm;
  public SoldState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter() {
    System.out.println("already turned");
  }
  public void ejectQuarter() {
    System.out.println("already turned");
  }
  public void turnCrank() {
    System.out.println("already turned");
  }  
  public void dispense() {
    gm.releaseBall();
    if (gm.getCount() > 0) {
      gm.setState(gm.getNoQuarterState());
    } else {
      gm.setState(gm.getSoldOutState());
    }
  }
}