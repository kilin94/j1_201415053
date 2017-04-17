package headfirst.factory.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza() {
    name="Pepperoni Pizza";
    dough="Crust";
    sauce="Marinara Sauce";
    toppings.add("Sliced Pepperoni"); //arrayList´Â addÇÔ¼ö
    toppings.add("Sliced Onion");
    toppings.add("Grated parmesan cheese");
  }
}