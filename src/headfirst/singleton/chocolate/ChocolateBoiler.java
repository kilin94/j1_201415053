package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  
  private boolean empty;  // 여기 private인건 패턴과 상관X / encapsulation(은닉), hiding을 위함
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance; // static : instance 안만들고 쓰도록
  private static int numCalled=0;  // static : 정전기처럼 잔존
  
  private ChocolateBoiler() {  // 생성자 접근금지, 이 명령어 작동X : 아무나 Instance만들지 못하도록
    empty=true;
    boiled=false;
  }
  
  /* ChocolateBoiler chocolateBoiler=new ChocolateBoiler();  (X)불가 / new는 public만
  ChocolateBoiler.getInstance(); */
  
  
  public static ChocolateBoiler getInstance(){  // 이함수를 통해 만들수있다
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new ChocolateBoiler(); // private은 자기자신은 쓸수있어
    } 
    // <lazy instantiation> : 필요할때 객체생성
    
    //else{
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);  // 몇번 호출됐는지
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