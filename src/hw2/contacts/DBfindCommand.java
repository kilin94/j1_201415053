package hw2.contacts;

public class DBfindCommand implements Command{
  Database db;
  public DBfindCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.find();
  }
}