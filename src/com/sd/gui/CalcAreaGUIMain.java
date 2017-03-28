package com.sd.gui;
import java.awt.*;  // ���߿��ҋ��� �ʿ��Ѱ͸�
import javax.swing.*;

public class CalcAreaGUIMain {
    public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(3,2)); //6��
      f.getContentPane().add(panel); //�����ӿ� �гγֱ� pane���ؼ� �ű�ٳִ°�
      JLabel label1=new JLabel("������");
      JLabel label2=new JLabel("����");
      JTextField radiusTf1=new JTextField(20); // ������ �ִ� ����
      JTextField areaTf2=new JTextField(20);
      JButton b1=new JButton("���"); // b1������ notify �ε� ���� ���� ����
      JButton b2=new JButton("���");
        
      b1.addActionListener(new CalcAreaListener()); //��ư�� ��� (register) 
        // ActionListener�� ��ư�� �������ִµ� (loose coupling)  �����Ű��
      
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