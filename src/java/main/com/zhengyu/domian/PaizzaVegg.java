package main.com.zhengyu.domian;

public class PaizzaVegg extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备蔬菜");
    }

    @Override
    public void make() {
        System.out.println("开始制作蔬菜piazz");

    }

    @Override
    public void complete() {
        System.out.println("蔬菜piazz制作完成");
    }
}
