package headfirst.factory.pizzas;
//import headfirst.factory.pizzas.Pizza; // 없어도 되는이유: 같은 패키지에 있으면 생략 가능

public class PizzaStore {
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  }
  
  public Pizza orderPizza(String type) {
    Pizza pizza=null;
    pizza=factory.createPizza(type); //RunTime시 어떤피자(치즈,페퍼로니)일지 결정, 컴파일타임땐 몰라 - 상속, 다형성 특징
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}