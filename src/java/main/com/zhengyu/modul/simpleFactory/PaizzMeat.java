package main.com.zhengyu.modul.simpleFactory;

public class PaizzMeat extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备肉类");
    }

    @Override
    public void make() {
        System.out.println("开始制作肉类piazz");

    }

    @Override
    public void complete() {
        System.out.println("肉类piazz制作完成");
    }

}
