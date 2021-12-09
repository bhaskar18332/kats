/**
 * Sample Skeleton for 'home.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class homecontroller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="exitbutton"
    private Button exitbutton; // Value injected by FXMLLoader

    @FXML // fx:id="loginbutton"
    private Button loginbutton; // Value injected by FXMLLoader

    @FXML // fx:id="Menu"
    private Button Menu; // Value injected by FXMLLoader

    @FXML
    void exit(ActionEvent event) {
    	System.out.println("Exiting.....");
    	System.exit(0);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert exitbutton != null : "fx:id=\"exitbutton\" was not injected: check your FXML file 'home.fxml'.";
        assert loginbutton != null : "fx:id=\"loginbutton\" was not injected: check your FXML file 'home.fxml'.";
        assert Menu != null : "fx:id=\"Menu\" was not injected: check your FXML file 'home.fxml'.";

    }
}
