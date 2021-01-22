package test;

import main.com.zhengyu.simpleFactory.PizzaStore1;
import main.com.zhengyu.simpleFactory.SimplePizzaFactory;

public class factoryTest {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore1 pizzaStore = new PizzaStore1(simplePizzaFactory);
        pizzaStore.orderPizza("肉");
    }
}
