// Condiment #5 : Caramel
package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator{
  Beverage beverage;

  public Caramel(Beverage b){
    this.beverage=b;     //����Ŭ���� ���� �־��� : getDescription, Cost ������
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", adding Caramel";
  }
  
  public double cost() {
    return beverage.cost()+0.30;
  }
}