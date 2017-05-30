package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0 {
  public static void main(String args[]) {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    try{
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver"); // 3´Ü°è
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
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))"; // ÁÖ¼Ò·Ï ¸¸µé¶§ º¯Çü
      stmt.execute(mySql);*/
      
      /* (2)
      String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      stmt=conn.createStatement();
      stmt.execute(mySql);*/
      
      // (3)
      String mySql="select name from persons where id<4 order by id";
      stmt=conn.createStatement();
      rs=stmt.executeQuery(mySql);
      
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }
        
    } catch (Exception e){
      e.printStackTrace();
    } finally  {  // ´Ý¾ÆÁà¾ßÇØ
      
      try{
        if(rs!=null) rs.close();// ¾È´ÝÀ¸¸é ½º¸£¸¤ Á×¾î
        if(stmt!=null) stmt.close();
        if(conn!=null) conn.close();
      }catch (Exception e){};
    } 
  }
}