import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Image image = new Image("image/icon (1).png");


        Parent parent = FXMLLoader.load(getClass().getResource("view/HomePage.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Home Page");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
