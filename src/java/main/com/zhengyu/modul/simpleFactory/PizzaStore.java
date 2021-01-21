package main.com.zhengyu.modul.simpleFactory;

public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String typePizza){
        System.out.println("预定Pizaa");
        Pizza pizza =  simplePizzaFactory.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }
}
