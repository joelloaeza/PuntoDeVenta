package controlador;

import modelo.Usuario;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class AccesoController {

    @FXML
    private Label etiqueta;

    @FXML
    private JFXTextField cajaUsuario;

    @FXML
    private JFXPasswordField cajaContrasena;

    @FXML
    private JFXButton botonEntrar;

    @FXML
    void entrar(ActionEvent event) throws SQLException {
        Connection conexion = DriverManager.getConnection("jdbc:sqlite:pdv3dv22.db");
        Statement statement = conexion.createStatement();
        statement.setQueryTimeout(10);
        
        String sql = "SELECT * FROM Usuario WHERE "
                     + "nombreUsuario= '" + cajaUsuario.getText() + "' AND "
                     + "contrasena= '" + cajaContrasena.getText() + "'";
        
        ResultSet resultSet = statement.executeQuery(sql);
        ObservableList<Usuario> listaUsuario = FXCollections.observableArrayList();
        
        while(resultSet.next()){
            listaUsuario.add(new Usuario(
                    resultSet.getString("tipoUsuario"),
                    resultSet.getString("nombreUsuario"),
                    resultSet.getString("contrasena")
            ));
        }
        
        if(listaUsuario.size() > 0){
            System.out.println("Bienvenido " + listaUsuario.get(0).nombreUsuario + " : " + listaUsuario.get(0).tipoUsuario);
        }
        else{
            System.out.println("Acceso denegado");
        }
    }

}
