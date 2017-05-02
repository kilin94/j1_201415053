// 11th
package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    Pizza p=nyStore.orderPizza("cheese");
    //System.out.println(p.prepare());
  }
}