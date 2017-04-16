package hw1.contacts;
import java.awt.*;
import javax.swing.*;

public class ContactsMain {
  static JTextField nameTf1,phoneTf2;
  
  public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(3,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("이름");
      JLabel label2=new JLabel("전화번호");
      nameTf1=new JTextField(20);
      phoneTf2=new JTextField(20);
      JButton b1=new JButton("등록");
      JButton b2=new JButton("삭제");
        
      b1.addActionListener(new ContactsListener());
      b2.addActionListener(new ContactsListener());
      
      panel.add(label1);
      panel.add(nameTf1);
      panel.add(label2);
      panel.add(phoneTf2);
      panel.add(b1);
      panel.add(b2);
        
      f.pack();
      f.setVisible(true);
    }
}