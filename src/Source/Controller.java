package Source;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controller {

    public Button startButton;
    public Button tutorialButton;
    public Button scoreButton;
    public Button exitButton;

    public void pressStart() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Game.fxml")));
        Stage window = (Stage) startButton.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 700));
    }

    public void pressTutorial() {
    }

    public void pressScore() {
    }

    public void pressExit() {
        System.exit(0);
    }

}
