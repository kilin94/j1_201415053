// 2nd : Array
package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenuIterator implements Iterator{
  MenuItem[] items; //array
  int position=0;
  public DinerMenuIterator(MenuItem[] items){
    this.items=items;
  }
  
  public boolean hasNext(){
    if(position>=items.length){ // 끝에온거, 남은거 없다
      return false;
    }
    else{ // 다음거 남아있다
      return true;
    }
    //조건하나 더 (나중)
  }
  
  public Object next(){
    MenuItem m=items[position];
    position++;
    return m;
  }
}