package hw1.contacts;
import java.awt.event.*;
import javax.swing.*;

public class ContactsListener implements ActionListener {
  
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    
    if (cmd.equals("���")) {
      System.out.println("�̸� : " + ContactsMain.nameTf1.getText());
      System.out.println("��ȭ��ȣ : " + ContactsMain.phoneTf2.getText());
      System.out.println("����߽��ϴ�");
    }
    else if (cmd.equals("����")) {
      ContactsMain.nameTf1.setText("");
      ContactsMain.phoneTf2.setText("");
      System.out.println("�����߽��ϴ�");
    }
  }
}