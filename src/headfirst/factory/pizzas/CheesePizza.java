package headfirst.factory.pizzas;

public class CheesePizza extends Pizza{
  public CheesePizza() {
    name="Cheese Pizza";
    dough="Regular Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella"); //arrayList´Â addÇÔ¼ö
    toppings.add("Parmesan");
  }
}