//3rd
package headfirst.command.dvd;

public class DVD{
  int pos=0;
  public DVD(){
  }
  
  public void play(){
    pos=10;
    System.out.println("Playing");
    System.out.println("current pos :"+pos);
    System.out.println();
  }
  public void stop(){
    pos=0;
    System.out.println("Stopped");
    System.out.println("current pos : "+pos);
    System.out.println();
  }
  public void RW(){
    pos--;
    System.out.println("Rewrited");
    System.out.println("current pos : "+pos);
    System.out.println();
  }
  public void FF(){
    pos++;
    System.out.println("Fast-Forwarded");
    System.out.println("current pos : "+pos);
    System.out.println();
  }
  
  public void prePos(int pos){ // undo
    this.pos=pos;
    System.out.println("previous position (undo)");
    System.out.println("current pos : "+pos);
    System.out.println();
  }
  public int getPos(){
    return pos;
  }
}