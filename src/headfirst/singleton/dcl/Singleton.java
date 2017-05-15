// S.4.4 DCL
package headfirst.singleton.dcl;

public class Singleton{
  
  //private static Singleton uniqueInstance=new Singleton();
  private volatile static Singleton uniqueInstance;  // ��volatile: �Լ� �Ӹ� �ƴ϶� instance�� '�����' ������ �˼� �ֵ���
                                                     // (thread �ڽŸ� �ƴ� cache memory���� Main Memory�� ����ȭ)
  
  private static int numCalled=0;
  
  private Singleton() {
  }
  
  //public static synchronized Singleton getInstance(){  // ��synchronized : '�����' �����ǿ� ǥ�� <����ȭ>
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