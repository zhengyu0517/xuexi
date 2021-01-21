package main.com.zhengyu.factory;


import main.com.zhengyu.modul.simpleFactory.PaizzMeat;
import main.com.zhengyu.modul.simpleFactory.Pizza;

public class PizzaStore implements Factory {
    @Override
    public Pizza createPizza(String type) {
        if("肉".equals(type)){
            return new PaizzMeat();
        }else if("蔬菜".equals(type)){

        }
        return null;
    }

    public void orderPizza(String typePizza){
        System.out.println("预定Pizaa");
        Pizza pizza =  createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }
}
