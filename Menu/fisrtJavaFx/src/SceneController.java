import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SceneController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private BorderPane bp;

    @FXML
    private Button home;

    @FXML
    private Button ingresar;

    @FXML
    private AnchorPane ap;

    @FXML
    void ingresarSection(MouseEvent event) {
        loadPage("page1");
    }

    public void loadPage(String page) {
        try {
            Parent root =  FXMLLoader.load(getClass().getResource("page1.fxml"));
            bp.setCenter(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
