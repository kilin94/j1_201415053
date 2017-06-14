// Before
package headfirst.state.gumball;
public class GumballMachine {
  final int SOLD_OUT=0;
  final int NO_QUARTER=1;
  final int HAS_QUARTER=2;
  final int SOLD=3;
  int state=SOLD_OUT;
  
  public void insertQuarter() {
    if(state==HAS_QUARTER) {
      System.out.println("You can not insert another quarter!");
    }
    else if(state==NO_QUARTER) {
      state=HAS_QUARTER;
      System.out.println("You inserted a quarter!");
    }
    else if(state==SOLD_OUT) {
      System.out.println("You can not insert a quarter!");
    }
    else if(state==SOLD) {
      System.out.println("We are already giving you a candy!");
    }
  }
}