package macphu.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import macphu.App;
import macphu.Data.BikeSelection;
import macphu.Models.BikeModel;

public class RentStatusController implements Initializable  {

    TimePanelController controller;

    @FXML
    private Text barcode;

    @FXML
    private Text battery;

    @FXML
    private Text license;

    @FXML
    private Text type;

    @FXML
    private Text licenseHolder;

    @FXML
    private Text batteryHolder;

    @FXML
    private AnchorPane timePanel;

    @FXML
    void Pause(ActionEvent event) {
    }

    @FXML
    void Stop(ActionEvent event) throws IOException {
        System.out.print(controller.Stop()+"\n");
        App.setRoot("ReturnBikePage");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BikeModel bike = BikeSelection.returnBikeInfor();
        barcode.setText(bike.getBarcode()+"");
        type.setText(bike.getType());
        license.setText(bike.getLicensePlate());
        battery.setText(bike.getBattery());
        if(bike.getType().equals("electric")){
            licenseHolder.setVisible(true);
            batteryHolder.setVisible(true);
        }
        else{
            licenseHolder.setVisible(false);
            batteryHolder.setVisible(false);
        }
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource( "TimePanel.fxml"));
            
            Node timer = fxmlLoader.load();
            controller = fxmlLoader.getController();
            timePanel.getChildren().add(timer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}