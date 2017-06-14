package hw2.contacts;

public class DBcreateCommand implements Command{
  Database db;
  public DBcreateCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.create();
  }
}