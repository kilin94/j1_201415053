package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener {
  
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButton)e.getSource();//Ŭ���Ȱ�[��ư:b1] �ҽ� �������� (getSource: ActionEvent ������ ����)
    String cmd=e.getActionCommand(); //��ư���� ������ ["���"] �޾ƿ���
    
    if (cmd.equals("���")) {
      System.out.println("��� ��ư");
      b.setText("����߽��ϴ�"); // ��ư�� ���ڸ� "����߽��ϴ�"�� �ٲٱ�
    }
  }
}