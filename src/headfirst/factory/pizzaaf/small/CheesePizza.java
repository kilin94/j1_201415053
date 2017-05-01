// 4th
package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza{
public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;  // abstract factory, UML에서 맨위에
  
  //public NYStyleCheesePizza() {
  public CheesePizza(PizzaIngredientFactory ingredientFac){  // 생성자에 abstract factory
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