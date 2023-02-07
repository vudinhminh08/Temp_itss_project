package macphu.Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import macphu.Models.BikeModel;
import macphu.Utils.DbUtils;

public class BikeData {

    public ObservableList<BikeModel> getBikeData(){
        ObservableList<BikeModel> bikesModel = FXCollections.observableArrayList();
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();
        int dockId = DockSelection.returnDocNumber();

        String query = "SELECT b.barcode, b.type, b.description, b.status, b.battery, b.license_plate FROM bikeTable b, bikes_in_dock d WHERE b.barcode = d.bikeId AND d.dockId = "+dockId+";";

        Statement stm = null;
        try {
         //Tạo đối tượng Statement
            stm = conn.createStatement();
            
        //Thực thi truy vấn và trả về đối tượng ResultSet
        ResultSet rs = stm.executeQuery(query);
        
        while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
            int barcode = rs.getInt("barcode");
            String type = rs.getString("type");
            String description = rs.getString("description");
            String status = rs.getString("status");
            String battery = rs.getString("battery");
            String license = rs.getString("license_plate");
            
            if (battery == null){
                BikeModel bike = new BikeModel(barcode, type, description, status);
                bikesModel.add(bike);
            }
            else{
                BikeModel bike = new BikeModel(barcode, type, description, status, battery, license);
                bikesModel.add(bike);
            }
           
            
        }
        //Đóng kết nối
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bikesModel;
    }
    public ObservableList<BikeModel> getByBarcode(String findBarcode){
        ObservableList<BikeModel> bikesModel = FXCollections.observableArrayList();
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();
        int dockId = DockSelection.returnDocNumber();

        String query = "SELECT b.barcode, b.type, b.description, b.status, b.battery, b.license_plate FROM bikeTable b, bikes_in_dock d WHERE b.barcode = d.bikeId AND d.dockId = "+dockId+" AND b.barcode = \""+findBarcode+"\";";

        Statement stm = null;
        try {
         //Tạo đối tượng Statement
            stm = conn.createStatement();
            
        //Thực thi truy vấn và trả về đối tượng ResultSet
        ResultSet rs = stm.executeQuery(query);
        
        while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
            int barcode = rs.getInt("barcode");
            String type = rs.getString("type");
            String description = rs.getString("description");
            String status = rs.getString("status");
            String battery = rs.getString("battery");
            String license = rs.getString("license_plate");
            
            if (battery == null){
                BikeModel bike = new BikeModel(barcode, type, description, status);
                bikesModel.add(bike);
            }
            else{
                BikeModel bike = new BikeModel(barcode, type, description, status, battery, license);
                bikesModel.add(bike);
            }
           
            
        }
        //Đóng kết nối
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bikesModel;
    }

    public static void setBikeInUse(String barcode){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "UPDATE `ecobike`.`bikeTable` SET `status` = 'in use' WHERE (`barcode` = '"+barcode+"');";

        Statement stm = null;
        try {
            stm = conn.createStatement();
            stm.execute(query);
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void setBikeAvailable(String barcode){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();

        String query = "UPDATE `ecobike`.`bikeTable` SET `status` = 'available' WHERE (`barcode` = '"+barcode+"');";

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
