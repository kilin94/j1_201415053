// Beverage #2 : DarkRoast
package headfirst.decorator.starbuzz;

public class DarkRoast extends Beverage{

//description = "#2.Dark Roast";   //Beverage�ȿ� description �Ӽ� ������ �־�
  public DarkRoast(){
    description = "#2.Dark Roast";  //������ �ȿ�
  }

//  public String getDescription(){
//    return description;
//  }
  
//  public abstract double.cost();
  
  public double cost(){
    return 0.99;
  }
}