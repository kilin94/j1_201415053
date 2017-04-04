package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class BabyTurtle extends Observable {  // 다중상속불가로 불가피, Turtle은 어떻게?
  Turtle baby; // 연관관계
  ArrayList<Observer> obs; // 2번째칸 : (도깨비가 이자리 전화번호) 다른함수에서도 이거 쓰게될때 오래 저장용
  Double myCurpos;
  
  public BabyTurtle(){
    baby=new Turtle();
    
    // 배열 vs arrayList
    obs=new ArrayList<Observer>(); // 생성자에서 만들어지면서 초기화 - 만들때 메모리확보 [early 방식] / 쓸때 할수도 있다 [late 방식]
  }
  
  public void addObserver(Observer o) {  
    obs.add(o);
  }
  
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this,1); // update인자는 Mom참조 - 1st인자 this:observable, 2nd인자: 아무거나(헬로 하는거임)
  }
  
  protected void setChanged() { // protected:식구들만, public:아무나
    myCurpos=baby.getPos(); // Turtle 함수, Mom에서 갖다쓴다
  }
  
  public void move (int x,int y) {
    baby.moveTo(x,y);
  }
}