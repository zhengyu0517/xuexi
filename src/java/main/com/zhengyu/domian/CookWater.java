package main.com.zhengyu.domian;

public class CookWater extends Water {
    public CookWater(String a) {
        this();
    }

    public CookWater() {
        super();
    }

    @Override
    void prepareWater() {
        System.out.println("准备可乐汽水");
    }

    @Override
    void makeWater() {
        System.out.println("制作可乐汽水");
    }

    @Override
    void completeWater() {
        System.out.println("可乐汽水制作完成");
    }
}
