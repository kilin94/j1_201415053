package com.sd.dao.v1;

public class Person {
  private int id;  // int -> 스키마에서 자동증가 [불편]
  private String name;  // String은 제한X  -> 스키마에서 VARCHAR(255)로가면 짤릴가능성
  public Person(int id, String name){
    this.id=id;
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getid(){
    return id;
  }
  public void setid(int id){
    this.id=id;
  }
}