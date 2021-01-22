package main.com.zhengyu.domian;

public class AppleWater extends Water {
    @Override
    void prepareWater() {
        System.out.println("准备苹果汽水");
    }

    @Override
    void makeWater() {
        System.out.println("制作苹果汽水");
    }

    @Override
    void completeWater() {
        System.out.println("苹果汽水制作完成");
    }
}
