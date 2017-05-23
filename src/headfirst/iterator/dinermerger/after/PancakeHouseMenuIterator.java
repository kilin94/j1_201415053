// 2nd-2 (과제) : ArrayList
package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
  ArrayList items; //array
  int position=0;
  public PancakeHouseMenuIterator(ArrayList items){
    this.items=items;
  }
  
  public boolean hasNext(){
    if(position>=items.size()){ // 끝에온거, 남은거 없다
      return false;
    }
    else{ // 다음거 남아있다
      return true;
    }
    //조건하나 더 (나중)
  }
  
  public Object next(){
    Object m=items.get(position);
    position++;
    return m;
  }
}