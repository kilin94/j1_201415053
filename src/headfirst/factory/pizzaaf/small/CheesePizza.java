// 4th
package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza{
public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;  // abstract factory, UML���� ������
  
  //public NYStyleCheesePizza() {
  public CheesePizza(PizzaIngredientFactory ingredientFac){  // �����ڿ� abstract factory
    name="Cheese Pizza";
    this.inFac=ingredientFac;
    //dough="Thin Crust";
    //sauce="Marinara Pizza Sauce";
    //toppings.add("Grated Reggiano Cheese");
  }
  
  void prepare(){
    dough=inFac.createDough();
    cheese=inFac.createCheese();
  }
}