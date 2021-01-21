package main.com.zhengyu.factory;

import main.com.zhengyu.modul.simpleFactory.Pizza;

public class PizzaStore1 implements Factory {

    void orderPizza(){

    }
    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
