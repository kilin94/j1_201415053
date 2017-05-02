// 3rd
package headfirst.factory.pizzaaf.small;
import java.util.ArrayList;

public abstract class Pizza {
  String name;
  //String dough;
  Dough dough;
  String sauce;
  Cheese cheese;
  Potato potato;
  ArrayList<String> toppings = new ArrayList<String>();
  
  /*public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings: ");
  }*/
  protected abstract void prepare();  // protect������(private) child�� ���� (protect;�йи��� �����ִ°�)
  
  
  public void bake() {
    System.out.println("Baking " + name);
  }
  public void cut() {
    System.out.println("Cutting " + name);
  }
  public void box() {
    System.out.println("Boxing " + name);
  }
}