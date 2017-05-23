// 3rd
package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenu implements Menu{
  MenuItem[] menuitems;
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public DinerMenu(){
    menuitems=new MenuItem[MAX_ITEMS];
    addItem("BLT","Bacon,Lettuce,Tomato",false,2.99);
    addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
    menuitems[numberOfItems]=menuItem;
    numberOfItems=numberOfItems+1;  //numberOfItems++;
  }
  
  public MenuItem[] getMenuItems(){  // 배열로 return
    return menuitems;
  }
  
  //추가
  public Iterator createIterator(){
    return new DinerMenuIterator(menuitems);
  }
}