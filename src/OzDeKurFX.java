import java.io.IOException;
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

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            Scene scene1 = new Scene(root);
            primaryStage.setScene(scene1);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
