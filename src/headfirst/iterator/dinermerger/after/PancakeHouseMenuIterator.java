// 2nd-2 (����) : ArrayList
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
    if(position>=items.size()){ // �����°�, ������ ����
      return false;
    }
    else{ // ������ �����ִ�
      return true;
    }
    //�����ϳ� �� (����)
  }
  
  public Object next(){
    Object m=items.get(position);
    position++;
    return m;
  }
}