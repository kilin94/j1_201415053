// Beverage #1 : Espresso
package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{

//description = "#1.Espresso";   //Beverage�ȿ� description �Ӽ� ������ �־�
  public Espresso(){
    description = "#1.Espresso";  //������ �ȿ�
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 1.99;
  }
}