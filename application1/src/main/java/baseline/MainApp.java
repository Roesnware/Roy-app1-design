/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */


// define package
package baseline;

// import libraries
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

// main class
public class MainApp extends Application {

    // start method
    @Override
    public void start(Stage stage) throws Exception {

        // parent root
        Parent root = FXMLLoader.load(getClass().getResource("MainApp.fxml"));

        // scene variable
        Scene scene = new Scene(root);

        // set title and scene then display
        stage.setTitle("MainApp");
        stage.setScene(scene);
        stage.show();
    }

    // main method, just calls launch
    public static void main(String[] args) {
        launch(args);
    }
}

// scene builder controller class
class MainAppController implements Initializable {

    //@FXML
    //declare private variable for labels

    //@Override
    public void initialize(URL url, ResourceBundle rb) {
        // declare java version
        // declare javafx version
        // set label
    }
}
