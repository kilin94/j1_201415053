// Beverage #3 : HouseBlend
package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage{

//description = "#3.House Blend";   //Beverage�ȿ� description �Ӽ� ������ �־�
  public HouseBlend(){
    description = "#3.House Blend";  //������ �ȿ�
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 0.89;
  }
}