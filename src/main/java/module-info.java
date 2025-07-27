module group8.group8_tib {
    requires javafx.controls;
    requires javafx.fxml;


    opens group8.group8_tib to javafx.fxml;
    exports group8.group8_tib;
}