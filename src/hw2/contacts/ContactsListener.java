package hw2.contacts;
import java.awt.event.*;
import javax.swing.*;

public class ContactsListener implements ActionListener {
  
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    
    RemoteControl remote=new RemoteControl();
    Database db=new Database();
    DBinsertCommand insert=new DBinsertCommand(db);
    DBdeleteCommand delete=new DBdeleteCommand(db);
    DBupdateCommand update=new DBupdateCommand(db);
    DBfindCommand find=new DBfindCommand(db);
    DBcreateCommand create=new DBcreateCommand(db);
    DBdropCommand drop=new DBdropCommand(db);
    DBfindAllCommand findAll=new DBfindAllCommand(db);
    DBcloseCommand close=new DBcloseCommand(db);
    remote.setCommand(0,insert,delete,update,find,create,drop,findAll,close);
    
    if (cmd.equals("Table생성")) {
      remote.createButtonWasPushed(0);
    }
    else if (cmd.equals("Table삭제")) {
      remote.dropButtonWasPushed(0);
    }
    else if (cmd.equals("등록")) {
      remote.insertButtonWasPushed(0);
    }
    else if (cmd.equals("삭제")) {
      remote.deleteButtonWasPushed(0);
    }
    else if (cmd.equals("수정")) {
      remote.updateButtonWasPushed(0);
    }
    else if (cmd.equals("조회")) {
      remote.findButtonWasPushed(0);
    }
    else if (cmd.equals("전체조회")) {
      remote.findAllButtonWasPushed(0);
    }
    else if (cmd.equals("닫기")) {
      remote.closeButtonWasPushed(0);
    }
  }
}