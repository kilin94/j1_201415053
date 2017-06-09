// 4th
package com.sd.dao.v2;
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

public class PersonDaoImpl implements PersonDao { // DAO에 있는 함수 5개 구현
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  
  public void insert(PersonVO p) {
    try {
      //ConnectionFactory conn=ConnectionFactory.getConnection();
      //String mySql="INSERT INTO persons(name,address) VALUES(?,?)";  // v0
      
      pstmt=conn.prepareStatement("INSERT INTO persons(id,name,address) VALUES(NULL,?,?)");
      // prepareStatement: statement와 유사, ?를 쓸수 있는
      
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      
      System.out.println("Inserting..."+p.getName());
      pstmt.executeUpdate();
    
    } catch (SQLException e) {
      e.printStackTrace();
    } /*finally {
      conn.close();  // 매 커넥션마다 열고닫기가 정석,안전 / 여기서는 한꺼번에 하기로
    }*/
  }
 
  public PersonVO findById(int id) {  // 보통 findByPK(Primary Key)
    PersonVO p=null;
    try {
      pstmt=conn.prepareStatement("select * from persons where id=?");
      pstmt.setInt(1,id);
      rs=pstmt.executeQuery(); // ResultSet은 결과가 여러개 목록일수도, 하나일수도 / 여기선 id, 키니까 하나
      if(rs.next()) { // ★보통 while문 / 하나가 담겨있다 추정하면 if문
        p=new PersonVO(); // VO에 만들어둔 함수 사용해서 id,name,address 담아줌
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
    return p;
  }
  
  public List<PersonVO> findAll() {
    Statement stmt=null;
    List<PersonVO> persons=new ArrayList<PersonVO>();
    try {
      stmt=conn.createStatement();
      rs=stmt.executeQuery("SELECT * FROM persons"); // ?가 필요없어 -> statement
    
      PersonVO p=null;
      while(rs.next()) { // 여러개니까 while문
        p=new PersonVO();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p); // while문 돌면서 list p 에 넣어
      }
    } catch(SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(stmt!=null) stmt.close();
      } catch (Exception e) {};
    }
    return persons;
  }
  
  public void update(PersonVO p){
    try {
      pstmt=conn.prepareStatement("UPDATE persons SET name=?, address=? WHERE id=?");
      pstmt.setString(1,p.getName()); // =v1
      pstmt.setString(2,p.getAddress());
      pstmt.setInt(3,p.getId());
      
      System.out.println("updating..."+p.getName());
      pstmt.executeUpdate();
      
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void delete(int id){
    try {
      pstmt=conn.prepareStatement("DELETE FROM persons Where id=?");
      pstmt.setInt(1,id);
      int rows=pstmt.executeUpdate(); // 몇개가 삭제되었는지 rows에 들어옴
      
      if(rows==0){
        System.out.println("can not delete...");
      } else if(rows>0){
        System.out.println("deleting..."+id);
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void close() {
    System.out.println("closing all...");
    try{
      if(rs!=null) rs.close();// 안닫으면 스르륵 죽어
      if(pstmt!=null) pstmt.close();
      if(conn!=null) conn.close();
    }catch (Exception e){};
  } // v0 마지막에 있던거
}