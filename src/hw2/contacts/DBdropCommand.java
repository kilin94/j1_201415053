package hw2.contacts;

public class DBdropCommand implements Command{
  Database db;
  public DBdropCommand(Database db){
    this.db=db;
  }
  public void execute(){
    db.drop();
  }
}