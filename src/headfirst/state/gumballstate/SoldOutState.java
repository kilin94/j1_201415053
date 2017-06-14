package headfirst.state.gumballstate;

public class SoldOutState implements State {  // ∏≈¡¯¿Ãæﬂ
  GumballMachine gm;
  public SoldOutState(GumballMachine gm) {
    this.gm = gm;
  }
  
  public void insertQuarter() { // æ»πŸ≤∏
    System.out.println("sold out You can not Insert a quarter");
  }
  public void ejectQuarter() { // æ»πŸ≤∏
    System.out.println("SOLD OUT can not eject");
  }
  public void turnCrank() { // æ»πŸ≤∏
    System.out.println("SOLD OUT can not turn");
  }  
  public void dispense() { // æ»πŸ≤∏
    System.out.println("SOLD OUT can not dispense");
  }
}