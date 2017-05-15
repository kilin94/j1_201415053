// S.4.3 thread
package headfirst.singleton.threadsafe;

public class Singleton{
  
  //private static Singleton uniqueInstance=new Singleton();
  private static Singleton uniqueInstance;
  
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  public static synchronized Singleton getInstance(){  // ★synchronized : '사용중' 전광판에 표시 <동기화>
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new Singleton();  // <lazy instantiation>
    }
  
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}

// 문제: 함수 getInstance는 동기화 했는데 uniqueInstance는 잠금장치가 안됨