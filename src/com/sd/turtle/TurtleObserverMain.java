package com.sd.turtle;

public class TurtleObserverMain{
  public static void main(String[] args){
    BabyTurtle baby=new BabyTurtle();
    MomTurtle mom=new MomTurtle();
    
    // 참고: weather할때 display
    
    baby.addObserver(mom); // 옵저버 넘어가는
    
    mom.moveTo(100,100);
    baby.move(100,-100);   // 위치변경
    baby.setChanged();
    baby.notifyObservers();// 엄마한테 알려줘 / setchange에 넣으면 없어도 됨
  }
}