package macphu.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import macphu.App;
import macphu.Data.BikeData;
import macphu.Data.BikeSelection;
import macphu.Models.BikeModel;

public class ViewBikesController implements Initializable {

    @FXML
    private void switchToBikeDetail() throws IOException {
        BikeModel selectedItem = bikeTb.getSelectionModel().getSelectedItem();
        if(selectedItem == null){
            return;
        }
        if (selectedItem.getStatus().equals("in use")){
            return;
        }
        BikeSelection.getBikeInfor(selectedItem);
        App.setRoot("BikeDetail");
    }

    @FXML
    private void switchToViewDocks() throws IOException {
        App.setRoot("ViewDocksPage");
    }
    @FXML
    private TableView<BikeModel> bikeTb;

    @FXML
    private TableColumn<BikeModel, String> bikeDescription;

    @FXML
    private TableColumn<BikeModel, Integer> bikeId;

    @FXML
    private TableColumn<BikeModel, String> bikeStatus;

    @FXML
    private TableColumn<BikeModel, String> bikeType;

    @FXML
    private TableColumn<BikeModel, String> bikeBattery;

    @FXML
    private TextField finderBox;

    @FXML
    void confirmSearch(ActionEvent event) {
        BikeData data = new BikeData();
        bikeId.setCellValueFactory(new PropertyValueFactory<>("Barcode"));
        bikeType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        bikeDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        bikeStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
        bikeBattery.setCellValueFactory(new PropertyValueFactory<>("Battery"));
        
        bikeTb.setItems(data.getByBarcode(finderBox.getText()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        BikeData data = new BikeData();
        bikeId.setCellValueFactory(new PropertyValueFactory<>("Barcode"));
        bikeType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        bikeDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        bikeStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
        bikeBattery.setCellValueFactory(new PropertyValueFactory<>("Battery"));
        
        bikeTb.setItems(data.getBikeData());
    }

}
