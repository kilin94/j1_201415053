package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {
  public void fly() { //인터페이스 필수 함수
    System.out.println("Fly With Wings..");
  }
}
    
    
//인터페이스 외에 다른함수 추가해도됨