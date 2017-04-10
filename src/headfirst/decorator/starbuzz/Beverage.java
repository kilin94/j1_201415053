package headfirst.decorator.starbuzz;

public abstract class Beverage{  //함수 하나 이상이 구현이 안되있을때 : abstract
  String description = "Unknown beverage";
//cost;
  
  public String getDescription(){
    return description; //아무것도 안쓰면 패키지내에서 private
  }
  public abstract double cost(); //구현안함
}