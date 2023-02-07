package macphu.Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import macphu.Models.DockModel;
import macphu.Utils.DbUtils;

public class DockData {

    public ObservableList<DockModel> getDockData(){
        ObservableList<DockModel> docksModel = FXCollections.observableArrayList();
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "SELECT  d.dockId, d.dockName, d.dockAddress, d.dockCapacity, e.available FROM dockTb as d LEFT JOIN (SELECT dockId, COUNT(DISTINCT bikeId) as available FROM bikes_in_dock  GROUP BY dockId) as e ON d.dockId = e.dockId ;";

        Statement stm = null;
        try {
         //Tạo đối tượng Statement
            stm = conn.createStatement();

        //Thực thi truy vấn và trả về đối tượng ResultSet
        ResultSet rs = stm.executeQuery(query);

        //Duyệt kết quả trả về
        while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
            int id = rs.getInt("dockId");
            String name = rs.getString("dockName");
            String address = rs.getString("dockAddress");
            int capacity = rs.getInt("dockCapacity");
            int available = rs.getInt("available");
            DockModel dock = new DockModel(id, name, address, capacity, available);
            docksModel.add(dock);
        }
        //Đóng kết nối
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docksModel;
    }
    public ObservableList<DockModel> getDockByName(String findName){
        ObservableList<DockModel> docksModel = FXCollections.observableArrayList();
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "SELECT  d.dockId, d.dockName, d.dockAddress, d.dockCapacity, e.available FROM (SELECT * FROM dockTb WHERE dockName=\""+findName+"\") as d LEFT JOIN (SELECT dockId, COUNT(DISTINCT bikeId) as available FROM bikes_in_dock  GROUP BY dockId) as e ON d.dockId = e.dockId ;";

        Statement stm = null;
        try {
         //Tạo đối tượng Statement
            stm = conn.createStatement();

        //Thực thi truy vấn và trả về đối tượng ResultSet
        ResultSet rs = stm.executeQuery(query);

        //Duyệt kết quả trả về
        while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
            int id = rs.getInt("dockId");
            String name = rs.getString("dockName");
            String address = rs.getString("dockAddress");
            int capacity = rs.getInt("dockCapacity");
            int available = rs.getInt("available");
            DockModel dock = new DockModel(id, name, address, capacity, available);
            docksModel.add(dock);
        }
        //Đóng kết nối
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docksModel;
    }
    public ObservableList<DockModel> getDockByAddress(String findAddress){
        ObservableList<DockModel> docksModel = FXCollections.observableArrayList();
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "SELECT  d.dockId, d.dockName, d.dockAddress, d.dockCapacity, e.available FROM (SELECT * FROM dockTb WHERE dockAddress LIKE \"%"+findAddress+"%\") as d LEFT JOIN (SELECT dockId, COUNT(DISTINCT bikeId) as available FROM bikes_in_dock  GROUP BY dockId) as e ON d.dockId = e.dockId ;";

        Statement stm = null;
        try {
         //Tạo đối tượng Statement
            stm = conn.createStatement();

        //Thực thi truy vấn và trả về đối tượng ResultSet
        ResultSet rs = stm.executeQuery(query);

        //Duyệt kết quả trả về
        while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
            int id = rs.getInt("dockId");
            String name = rs.getString("dockName");
            String address = rs.getString("dockAddress");
            int capacity = rs.getInt("dockCapacity");
            int available = rs.getInt("available");
            DockModel dock = new DockModel(id, name, address, capacity, available);
            docksModel.add(dock);
        }
        //Đóng kết nối
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docksModel;
    }
}
