// 4th
package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza{
public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;  // abstract factory, UML���� ������
  
  //public NYStyleCheesePizza() {
  public CheesePizza(PizzaIngredientFactory inFac){  // �����ڿ� abstract factory
    name="Abstract Factory Cheese Pizza";
    this.inFac=inFac;
    //dough="Thin Crust";
    //sauce="Marinara Pizza Sauce";
    //toppings.add("Grated Reggiano Cheese");
  }
  
  public void prepare(){
    System.out.println("preparing...");
    dough=inFac.createDough();
    cheese=inFac.createCheese();
    potato=inFac.createPotato();
  }
}