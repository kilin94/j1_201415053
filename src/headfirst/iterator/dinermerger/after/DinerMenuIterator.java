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
    if(position>=items.length){ // �����°�, ������ ����
      return false;
    }
    else{ // ������ �����ִ�
      return true;
    }
    //�����ϳ� �� (����)
  }
  
  public Object next(){
    MenuItem m=items[position];
    position++;
    return m;
  }
}