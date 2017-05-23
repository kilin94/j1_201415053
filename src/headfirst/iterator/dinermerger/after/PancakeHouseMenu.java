// 3rd-2 (과제)
package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
  //MenuItem[] menuitems;
  ArrayList menuitems;  // ArrayList : Primitive 아님
  
  //static final int MAX_ITEMS=3;
  //int numberOfItems=0;
  
  public PancakeHouseMenu(){
    //menuitems=new MenuItem[MAX_ITEMS];
    menuitems=new ArrayList();  //menuitems=new ArrayList<MenuItem>();
    
    addItem("BLT","Bacon,Lettuce,Tomato",true,2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
    
    //menuitems[numberOfItems]=menuItem;
    menuitems.add(menuItem);
    
    //numberOfItems=numberOfItems+1;
  }
  
  //public MenuItem[] getMenuItems(){
  public ArrayList getMenuItems(){
    return menuitems;
  }
  
  //추가
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuitems);
  }
}