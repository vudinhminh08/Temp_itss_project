package macphu.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import macphu.App;
import macphu.Data.BikeSelection;

public class InvoiceController implements Initializable {

    @FXML
    private Text barcode;

    @FXML
    private Text cashBack;

    @FXML
    private Text cost;

    @FXML
    private Text time;

    @FXML
    private Text type;

    @FXML
    void confirmInvoice(ActionEvent event) throws IOException {
        App.setRoot("EndPage");;
    }

    @FXML
    void returnPage(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        barcode.setText(BikeSelection.returnBikeInfor().getBarcode()+"");
        type.setText(BikeSelection.returnBikeInfor().getType()+"");
        
    }
}
