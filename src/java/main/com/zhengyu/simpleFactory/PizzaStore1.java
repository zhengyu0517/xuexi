package main.com.zhengyu.simpleFactory;

import main.com.zhengyu.domian.Pizza;

import java.io.Serializable;

public class PizzaStore1 implements Serializable {


    private static final long serialVersionUID = -1413978502181048493L;

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore1(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public PizzaStore1() {

    }

    public void orderPizza(String typePizza){
        System.out.println("预定Pizaa");
        Pizza pizza =  simplePizzaFactory.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }
}
