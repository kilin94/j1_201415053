package hw2.contacts;

public class DBinsertCommand implements Command{
  Database db;
  public DBinsertCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.insert();
  }
}