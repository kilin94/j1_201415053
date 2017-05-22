// 4th(°úÁ¦) : test¿ë
package headfirst.iterator.dinermerger.before;

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

        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        System.out.println("<Pancake House Menu> (ArrayList)");
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        System.out.println("--------------------------");
        

        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        System.out.println("<Diner Menu> (Array)");
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}