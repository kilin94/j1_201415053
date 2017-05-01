// 2nd
package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type){
    
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new NYPizzaIngredientFactory();
    
    if(type.equals("cheese")){
      //pizza=new NYStyleCheesePizza();  // factory method 
      pizza=new CheesePizza(inFac);  // ★abstract factory : 인스턴스만들때 abstract factory 씀
    }
    return pizza;
    
  }
}