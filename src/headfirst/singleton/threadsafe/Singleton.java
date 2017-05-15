// S.4.3 thread
package headfirst.singleton.threadsafe;

public class Singleton{
  
  //private static Singleton uniqueInstance=new Singleton();
  private static Singleton uniqueInstance;
  
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  public static synchronized Singleton getInstance(){  // ��synchronized : '�����' �����ǿ� ǥ�� <����ȭ>
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new Singleton();  // <lazy instantiation>
    }
  
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}

// ����: �Լ� getInstance�� ����ȭ �ߴµ� uniqueInstance�� �����ġ�� �ȵ�