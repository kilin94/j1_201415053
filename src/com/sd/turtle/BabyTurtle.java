package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class BabyTurtle extends Observable {  // ���߻�ӺҰ��� �Ұ���, Turtle�� ���?
  Turtle baby; // ��������
  ArrayList<Observer> obs; // 2��°ĭ : (������ ���ڸ� ��ȭ��ȣ) �ٸ��Լ������� �̰� ���Եɶ� ���� �����
  Double myCurpos;
  
  public BabyTurtle(){
    baby=new Turtle();
    
    // �迭 vs arrayList
    obs=new ArrayList<Observer>(); // �����ڿ��� ��������鼭 �ʱ�ȭ - ���鶧 �޸�Ȯ�� [early ���] / ���� �Ҽ��� �ִ� [late ���]
  }
  
  public void addObserver(Observer o) {  
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this,1); // update���ڴ� Mom���� - 1st���� this:observable, 2nd����: �ƹ��ų�(��� �ϴ°���)
  }
  
  protected void setChanged() { // protected:�ı��鸸, public:�ƹ���
    myCurpos=baby.getPos(); // Turtle �Լ�, Mom���� ���پ���
  }
  
  public void move (int x,int y) {
    baby.moveTo(x,y);
  }
}