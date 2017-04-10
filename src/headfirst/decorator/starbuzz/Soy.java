// Condiment #3 : Soy
package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator{
  Beverage beverage;

  public Soy(Beverage b){
    this.beverage=b;     //슈퍼클래스 꺼를 넣었어 : getDescription, Cost 쓰려고
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Soy";
  }
  
  public double cost() {
    return beverage.cost()+0.15;
  }
}