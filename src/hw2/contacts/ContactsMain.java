package hw2.contacts;
import java.awt.*;
import javax.swing.*;

public class ContactsMain {
  static JTextField nameTf1,phoneTf2,idTf3;
  
  public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(6,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("이름");
      JLabel label2=new JLabel("전화번호");
      nameTf1=new JTextField(20);
      phoneTf2=new JTextField(20);
      JButton b1=new JButton("Table생성");
      JButton b2=new JButton("Table삭제");
      JButton b3=new JButton("등록");
      JButton b4=new JButton("삭제");
      JButton b5=new JButton("수정");
      JButton b6=new JButton("조회");
      JButton b7=new JButton("전체조회");
      JButton b8=new JButton("닫기");
      
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