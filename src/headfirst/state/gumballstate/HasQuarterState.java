package headfirst.state.gumballstate;

public class HasQuarterState implements State {
  GumballMachine gm;
  public HasQuarterState(GumballMachine gm) {
    this.gm = gm;
  }
  public void insertQuarter() {
    System.out.println("You can not insert another quarter");
  }
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gm.setState(gm.getNoQuarterState()); // gm.setState(NO_QUARTER);
    // NoQuarter·Î transition
  }
  public void turnCrank() {
     System.out.println("You turned the crank!");
     if(gm.getCount() <1) {
       gm.setState(gm.getSoldState());
     }
  }  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}