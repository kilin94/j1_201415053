package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer{
  
  Double babyCurpos; // baby 위치
  public MomTurtle(){} // 생성자 비워둠
   
  public void update(Observable o, Object arg){
    babyCurpos=((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
    // 나머지 두줄: 도움말 (추후 추가)
  }
}