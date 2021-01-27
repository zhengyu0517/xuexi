package main.com.zhengyu.lamda;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Lamda {
    //静态内部类
    static class InnerLamda2 implements  LamdaInter{

        @Override
        public void lamdaTest() {
            System.out.println("lamda学习2");
        }
    }
    public static void main(String[] args){
        LamdaInter lamdaInter = new InnerLamda();
        lamdaInter.lamdaTest();
        lamdaInter = new InnerLamda2();
        lamdaInter.lamdaTest();
        //局部内部类
        class InnerLamda3 implements LamdaInter{

            @Override
            public void lamdaTest() {
                System.out.println("lamda学习3");
            }
        }

        lamdaInter = new InnerLamda3();
        lamdaInter.lamdaTest();

        //匿名内部类，没有类名称，需要借助接口或者父类
        lamdaInter = new LamdaInter() {
            @Override
            public void lamdaTest() {
                System.out.println("lamda学习4");
            }
        };

        lamdaInter = () -> System.out.println("lamda学习4");
    }

}
//定义一个只有一个抽象方法的接口（函数式接口）
interface LamdaInter{
    abstract void lamdaTest();
}

class InnerLamda implements  LamdaInter{

    @Override
    public void lamdaTest() {
        System.out.println("lamda学习");
    }
}