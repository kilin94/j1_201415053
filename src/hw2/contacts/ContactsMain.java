package hw2.contacts;
import java.awt.*;
import javax.swing.*;

public class ContactsMain {
  static JTextField nameTf1,phoneTf2,idTf3;
  
  public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(6,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("�̸�");
      JLabel label2=new JLabel("��ȭ��ȣ");
      nameTf1=new JTextField(20);
      phoneTf2=new JTextField(20);
      JButton b1=new JButton("Table����");
      JButton b2=new JButton("Table����");
      JButton b3=new JButton("���");
      JButton b4=new JButton("����");
      JButton b5=new JButton("����");
      JButton b6=new JButton("��ȸ");
      JButton b7=new JButton("��ü��ȸ");
      JButton b8=new JButton("�ݱ�");
      
      b1.addActionListener(new ContactsListener());
      b2.addActionListener(new ContactsListener());
      b3.addActionListener(new ContactsListener());
      b4.addActionListener(new ContactsListener());
      b5.addActionListener(new ContactsListener());
      b6.addActionListener(new ContactsListener());
      b7.addActionListener(new ContactsListener());
      b8.addActionListener(new ContactsListener());
      
      panel.add(b1);
      panel.add(b2);
      panel.add(label1);
      panel.add(nameTf1);
      panel.add(label2);
      panel.add(phoneTf2);
      panel.add(b3);
      panel.add(b4);
      panel.add(b5);
      panel.add(b6);
      panel.add(b7);
      panel.add(b8);
        
      f.pack();
      f.setVisible(true);
    }
}