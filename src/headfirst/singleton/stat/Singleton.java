// S.4.2 eager instantiation
package headfirst.singleton.stat;

public class Singleton{
  
  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance=new Singleton(); /* ���� ��ü�� �߸鼭 �ٷ� ����
   * [��ü ����� ����] classic :�ʿ��Ҷ� <lazy instantiation>
   *                 vs  eager  : ������ <eager instantiation> */
  
  private static int numCalled=0;
  
  private Singleton() { //��
  }
  
  public static Singleton getInstance(){
    
/*�� if�� �ǹ� X
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new Singleton();
    }
��*/

    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}

//���� : thread�� 2���ε� �ڿ��� �ϳ��� ���, ���� ���°� ������ �� ���� ����