// Beverage #3 : HouseBlend
package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage{

//description = "#3.House Blend";   //Beverage안에 description 속성 가지고 있어
  public HouseBlend(){
    description = "#3.House Blend";  //생성자 안에
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 0.89;
  }
}