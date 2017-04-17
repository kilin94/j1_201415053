package headfirst.factory.pizzas;
//import headfirst.factory.pizzas.Pizza; // ��� �Ǵ�����: ���� ��Ű���� ������ ���� ����

public class PizzaStore {
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  }
  
  public Pizza orderPizza(String type) {
    Pizza pizza=null;
    pizza=factory.createPizza(type); //RunTime�� �����(ġ��,���۷δ�)���� ����, ������Ÿ�Ӷ� ���� - ���, ������ Ư¡
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}