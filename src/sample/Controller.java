package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    Button readButton;

    @FXML
    Button writeButton;

    public void readFile() {
        Readme x = new Readme();

        textArea.setText(x.readme());
    }
}
