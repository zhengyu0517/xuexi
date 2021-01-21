package main.com.zhengyu.modul.simpleFactory;

/**
 * 核心类，工厂类
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String typePizza){
        if("肉".equals(typePizza)){
           return new PaizzMeat();
        }else if("蔬菜".equals(typePizza)){
            return new PaizzaVegg();
        }
        return null;
    }

}
