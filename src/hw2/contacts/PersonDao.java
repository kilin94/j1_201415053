package hw2.contacts;
import java.util.List;

public interface PersonDao {
  public void create();
  public void drop();
  public void insert(PersonVO p);
  public void delete(PersonVO p); 
  public void update(PersonVO p);
  public void find(PersonVO p);
  public void findAll();
  public void close();
}