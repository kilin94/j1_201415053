package hw1.contacts;
import java.awt.event.*;
import javax.swing.*;

public class ContactsListener implements ActionListener {
  
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    
    if (cmd.equals("등록")) {
      System.out.println("이름 : " + ContactsMain.nameTf1.getText());
      System.out.println("전화번호 : " + ContactsMain.phoneTf2.getText());
      System.out.println("등록했습니다");
    }
    else if (cmd.equals("삭제")) {
      ContactsMain.nameTf1.setText("");
      ContactsMain.phoneTf2.setText("");
      System.out.println("삭제했습니다");
    }
  }
}