package com.sd.turtle;

public class TurtleObserverMain{
  public static void main(String[] args){
    BabyTurtle baby=new BabyTurtle();
    MomTurtle mom=new MomTurtle();
    
    // ����: weather�Ҷ� display
    
    baby.addObserver(mom); // ������ �Ѿ��
    
    mom.moveTo(100,100);
    baby.move(100,-100);   // ��ġ����
    baby.setChanged();
    baby.notifyObservers();// �������� �˷��� / setchange�� ������ ��� ��
  }
}