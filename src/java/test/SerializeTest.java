package test;


import main.com.zhengyu.simpleFactory.PizzaStore1;
import main.com.zhengyu.simpleFactory.SimplePizzaFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

    public static void main(String[] args)
    {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore1 h = new PizzaStore1(simplePizzaFactory);

        //准备一个文件用于存储该对象的信息
        File f = new File("hello.obj");

        try(FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            FileInputStream fis = new FileInputStream(f);
//            ObjectInputStream ois = new ObjectInputStream(fis)
        )
        {
            //序列化对象，写入到磁盘中
            oos.writeObject(h);
            //反序列化对象
//            PizzaStore newHello = (PizzaStore)ois.readObject();
//
//            //测试方法
//            newHello.orderPizza("肉");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
