package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    fb=new FlyWithWings(); //�Ӽ����� �ٷγ�����  or
    //setFlyBehavior(new FlyWithWings());  //�Լ����
  }
  
  public void display() {
    System.out.println("Mallard...");
  }
}