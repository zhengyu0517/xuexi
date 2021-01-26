package test;

import main.com.zhengyu.domian.JfWorkOrder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDriver {
    public static void main(String[] args) throws Exception{

        JfWorkOrder jfWorkOrder = new JfWorkOrder();
        jfWorkOrder.setLanId(591l);
        jfWorkOrder.setProdInstId(123456l);
        jfWorkOrder.setStaffId(123l);
//        add(jfWorkOrder);
        delete(1l);
////        ps.executeUpdate();
//        ResultSet rs = ps.executeQuery();
//        while(rs.next()){
//            String prodInstId = rs.getString("prod_inst_id");
//            System.out.println(prodInstId);
//        }
//        rs.close();
//        ps.close();
//        conn.close();
    }

    public static void add(JfWorkOrder jfWorkOrder){
        String sql = "insert into jf_work_order values(4,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, jfWorkOrder.getLanId());
            ps.setLong(2, jfWorkOrder.getProdInstId());
            ps.setLong(3, jfWorkOrder.getStaffId());
            ps.execute();
//            ResultSet rs = ps.getGeneratedKeys();
//
//            while (rs.next()) {
//                Long id = rs.getLong(1);
//            }
//                    rs.close();
                    ps.close();
                    conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void delete( Long id){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            Statement s = conn.createStatement();
            String sql = "delete from jf_work_order where orderSerialNbr = " + id ;
            s.execute(sql);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
