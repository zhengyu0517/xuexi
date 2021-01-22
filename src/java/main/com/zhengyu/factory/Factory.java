package main.com.zhengyu.factory;


import main.com.zhengyu.domian.Pizza;

public interface Factory {

    Pizza createPizza(String type);
}
