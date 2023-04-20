package Controller;

import Model.CurrencyConverter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CurrencyConversionController implements Initializable {

    @FXML
    private TextField usdTxt;
    @FXML
    private TextField NISBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logOutBtn(ActionEvent event) throws IOException {
        ViewManager viewManager = new ViewManager(new Stage());
        viewManager.showLoginPage();

    }

    public TextField getUsdTxt() {
        return usdTxt;
    }

    public void setUsdTxt(TextField usdTxt) {
        this.usdTxt = usdTxt;
    }

    public TextField getNISBtn() {
        return NISBtn;
    }

    public void setNISBtn(TextField NISBtn) {
        this.NISBtn = NISBtn;
    }

    @FXML
    private void convertBtn(ActionEvent event) {
        CurrencyConverter converter = new CurrencyConverter();
        if (!NISBtn.getText().isEmpty()) {
            double nis = Double.parseDouble(NISBtn.getText());
            usdTxt.setText(Double.toString(converter.CurrencyConvertToUSD(nis)));
        } else if (!usdTxt.getText().isEmpty()) {
            double usd = Double.parseDouble(usdTxt.getText());
            NISBtn.setText(Double.toString(converter.CurrencyConvertToNIS(usd)));
        }
    }
}

