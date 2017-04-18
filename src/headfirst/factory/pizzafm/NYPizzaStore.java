package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type){
    
    Pizza pizza=null;
    
    if(type.equals("cheese")){
      pizza=new NYStyleCheesePizza();
      //return pizza;  (X) ���� �ѹ���
    }
    else{
      System.out.println("Sorry, Nonexistent Menu...");
      return null;
    }
    
    return pizza;
  }
}