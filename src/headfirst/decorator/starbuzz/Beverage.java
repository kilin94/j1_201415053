package headfirst.decorator.starbuzz;

public abstract class Beverage{  //�Լ� �ϳ� �̻��� ������ �ȵ������� : abstract
  String description = "Unknown beverage";
//cost;
  
  public String getDescription(){
    return description; //�ƹ��͵� �Ⱦ��� ��Ű�������� private
  }
  public abstract double cost(); //��������
}