package headfirst.factory.pizzas;

public class CheesePizza extends Pizza{
  public CheesePizza() {
    name="Cheese Pizza";
    dough="Regular Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella"); //arrayList�� add�Լ�
    toppings.add("Parmesan");
  }
}