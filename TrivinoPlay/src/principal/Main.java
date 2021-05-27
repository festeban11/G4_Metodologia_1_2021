package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controladores.VistaAdministracionController;
import javafx.stage.StageStyle;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../vistas/GestionCuentas.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);

            stage.setScene(scene);
            

            //stage.setResizable(false);
            //VistaAdministracionController controlador = loader.getController();
           // controlador.setImagenUsuario();
            stage.show();
        }catch(Exception e){
            System.out.println("Error carga de vista principal");
        };
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
/*
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../vistas/.fxml"));
            System.out.println(Main.class.getResource("file:src/vistas/.fxml"));
            Pane ventana = (Pane) loader.load();
            
            //Mostrar escena principal
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}*/
