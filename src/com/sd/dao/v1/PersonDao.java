package com.sd.dao.v1;
import java.util.List;

public interface PersonDao {
  public List<Person> getAllPersons(); // ������, ����:list, �Է�:������ �������� (ID<4)   # selectALL, findAll �̶� �ϱ⵵ 
  public Person getPerson(int id); // select, �ܰ���ȸ, �Է�: Primary Key�� ��,  # findByPK�� �ϱ⵵
  public void updatePerson(Person p); // ������Ʈ. ����:����, �Է�:person(PK����) (�����ϴ��� ����)
  public void deletePerson(Person p); 
}