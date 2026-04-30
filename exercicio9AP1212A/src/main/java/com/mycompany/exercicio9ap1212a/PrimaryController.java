package com.mycompany.exercicio9ap1212a;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void trocarCena() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void trocarCena3() throws IOException {
        App.setRoot("encontro");
    }
    
    @FXML
    private void trocarCena4() throws IOException {
        App.setRoot("final");
    }
    
    @FXML
    private void novaJanela() throws IOException {
        Stage novoStage = new Stage();
        novoStage.setTitle("Rádio Ligado");
  
        Parent root = FXMLLoader.load(getClass().getResource("radioJanela.fxml"));
        
        novoStage.setScene(new Scene(root));
        
        novoStage.show();
    }
        
}
