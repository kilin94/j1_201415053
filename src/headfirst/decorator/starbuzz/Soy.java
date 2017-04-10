// Condiment #3 : Soy
package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator{
  Beverage beverage;

  public Soy(Beverage b){
    this.beverage=b;     //����Ŭ���� ���� �־��� : getDescription, Cost ������
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Soy";
  }
  
  public double cost() {
    return beverage.cost()+0.15;
  }
}