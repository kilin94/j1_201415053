// Beverage #1 : Espresso
package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{

//description = "#1.Espresso";   //Beverage안에 description 속성 가지고 있어
  public Espresso(){
    description = "#1.Espresso";  //생성자 안에
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 1.99;
  }
}