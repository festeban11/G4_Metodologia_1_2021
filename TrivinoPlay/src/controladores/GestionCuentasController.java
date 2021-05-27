
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import logica.Cuenta;

/**
 * FXML Controller class
 *
 * @author Matias
 */
public class GestionCuentasController implements Initializable {

    @FXML
    private Label labelNombreUsuario;
    @FXML
    private ImageView imagenPerfil;
    @FXML
    private Button botonRetroceso;
    @FXML
    private ImageView imagenRetroceso;
    @FXML
    private Button botonAgregarCuenta;
    @FXML
    private Button botonEditarCuenta;
    @FXML
    private Button botonEliminarCuenta;
    @FXML
    private TableView<Cuenta> tablaCuentas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fueraBotonRetroceso(MouseEvent event) {
        imagenRetroceso.setImage(new Image("file:src/recursos/Imagenes/Iconos/back-arrow.png"));
        
    }

    @FXML
    private void sobreBotonRetroceso(MouseEvent event) {
        imagenRetroceso.setImage(new Image("file:src/recursos/Imagenes/Iconos/back-arrow-orange.png"));
    }

    @FXML
    private void retroceder(ActionEvent event) {
    }

    @FXML
    private void fueraBotonAgregar(MouseEvent event) {
        botonAgregarCuenta.setStyle("-fx-background-color: #ff9100");
    }

    @FXML
    private void sobreBotonAgregar(MouseEvent event) {
        botonAgregarCuenta.setStyle("-fx-background-color: #000000");
    }

    @FXML
    private void agregarCuenta(ActionEvent event) {
    }

    @FXML
    private void fueraBotonEditar(MouseEvent event) {
        botonEditarCuenta.setStyle("-fx-background-color: #ff9100");
    }

    @FXML
    private void sobreBotonEditar(MouseEvent event) {
        botonEditarCuenta.setStyle("-fx-background-color: #000000");
    }

    @FXML
    private void editarCuenta(ActionEvent event) {
    }

    @FXML
    private void fueraBotonEliminar(MouseEvent event) {
        botonEliminarCuenta.setStyle("-fx-background-color: #ff9100");
    }

    @FXML
    private void sobreBotonEliminar(MouseEvent event) {
        botonEliminarCuenta.setStyle("-fx-background-color: #000000");
    }

    @FXML
    private void eliminarCuenta(ActionEvent event) {
    }

    @FXML
    private void seleccion(MouseEvent event) {
    }
    
}
