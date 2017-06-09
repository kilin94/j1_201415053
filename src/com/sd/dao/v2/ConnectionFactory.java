// 1st : v0에서 연결하는 부분만 남기고 사용하는 부분은 DAO로 뺌
// 연결하는 부분 Singleton패턴

package com.sd.dao.v2;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionFactory {
  private static Connection conn=null;  // <lazy>
  private ConnectionFactory() {}  // Singleton패턴
  public static Connection getConnection() {
    
    //Statement stmt=null;
    //ResultSet rs=null;  // DB사용 관련, 안씀
    
    try{
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver"); // 3단계
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
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))"; // 주소록 만들때 변형
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
    /*finally  {  // 닫아줘야해
      
      try{
        if(rs!=null) rs.close();// 안닫으면 스르륵 죽어
        if(stmt!=null) stmt.close();
        if(conn!=null) conn.close();
      }catch (Exception e){};
    } */
    
    return conn;
  }
}