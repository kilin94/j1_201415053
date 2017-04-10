// Condiment #1 : Mocha
package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  
  public Mocha(Beverage b){
    this.beverage=b;     //����Ŭ���� ���� �־��� : getDescription, Cost ������
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Mocha";
  }
  
  public double cost() {
    return beverage.cost()+0.20;
  }
}