package headfirst.strategy;

public abstract class Duck {
  
  public FlyBehavior fb; //context
  //private FlyBehavior fb; //context
  public void setFlyBehavior(FlyBehavior f){
    this.fb=fb;
  }
  
  public void performFly() {
    fb.fly();
    System.out.println("All ducks fly..");
  }
  
  abstract void display();
  public void swim() {
    System.out.println("All ducks swiming..");
  }
  
  
  //quack Ãß°¡
  public QuackBehavior qb;
  public void setQuackBehavior(QuackBehavior qb) {
    this.qb=qb;
  }
  
  public void performQuack() {
    qb.quack();
    System.out.println("All ducks quack..");
  }
  
}