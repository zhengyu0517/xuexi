package main.com.zhengyu.factory;


import main.com.zhengyu.domian.PaizzMeat;
import main.com.zhengyu.domian.Pizza;

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
