// 3rd
package com.sd.dao.v2;
import java.util.List;

public interface PersonDao {
  public void insert(PersonVO p);
  public List<PersonVO> findAll(); // ������, ����:list, �Է�:������ �������� (ID<4)   # selectALL, findAll �̶� �ϱ⵵ 
  public PersonVO findById(int id); // select, �ܰ���ȸ, �Է�: Primary Key�� ��,  # findByPK�� �ϱ⵵
  public void update(PersonVO p); // ������Ʈ. ����:����, �Է�:person(PK����) (�����ϴ��� ����)
  public void delete(int id); 
  //public void delete(PersonVO p); 
}