package com.sd.gui;
import java.awt.*;  // 나중에할떄는 필요한것만
import javax.swing.*;

public class CalcAreaGUIMain {
    public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(3,2)); //6개
      f.getContentPane().add(panel); //프레임에 패널넣기 pane구해서 거기다넣는거
      JLabel label1=new JLabel("반지름");
      JLabel label2=new JLabel("면적");
      JTextField radiusTf1=new JTextField(20); // 반지름 넣는 공간
      JTextField areaTf2=new JTextField(20);
      JButton b1=new JButton("계산"); // b1누르면 notify 인데 아직 구현 안함
      JButton b2=new JButton("취소");
        
      b1.addActionListener(new CalcAreaListener()); //버튼에 등록 (register) 
        // ActionListener와 버튼이 떨어져있는데 (loose coupling)  연결시키는
      
      panel.add(label1);
      panel.add(radiusTf1);
      panel.add(label2);
      panel.add(areaTf2);
      panel.add(b1);
      panel.add(b2);
        
      f.pack();
      f.setVisible(true);
    }
}