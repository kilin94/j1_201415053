package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    fb=new FlyWithWings(); //속성으로 바로넣은거  or
    //setFlyBehavior(new FlyWithWings());  //함수사용
  }
  
  public void display() {
    System.out.println("Mallard...");
  }
}