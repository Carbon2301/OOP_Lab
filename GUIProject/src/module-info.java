module GUIProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    opens hust.soict.hedspi.javafx to javafx.fxml; // Mở package này cho JavaFX
    exports hust.soict.hedspi.javafx;

}