module app {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.desktop;

    exports jalauni.softdev.controller;
    opens jalauni.softdev.controller to javafx.fxml;
    exports jalauni.softdev;
    opens jalauni.softdev to javafx.fxml;
}