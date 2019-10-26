import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel Loaeza Valerio
 */
public class Main extends Application {
    public static void main(String [] args){
        launch(args);
    }
    
    @Override
    public void start(Stage escenario) throws IOException{
        Parent diseno = FXMLLoader.load(getClass().getResource("vista/Acceso.fxml"));
        Scene escena = new Scene(diseno);
        
        escenario.setScene(escena);
        escenario.show();
    }
}
