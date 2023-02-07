package macphu.Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import macphu.Utils.DbUtils;

public class TransactionData {

    public static void setTransactionData(int barcode, String customerPhone, String cardNumber){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO `ecobike`.`transaction` (`customer_phone`, `card_id`, `barcode`) VALUES ('"+customerPhone+"', '"+cardNumber+"', '"+barcode+"');";

        Statement stm = null;
        try {
            stm = conn.createStatement();
            stm.execute(query);
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void setFinalTransactionData(int barcode, int time, int cost){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO `ecobike`.`transaction` (`barcode`, `time`, `cost`) VALUES ('"+barcode+"', '"+time+"', '"+cost+"');";

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
