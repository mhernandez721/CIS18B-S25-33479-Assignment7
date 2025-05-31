package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static Stage stage;

   
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        // Load the first FXML file
        Parent root = FXMLLoader.load(getClass().getResource("/application/EventListView.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Events!");
        primaryStage.show();
    }

    public static void changeScene(String fxml) throws Exception {
        // Load other views by file name
        Parent view = FXMLLoader.load(MainApp.class.getResource(fxml));
        Scene scene = new Scene(view);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
