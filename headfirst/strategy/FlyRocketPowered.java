package headfirst.strategy;

public class FlyRocketPowered implements FlyBehavior {
  public void fly() { //인터페이스 필수 함수
    System.out.println("Fly With Rocket..");
  }
}