package com.test.extensionfilterbug;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

public void showText(String[] sArray){
        String sText = sArray[0];
        textField.setText(sText);
}

}