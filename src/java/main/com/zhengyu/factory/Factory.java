package main.com.zhengyu.factory;


import main.com.zhengyu.modul.simpleFactory.Pizza;

public interface Factory {

    Pizza createPizza(String type);
}
