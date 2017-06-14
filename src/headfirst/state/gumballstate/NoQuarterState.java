package headfirst.state.gumballstate;

public class NoQuarterState implements State {
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter() { // ¹Ù²¸
    System.out.println("You Inserted a quarter");
    gm.setState(gm.getHasQuarterState());
  }
  public void ejectQuarter() { // ¾È¹Ù²¸
    System.out.println("no quarter");
  }
  public void turnCrank() { // ¾È¹Ù²¸
    System.out.println("WHY TURN.. no quarter");
  }  
  public void dispense() { // ¾È¹Ù²¸
    System.out.println("WHY NO PAY first.. no quarter");
  }
}