package macphu.Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import macphu.App;

public class EndPageController {

    @FXML
    void latterBtnPress(ActionEvent event) throws IOException {
        App.close();
    }

    @FXML
    void rateBtnPress(ActionEvent event) {

    }

}
