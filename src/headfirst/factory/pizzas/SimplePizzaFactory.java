package headfirst.factory.pizzas;

public class SimplePizzaFactory {
  public Pizza createPizza(String type){
    //Pizza pizza=null;
    Pizza pizza=new CheesePizza();
    
    //if(type=="cheese"){      //레퍼런스를 비교
    if(type.equals("cheese")){ //값을비교
      pizza=new CheesePizza();
    }
    else if(type.equals("pepperoni")){
      pizza=new PepperoniPizza();
    }
    else if(type.equals("potato")){
      pizza=new PotatoPizza();
    }
    
    return pizza;
  }
}