package hw2.contacts;

public class Database{
  PersonVO p = new PersonVO();
  PersonDao pDao=new PersonDaoImpl();
  public Database(){
  }
  
  public void insert() {
    getTf();
    if (ContactsMain.nameTf1.getText().equals("") || ContactsMain.phoneTf2.getText().equals("")) {
      System.out.println("입력 오류");
    }
    else if (!ContactsMain.nameTf1.getText().matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*")) {
      System.out.println("특수문자 입력 오류");
    }
    else if (!ContactsMain.phoneTf2.getText().matches("[0-9|#|*]*")) {
      System.out.println("전화번호는 숫자만 입력할 수 있습니다");
    }
    else {
      pDao.insert(p);
    } 
    emptyTf();
  }
  public void delete(){
    getTf();
    pDao.delete(p);
    emptyTf();
  }
  public void update(){
    getTf();
    pDao.update(p);
    emptyTf();
  }
  public void find(){
    getTf();
    pDao.find(p);
    emptyTf();
  }
  public void create(){
    pDao.create();
  }
  public void drop(){
    pDao.drop();
  }
  public void findAll(){
    pDao.findAll();
  }
  public void close(){
    pDao.close();
  }
  
  public void getTf(){
    p.setName(ContactsMain.nameTf1.getText());
    p.setPhone(ContactsMain.phoneTf2.getText());
  }
  public void emptyTf(){
    ContactsMain.nameTf1.setText("");
    ContactsMain.phoneTf2.setText("");
  }
}