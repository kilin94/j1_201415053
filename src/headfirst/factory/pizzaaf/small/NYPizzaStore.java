// 2nd
package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type){
    
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new NYPizzaIngredientFactory();
    
    if(type.equals("cheese")){
      //pizza=new NYStyleCheesePizza();  // factory method 
      pizza=new CheesePizza(inFac);  // ��abstract factory : �ν��Ͻ����鶧 abstract factory ��
    }
    return pizza;
    
  }
}