package main.com.zhengyu.domian;

import java.io.Serializable;

public class Party implements Cloneable, Serializable {
    private Long partyId;
    private String partyAdrees;

    public String getPartyAdrees() {
        return partyAdrees;
    }

    public void setPartyAdrees(String partyAdrees) {
        this.partyAdrees = partyAdrees;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    @Override
    public Party clone() throws CloneNotSupportedException {
        return (Party)super.clone();
    }

    @Override
    public String toString(){
        return "Party:"+"partyId="+ getPartyId();
    }




}
