package com.sd.dao.v1;

public class Person {
  private int id;  // int -> ��Ű������ �ڵ����� [����]
  private String name;  // String�� ����X  -> ��Ű������ VARCHAR(255)�ΰ��� ©�����ɼ�
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