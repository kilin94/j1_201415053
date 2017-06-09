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

public class PersonDaoImpl implements PersonDao { // DAO�� �ִ� �Լ� 5�� ����
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  
  public void insert(PersonVO p) {
    try {
      //ConnectionFactory conn=ConnectionFactory.getConnection();
      //String mySql="INSERT INTO persons(name,address) VALUES(?,?)";  // v0
      
      pstmt=conn.prepareStatement("INSERT INTO persons(id,name,address) VALUES(NULL,?,?)");
      // prepareStatement: statement�� ����, ?�� ���� �ִ�
      
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      
      System.out.println("Inserting..."+p.getName());
      pstmt.executeUpdate();
    
    } catch (SQLException e) {
      e.printStackTrace();
    } /*finally {
      conn.close();  // �� Ŀ�ؼǸ��� ����ݱⰡ ����,���� / ���⼭�� �Ѳ����� �ϱ��
    }*/
  }
 
  public PersonVO findById(int id) {  // ���� findByPK(Primary Key)
    PersonVO p=null;
    try {
      pstmt=conn.prepareStatement("select * from persons where id=?");
      pstmt.setInt(1,id);
      rs=pstmt.executeQuery(); // ResultSet�� ����� ������ ����ϼ���, �ϳ��ϼ��� / ���⼱ id, Ű�ϱ� �ϳ�
      if(rs.next()) { // �ں��� while�� / �ϳ��� ����ִ� �����ϸ� if��
        p=new PersonVO(); // VO�� ������ �Լ� ����ؼ� id,name,address �����
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
      rs=stmt.executeQuery("SELECT * FROM persons"); // ?�� �ʿ���� -> statement
    
      PersonVO p=null;
      while(rs.next()) { // �������ϱ� while��
        p=new PersonVO();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p); // while�� ���鼭 list p �� �־�
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
      int rows=pstmt.executeUpdate(); // ��� �����Ǿ����� rows�� ����
      
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
      if(rs!=null) rs.close();// �ȴ����� ������ �׾�
      if(pstmt!=null) pstmt.close();
      if(conn!=null) conn.close();
    }catch (Exception e){};
  } // v0 �������� �ִ���
}