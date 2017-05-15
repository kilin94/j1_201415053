// S.4.2 eager instantiation
package headfirst.singleton.stat;

public class Singleton{
  
  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance=new Singleton(); /* ★이 객체가 뜨면서 바로 생성
   * [객체 만드는 시점] classic :필요할때 <lazy instantiation>
   *                 vs  eager  : 생성자 <eager instantiation> */
  
  private static int numCalled=0;
  
  private Singleton() { //★
  }
  
  public static Singleton getInstance(){
    
/*★ if문 의미 X
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new Singleton();
    }
★*/

    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}

//문제 : thread는 2개인데 자원은 하나인 경우, 이쪽 쓰는걸 저쪽이 또 쓰는 문제