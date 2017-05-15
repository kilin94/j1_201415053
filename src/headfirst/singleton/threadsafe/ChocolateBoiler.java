// 과제 : ChocolateBoiler threadsafe
package headfirst.singleton.threadsafe;

public class ChocolateBoiler{
  
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  
  public static synchronized ChocolateBoiler getInstance(){  // ★synchronized : '사용중' 전광판에 표시 <동기화>
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new ChocolateBoiler(); // <lazy instantiation>
    } 
    
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
  
  public void fill(){
    if(isEmpty()){
      System.out.println("Filling...");
      empty=false;
      boiled=false;
    }
  }
  public void drain(){
    if(!isEmpty() && isBoiled()) {
      System.out.println("Draining...");
      empty=true;
    }
  }
  public void boil(){
    if (!isEmpty() && !isBoiled()) {
      System.out.println("Boiling...");
      boiled=true;
    }
  } 
  public boolean isEmpty(){
    return empty;
  }
  public boolean isBoiled(){
    return boiled;
  }
}