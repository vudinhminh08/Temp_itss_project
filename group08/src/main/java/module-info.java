module macphu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.sql;

    opens macphu to javafx.fxml;
    opens macphu.Models to javafx.base;
    opens macphu.Controllers to javafx.fxml;
    opens macphu.Utils to java.sql;

    exports macphu;
    exports macphu.Controllers;
}
