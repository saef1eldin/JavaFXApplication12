package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private TextField userNameTxt;
    @FXML
    private TextField passwordTxt;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginBtn(ActionEvent event) throws IOException {
        if (!userNameTxt.getText().isEmpty() && !passwordTxt.getText().isEmpty()) {
            ViewManager viewManager = new ViewManager(new Stage());
            viewManager.showCurrencyConversionPage();

        }
    }

}

