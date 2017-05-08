package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  
  private boolean empty;  // ���� private�ΰ� ���ϰ� ���X / encapsulation(����), hiding�� ����
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance; // static : instance �ȸ���� ������
  private static int numCalled=0;  // static : ������ó�� ����
  
  private ChocolateBoiler() {  // ������ ���ٱ���, �� ��ɾ� �۵�X : �ƹ��� Instance������ ���ϵ���
    empty=true;
    boiled=false;
  }
  
  /* ChocolateBoiler chocolateBoiler=new ChocolateBoiler();  (X)�Ұ� / new�� public��
  ChocolateBoiler.getInstance(); */
  
  
  public static ChocolateBoiler getInstance(){  // ���Լ��� ���� ������ִ�
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new ChocolateBoiler(); // private�� �ڱ��ڽ��� �����־�
    } 
    // <lazy instantiation> : �ʿ��Ҷ� ��ü����
    
    //else{
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);  // ��� ȣ��ƴ���
      return uniqueInstance;
    //}
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