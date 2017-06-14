package hw2.contacts;

public class DBcloseCommand implements Command{
  Database db;
  public DBcloseCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.close();
  }
}