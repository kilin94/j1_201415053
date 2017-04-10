// Condiment #5 : Caramel
package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator{
  Beverage beverage;

  public Caramel(Beverage b){
    this.beverage=b;     //슈퍼클래스 꺼를 넣었어 : getDescription, Cost 쓰려고
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Caramel";
  }
  
  public double cost() {
    return beverage.cost()+0.30;
  }
}