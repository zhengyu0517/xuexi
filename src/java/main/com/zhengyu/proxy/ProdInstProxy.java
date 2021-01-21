package main.com.zhengyu.proxy;

public class ProdInstProxy implements CrmEntity {

    @Override
    public void add() {
        System.out.println("我是代理类，我输出日志了");
        prodInst.add();
    }
    private ProdInst prodInst;

    public ProdInstProxy(ProdInst prodInst){
        this.prodInst = prodInst;
    }

    public void say(){
        System.out.println("我是代理类，我输出日志了");
        prodInst.say();
    }


}
