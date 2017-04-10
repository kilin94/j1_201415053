// Beverage #2 : DarkRoast
package headfirst.decorator.starbuzz;

public class DarkRoast extends Beverage{

//description = "#2.Dark Roast";   //Beverage안에 description 속성 가지고 있어
  public DarkRoast(){
    description = "#2.Dark Roast";  //생성자 안에
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 0.99;
  }
}