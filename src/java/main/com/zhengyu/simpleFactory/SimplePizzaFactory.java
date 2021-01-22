package main.com.zhengyu.simpleFactory;

import main.com.zhengyu.domian.PaizzMeat;
import main.com.zhengyu.domian.PaizzaVegg;
import main.com.zhengyu.domian.Pizza;

import java.io.Serializable;

/**
 * 核心类，工厂类
 */
public class SimplePizzaFactory implements Serializable {

    public Pizza createPizza(String typePizza){
        if("肉".equals(typePizza)){
           return new PaizzMeat();
        }else if("蔬菜".equals(typePizza)){
            return new PaizzaVegg();
        }
        return null;
    }

}
