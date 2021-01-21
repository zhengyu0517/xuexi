package main.com.zhengyu.modul.simpleFactory;

public class Test {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("肉");
    }
}
