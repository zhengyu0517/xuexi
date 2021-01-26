package test;


import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import main.com.zhengyu.domian.Customer;
import main.com.zhengyu.domian.Party;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Customer customer = new Customer();
        Party party = new Party();
        party.setPartyId(1l);
        customer.setAge(1l);
        customer.setCustId(1l);
        customer.setCustName("张三");
        customer.setParty(party);
        Customer customer1 = customer.clone();
//        customer1.setCustId(2l);
//        customer1.getParty().setPartyId(2l);
        System.out.println(customer1.getParty().toString());
        Customer customer2 = (Customer) cloneObjec(customer);
//        customer2.setCustId(3l);
//        customer2.getParty().setPartyId(3l);
//        Party party1 = new Party();
//        party1.setPartyId(2l);
//        customer1.setParty(party1);
        System.out.println(customer.hashCode());
        System.out.println(customer1.hashCode());
        System.out.println(customer2.hashCode());
        System.out.println("年龄："+customer.getAge()+"名称："+customer.getCustName()+"排名："+ customer.getCustId());
        System.out.println("PartyId："+customer.getParty().getPartyId());
        System.out.println("年龄："+customer1.getAge()+"名称："+customer1.getCustName()+"排名："+ customer1.getCustId());
        System.out.println("PartyId："+customer1.getParty().getPartyId());
        System.out.println("年龄："+customer2.getAge()+"名称："+customer2.getCustName()+"排名："+ customer2.getCustId());
        System.out.println("PartyId："+customer2.getParty().getPartyId());

    }

    public static Object cloneObjec(Object object) throws IOException, ClassNotFoundException {
        ByteOutputStream byteOutputStream = new ByteOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
        objectOutputStream.writeObject(object);
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOutputStream.getBytes());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteIn);
        return objectInputStream.readObject();
    }
}
