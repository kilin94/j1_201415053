// 1st
package headfirst.factory.pizzaaf.small;

public abstract class PizzaStore{
 
  abstract Pizza createPizza(String item);
  
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