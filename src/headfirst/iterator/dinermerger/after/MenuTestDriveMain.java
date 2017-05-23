// 5th (°úÁ¦) : test¿ë
package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

import java.util.*;

public class MenuTestDriveMain {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
 
    printMenu();
  }
  
  public static void printMenu() {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    //ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();

    System.out.println("<Pancake House Menu> (ArrayList)");
    while (pancakeIterator.hasNext()) {
      MenuItem menuItem = (MenuItem)pancakeIterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }

    System.out.println("--------------------------");
        
    //MenuItem[] lunchItems = dinerMenu.getMenuItems();
    Iterator dinerIterator = dinerMenu.createIterator();

    System.out.println("<Diner Menu> (Array)");
    while (dinerIterator.hasNext()) {
      MenuItem menuItem = (MenuItem)dinerIterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}