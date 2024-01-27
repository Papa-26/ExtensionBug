module com.test.extensionfilterbug {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.test.extensionfilterbug to javafx.fxml;
    exports com.test.extensionfilterbug;
}