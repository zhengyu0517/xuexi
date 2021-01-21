package main.com.zhengyu.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {


    public  Object getProxy(Object object) throws Exception{
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

    public  Object getProxyNew(Object object) throws Exception{
        Class clazz = object.getClass();
        ClassLoader classLoader = object.getClass().getClassLoader();
        Object object1 = Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("开始");
                    Object result = method.invoke(object, args);
                    System.out.println("结束");
                    return result;
            }
        });

        return object1;
    }
}
