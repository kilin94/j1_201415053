package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer{
  
  Double babyCurpos; // baby ��ġ
  public MomTurtle(){} // ������ �����
   
  public void update(Observable o, Object arg){
    babyCurpos=((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
    // ������ ����: ���� (���� �߰�)
  }
}