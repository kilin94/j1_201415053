package headfirst.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State state=soldOutState; // 초기 State
  int count=0;
  public GumballMachine(int num) { // 기기 처음에 켜면서
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
    this.count=num;
    if(num>0) {
      state=noQuarterState; // 사탕이 있으면 -> 동전 받을수 있는 상태
    }
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }
    
  public void setState(State s) {
    this.state=s; // state s로 transition
  }
  public State getState(){
    return state;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  public State getSoldState() {
    return soldState;
  }
  
  // (+)
  public void releaseBall() {
    System.out.println("Thank you!");
    if (count != 0) {
      count = count - 1;
    }
  }
  int getCount() {
    return count;
  }
}