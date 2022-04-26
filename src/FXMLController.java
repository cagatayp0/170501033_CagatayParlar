
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ozdekur.Student;

public class FXMLController implements Initializable {

    @FXML
    private TextField InsertStudentVorname;

    @FXML
    private TextField InsertStudentNachname;

    @FXML
    private TextField InsertStudentNumber;

    @FXML
    private Button InsertButton;

    Student s1 = new Student();

    public void InsertButton(ActionEvent event) {
        try {
            s1.setVorname(InsertStudentVorname.getText());
            s1.setNachname(InsertStudentNachname.getText());
            s1.setMatrikelnummer(InsertStudentNumber.getText());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
