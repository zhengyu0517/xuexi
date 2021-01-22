package main.com.zhengyu.domian;

import java.io.Serializable;

public class Customer implements Cloneable, Serializable {

    private String custName;
    private Long age;
    private Long custId;
    private Party party;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        Customer customer = (Customer)super.clone();
        customer.party = party.clone();
        return customer;
    }
}
