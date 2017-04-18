package headfirst.factory.pizzafm;

public abstract class PizzaStore{
 
  abstract Pizza createPizza(String item);  // 이 특정함수 지칭하는 고유명사  : Factory Method
  
  public Pizza orderPizza(String type){
    Pizza pizza=null;

    pizza=createPizza(type);
    
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}