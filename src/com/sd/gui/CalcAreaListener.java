package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener {
  
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButton)e.getSource();//클릭된곳[버튼:b1] 소스 가져오기 (getSource: ActionEvent 상위에 정의)
    String cmd=e.getActionCommand(); //버튼위에 써진거 ["계산"] 받아오기
    
    if (cmd.equals("계산")) {
      System.out.println("계산 버튼");
      b.setText("계산했습니다"); // 버튼위 문자를 "계산했습니다"로 바꾸기
    }
  }
}