package hw2.contacts;

public class DBdeleteCommand implements Command{
  Database db;
  public DBdeleteCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.delete();
  }
}