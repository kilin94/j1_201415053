// Condiment #4 : Milk
package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator{
  Beverage beverage;

  public Milk(Beverage b){
    this.beverage=b;     //슈퍼클래스 꺼를 넣었어 : getDescription, Cost 쓰려고
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Milk";
  }
  
  public double cost() {
    return beverage.cost()+0.10;
  }
}