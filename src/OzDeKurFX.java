
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class OzDeKurFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InvocationTargetException, IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        } catch (Exception e) {
            e.getCause().printStackTrace();
        }
    }
}
