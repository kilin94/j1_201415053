package com.sd.dao.v1;
import java.util.List;

public interface PersonDao {
  public List<Person> getAllPersons(); // 여러건, 리턴:list, 입력:조건을 넣을수도 (ID<4)   # selectALL, findAll 이라 하기도 
  public Person getPerson(int id); // select, 단건조회, 입력: Primary Key가 들어가,  # findByPK라 하기도
  public void updatePerson(Person p); // 업데이트. 리턴:없음, 입력:person(PK제외) (존재하는지 보고)
  public void deletePerson(Person p); 
}