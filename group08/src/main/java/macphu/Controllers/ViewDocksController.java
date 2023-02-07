package macphu.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import macphu.App;
import macphu.Data.DockData;
import macphu.Data.DockSelection;
import macphu.Models.DockModel;

public class ViewDocksController implements Initializable{
    
    @FXML
    private void switchToViewBikes() throws IOException {
        if(dockTb.getSelectionModel().getSelectedItem() == null) return;
        DockSelection.getDockNumber(dockTb.getSelectionModel().getSelectedItem().getDockId());
        App.setRoot("ViewBikesPage");
    }
    
    @FXML
    private TableView<DockModel> dockTb;

    @FXML
    private RadioButton byAddress;

    @FXML
    private RadioButton byName;

    @FXML
    private TableColumn<DockModel, String> dockAddress;

    @FXML
    private TableColumn<DockModel, Integer> dockAvailable;

    @FXML
    private TableColumn<DockModel, Integer> dockCapacity;

    @FXML
    private TableColumn<DockModel, Integer> dockId;

    @FXML
    private TableColumn<DockModel, String> dockName;

    @FXML
    private TextField finderBox;
    
    @FXML
    void searchDock(ActionEvent event) {
        if(byName.isSelected()){
            DockData data = new DockData();
            dockId.setCellValueFactory(new PropertyValueFactory<>("DockId"));
            dockName.setCellValueFactory(new PropertyValueFactory<>("DockName"));
            dockAddress.setCellValueFactory(new PropertyValueFactory<>("DockAddress"));
            dockCapacity.setCellValueFactory(new PropertyValueFactory<>("DockCapacity"));
            dockAvailable.setCellValueFactory(new PropertyValueFactory<>("DockAvailable"));
            dockTb.setItems(data.getDockByName(finderBox.getText()));
        }
        if(byAddress.isSelected()){
            DockData data = new DockData();
            dockId.setCellValueFactory(new PropertyValueFactory<>("DockId"));
            dockName.setCellValueFactory(new PropertyValueFactory<>("DockName"));
            dockAddress.setCellValueFactory(new PropertyValueFactory<>("DockAddress"));
            dockCapacity.setCellValueFactory(new PropertyValueFactory<>("DockCapacity"));
            dockAvailable.setCellValueFactory(new PropertyValueFactory<>("DockAvailable"));
            dockTb.setItems(data.getDockByAddress(finderBox.getText()));
        }
        
    }

    @FXML
    private ToggleGroup nameOrAddress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DockData data = new DockData();
        dockId.setCellValueFactory(new PropertyValueFactory<>("DockId"));
        dockName.setCellValueFactory(new PropertyValueFactory<>("DockName"));
        dockAddress.setCellValueFactory(new PropertyValueFactory<>("DockAddress"));
        dockCapacity.setCellValueFactory(new PropertyValueFactory<>("DockCapacity"));
        dockAvailable.setCellValueFactory(new PropertyValueFactory<>("DockAvailable"));
        dockTb.setItems(data.getDockData());
    }

   
}
