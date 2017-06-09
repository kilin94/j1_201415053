// 1st : v0���� �����ϴ� �κи� ����� ����ϴ� �κ��� DAO�� ��
// �����ϴ� �κ� Singleton����

package com.sd.dao.v2;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionFactory {
  private static Connection conn=null;  // <lazy>
  private ConnectionFactory() {}  // Singleton����
  public static Connection getConnection() {
    
    //Statement stmt=null;
    //ResultSet rs=null;  // DB��� ����, �Ⱦ�
    
    try{
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver"); // 3�ܰ�
      //static Connection getConnection(String url, String user, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root",';5555");
      conn=DriverManager.getConnection(
                                       prop.getProperty("URL")+"?useSSL=true",
                                       prop.getProperty("USER"),
                                       prop.getProperty("PASSWORD")
                                      );
      /* (1)
      stmt=conn.createStatement();
      String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))"; // �ּҷ� ���鶧 ����
      stmt.execute(mySql);*/
      
      /* (2)
      String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      stmt=conn.createStatement();
      stmt.execute(mySql);*/
      
      /* (3)
      String mySql="select name from persons where id<4 order by id";
      stmt=conn.createStatement();
      rs=stmt.executeQuery(mySql);
      
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }*/
        
    } catch (Exception e){
      e.printStackTrace();
    } 
    /*finally  {  // �ݾ������
      
      try{
        if(rs!=null) rs.close();// �ȴ����� ������ �׾�
        if(stmt!=null) stmt.close();
        if(conn!=null) conn.close();
      }catch (Exception e){};
    } */
    
    return conn;
  }
}