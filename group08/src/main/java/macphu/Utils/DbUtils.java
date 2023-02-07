package macphu.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtils {
    
    private String hostName = "localhost:3306";
    private String dbName = "ecobike";
    private String username = "root";
    private String password = "MacPhu12";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}