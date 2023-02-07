package macphu.Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import macphu.Models.CustomerModel;
import macphu.Utils.DbUtils;

public class CustomerData {
    public static void setCardData(CustomerModel customer){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();
        String query = "INSERT INTO customer (name, address, phone) VALUES ('"+customer.getCustomerName()+"', '"+customer.getCustomerAddress()+"', '"+customer.getCustomerPhone()+"') ";


        Statement stm = null;

        try {
               stm = conn.createStatement();
               stm.execute(query);
           conn.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }
}
