package hw2.contacts;

public class DBfindAllCommand implements Command{
  Database db;
  public DBfindAllCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.findAll();
  }
}