// S.4.1 classic
package headfirst.singleton.classic;

public class Singleton{
  
  private static Singleton uniqueInstance;
  private static int numCalled=0;
  
  private Singleton() { //¡Ú
  }
   
  public static Singleton getInstance(){
    
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance=new Singleton();  // <lazy instantiation>
    } 
    
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}

// Keyword : static, private, if¹®