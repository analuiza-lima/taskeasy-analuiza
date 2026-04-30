package com.mycompany.exercicio9ap1212a;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondaryController {

    @FXML
    private Button fechar;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
     @FXML
    private void trocarCena2() throws IOException {
        App.setRoot("mercado");
    }
    
    @FXML
    private void fechar() throws IOException {
        Stage stage = (Stage)fechar.getScene().getWindow();
        stage.close();
    }
}