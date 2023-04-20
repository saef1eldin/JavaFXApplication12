package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ViewManager {

    private final Stage stage;

    public ViewManager(Stage stage) {
        this.stage = stage;
    }

    public void showLoginPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Currency Conversion Login");
        stage.setScene(scene);
        stage.show();
    }

    public void showCurrencyConversionPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/CurrencyConversion.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Currency Conversion");
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage() {
        stage.close();
    }
}
