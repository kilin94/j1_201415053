// S.4.4 DCL
package headfirst.singleton.dcl;

public class Singleton{
  
  //private static Singleton uniqueInstance=new Singleton();
  private volatile static Singleton uniqueInstance;  // ★volatile: 함수 뿐만 아니라 instance도 '사용중' 누구나 알수 있도록
                                                     // (thread 자신만 아는 cache memory에서 Main Memory로 동기화)
  
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  //public static synchronized Singleton getInstance(){  // ★synchronized : '사용중' 전광판에 표시 <동기화>
  public static Singleton getInstance(){  
    if(uniqueInstance==null){
      
      synchronized(Singleton.class) {
        if(uniqueInstance==null){
          System.out.println("creating...");
          uniqueInstance=new Singleton();
        }
      }
    } 
    
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
      return uniqueInstance;
  }
}