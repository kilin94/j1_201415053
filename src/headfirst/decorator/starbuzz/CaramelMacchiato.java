// Beverage #4 : CaramelMacchiato
package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends Beverage{

//description = "#4.Caramel Macchiato";   //Beverage�ȿ� description �Ӽ� ������ �־�
  public CaramelMacchiato(){
    description = "#4.Caramel Macchiato";  //������ �ȿ�
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 1.66;
  }
}