// 2nd 2 (HW)
package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type){
    
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new ChicagoPizzaIngredientFactory();
    
    if(type.equals("cheese")){
      //pizza=new NYStyleCheesePizza();  // factory method 
      pizza=new CheesePizza(inFac);  // ★abstract factory : 인스턴스만들때 abstract factory 씀
    }
    return pizza;
    
  }
}