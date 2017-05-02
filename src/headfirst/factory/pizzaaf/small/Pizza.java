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
  protected abstract void prepare();  // protect없으면(private) child가 못써 (protect;패밀리는 쓸수있는거)
  
  
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