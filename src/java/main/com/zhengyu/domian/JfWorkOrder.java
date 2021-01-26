package main.com.zhengyu.domian;


public class JfWorkOrder {

    private Long orderSerialNbr;

    private Long prodInstId;

    private Long lanId;

    private Long staffId;

    public Long getOrderSerialNbr() {
        return orderSerialNbr;
    }

    public void setOrderSerialNbr(Long orderSerialNbr) {
        this.orderSerialNbr = orderSerialNbr;
    }

    public Long getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    public Long getLanId() {
        return lanId;
    }

    public void setLanId(Long lanId) {
        this.lanId = lanId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}
