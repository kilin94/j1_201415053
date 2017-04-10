// Beverage #4 : CaramelMacchiato
package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends Beverage{

//description = "#4.Caramel Macchiato";   //Beverage안에 description 속성 가지고 있어
  public CaramelMacchiato(){
    description = "#4.Caramel Macchiato";  //생성자 안에
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 1.66;
  }
}