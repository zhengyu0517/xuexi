package test;

import main.com.zhengyu.proxy.CrmEntity;
import main.com.zhengyu.proxy.MyProxy;
import main.com.zhengyu.proxy.ProdInst;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws Exception {
        ProdInst prodInst = new ProdInst();
//        prodInst.say();
        MyProxy myProxy = new MyProxy();
        CrmEntity crmEntityImpl1 = (CrmEntity)myProxy.getProxyNew(prodInst);
        crmEntityImpl1.say();
//        CrmEntity crmEntityImpl1 = (CrmEntity)getProxyNew(prodInst);
//        ProdInst prodInst = new ProdInst();
//        prodInst.say();
//        ProdInstProxy prodInstProxy = new ProdInstProxy(new ProdInst());
//        prodInstProxy.add();
        //getProxyClass()这个方法，会从你传入的接口Class中，“拷贝”类结构信息到一个新的Class对象中，但新的Class对象带有构造器
//        Class prodInstProxyClazz = Proxy.getProxyClass(CrmEntity.class.getClassLoader(),CrmEntity.class);
//        //得到有参构造函数
//        Constructor constructor = prodInstProxyClazz.getConstructor(InvocationHandler.class);
//        //反射创建代理实例
//        CrmEntity crmEntityImpl = (CrmEntity) constructor.newInstance(new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                ProdInst prodInst = new ProdInst();
//                Object result = method.invoke(prodInst,args);
//                return result;
//            }
//        });
//        crmEntityImpl.add();
//        crmEntityImpl1.add();
//        crmEntityImpl1.say();
    }

    private static Object getProxy(Object object) throws Exception{
        Class prodInstProxyClazz = Proxy.getProxyClass(CrmEntity.class.getClassLoader(),CrmEntity.class);
        //得到有参构造函数
        Constructor constructor = prodInstProxyClazz.getConstructor(InvocationHandler.class);
        //反射创建代理实例
        CrmEntity crmEntityImpl = (CrmEntity) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(object,args);
                return result;
            }
        });
        return crmEntityImpl;
    }

    private static Object getProxyNew(Object object) throws Exception{
        Class clazz = object.getClass();
        ClassLoader classLoader = object.getClass().getClassLoader();
        Object object1 = Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(object,args);
                return result;
            }
        });

        return object1;
    }
}
