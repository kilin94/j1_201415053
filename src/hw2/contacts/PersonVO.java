package hw2.contacts;

public class PersonVO {
  private String name;
  private String phone;
  
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getPhone(){
    return phone;
  }
  public void setPhone(String phone){
    this.phone=phone;
  }
  public String toString(){
    return name+":"+phone;
  }
}