package macphu.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import macphu.App;
import macphu.Data.BikeSelection;
import macphu.Models.BikeModel;

public class BikeDetailController implements Initializable{
    
    @FXML
    private Text barcode;

    @FXML
    private Text battery;

    @FXML
    private Text description;

    @FXML
    private Text deposit;

    @FXML
    private Button rent_btn;

    @FXML
    private Text status;

    @FXML
    private Text type;

    @FXML
    private Button backBtn;

    @FXML
    void switchBack(ActionEvent event) throws IOException {
        App.setRoot("ViewBikesPage");
    }

    @FXML
    void switchToConfirm(ActionEvent event) throws IOException{
        App.setRoot("ConfirmationPage");
    }

    @FXML
    private Text license;

    @FXML
    private Text licenseHolder;

    @FXML
    private Text batteryHolder;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BikeModel selectedBike = BikeSelection.returnBikeInfor();
        barcode.setText(selectedBike.getBarcode()+"");
        type.setText(selectedBike.getType());
        description.setText(selectedBike.getDescription());
        status.setText(selectedBike.getStatus());
        battery.setText(selectedBike.getBattery());
        license.setText(selectedBike.getLicensePlate());
        if(selectedBike.getType().equals("electric")){
            licenseHolder.setVisible(true);
            batteryHolder.setVisible(true);
        }
        else{
            licenseHolder.setVisible(false);
            batteryHolder.setVisible(false);
        }
        deposit.setText(selectedBike.getDeposit()+"");
    }
}
