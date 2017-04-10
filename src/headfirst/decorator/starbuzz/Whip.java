// Condiment #2 : Whip
package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator{
  Beverage beverage;

  public Whip(Beverage b){
    this.beverage=b;     //슈퍼클래스 꺼를 넣었어 : getDescription, Cost 쓰려고
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Whip";
  }
  
  public double cost() {
    return beverage.cost()+0.10;
  }
}