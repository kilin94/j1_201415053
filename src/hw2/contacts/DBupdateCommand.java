package hw2.contacts;

public class DBupdateCommand implements Command{
  Database db;
  public DBupdateCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.update();
  }
}