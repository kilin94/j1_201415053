package hw2.contacts;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;

public class PersonDaoImpl implements PersonDao {
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  Statement stmt=null;
  ResultSet rs=null;
  
  public void create() {
    try {
      stmt=conn.createStatement();
      String mySql="CREATE TABLE persons(name varchar(255) NOT NULL, phone varchar(255) NOT NULL)";
      stmt.execute(mySql);
      System.out.println("created table");
    } catch(SQLException e) {
      System.out.println("Table 'persons' already exists");
    } catch(NullPointerException e) {}
  }
  
  public void drop() {
    try {
      stmt=conn.createStatement();
      String mySql="DROP TABLE persons";
      stmt.execute(mySql);
      System.out.println("droped table");
    } catch(SQLException e) {
      System.out.println("이미 삭제되었거나 생성되지 않았습니다");
    } catch(NullPointerException e) {}
      
    System.out.println("closing all...");
    try{
      if(rs!=null) rs.close();
      if(pstmt!=null) pstmt.close();
      if(stmt!=null) stmt.close();
      if(conn!=null) conn.close();
    } catch (Exception e){};
  }
  
  public void insert(PersonVO p) {
    try {
      pstmt=conn.prepareStatement("INSERT INTO persons(name,phone) VALUES(?,?)");
      
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getPhone());
      
      pstmt.executeUpdate();
      System.out.println("이름:"+p.getName()+", "+"전화번호:"+p.getPhone()+" 항목이 등록되었습니다");
    
    } catch (SQLException e) {
      System.out.println("등록에 실패하였습니다");
    } catch(NullPointerException e) {}
  }
  
  public void delete(PersonVO p){
    try {
      pstmt=conn.prepareStatement("DELETE FROM persons WHERE name=? OR phone=?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getPhone());
      int rows=pstmt.executeUpdate(); // 몇개가 삭제되었는지 rows에 들어옴
      
      if(rows==0){
        System.out.println("데이터가 존재하지 않습니다");
      } else if(rows>0){
        System.out.println(rows+"개 항목이 삭제되었습니다");
      }
    } catch(SQLException e) {
      System.out.println("삭제에 실패하였습니다");
    } catch(NullPointerException e) {}
  }
  
  public void update(PersonVO p){
    try {
      pstmt=conn.prepareStatement("UPDATE persons SET phone=? WHERE name=?");
      pstmt.setString(2,p.getName());
      pstmt.setString(1,p.getPhone());
      int rows=pstmt.executeUpdate();
      
      if(rows==0){
        System.out.println("데이터가 존재하지 않습니다");
      } else if(rows>0){
        System.out.println(rows+"개 항목이 수정되었습니다");
      }
      System.out.println(p.getName()+"의 번호가 "+p.getPhone()+"으로 수정되었습니다");
      pstmt.executeUpdate();
      
    } catch(SQLException e) {
      System.out.println("수정에 실패하였습니다");
    } catch(NullPointerException e) {}
  }
 
  public void find(PersonVO p) {
    List<PersonVO> persons=new ArrayList<PersonVO>();
    try {
      pstmt=conn.prepareStatement("select * from persons where name=? OR phone=?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getPhone());
      
      rs=pstmt.executeQuery();
      while(rs.next()) {
        p=new PersonVO();
        p.setName(rs.getString("name"));
        p.setPhone(rs.getString("phone"));
        persons.add(p);
      }
      System.out.println("검색결과: "+persons);
    } catch(SQLException e) {
      System.out.println("조회에 실패하였습니다");
    } catch(NullPointerException e) {}
  }
  
  public void findAll() {
    List<PersonVO> persons=new ArrayList<PersonVO>();
    try {
      stmt=conn.createStatement();
      rs=stmt.executeQuery("SELECT * FROM persons");
    
      PersonVO p=null;
      while(rs.next()) {
        p=new PersonVO();
        p.setName(rs.getString("name"));
        p.setPhone(rs.getString("phone"));
        persons.add(p);
      }
      System.out.println("* finding all..."+persons);
    } catch(SQLException e) {
      System.out.println("전체조회에 실패하였습니다");
    } catch(NullPointerException e) {}
  }
  
  public void close() {
    try{
      if(rs!=null) rs.close();
      if(pstmt!=null) pstmt.close();
      if(stmt!=null) stmt.close();
      if(conn!=null) conn.close();
    }catch (Exception e){};
    System.exit(0);
  }
}