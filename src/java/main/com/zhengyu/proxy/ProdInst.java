package main.com.zhengyu.proxy;

public class ProdInst implements CrmEntity{

    @Override
    public void say(){
        System.out.println("prodInst的say方法");
    }

    @Override
    public void add() {
        System.out.println("实现接口的add方法");
    }
}
