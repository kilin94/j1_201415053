package headfirst.factory.pizzafm;

public abstract class PizzaStore{
 
  abstract Pizza createPizza(String item);  // �� Ư���Լ� ��Ī�ϴ� �������  : Factory Method
  
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