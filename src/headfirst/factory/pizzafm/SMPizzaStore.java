package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  Pizza createPizza(String type){
    
    Pizza pizza=null;
    
    if(type.equals("potato")){
      pizza=new SMStylePotatoPizza();
      //return pizza;  (X) ���� �ѹ���
    }
    else{
      System.out.println("Sorry, Nonexistent Menu...");
      return null;
    }
    
    return pizza;
  }
}