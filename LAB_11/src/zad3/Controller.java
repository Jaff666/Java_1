package zad3;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private ComboBox<String> vat;
    @FXML
    private Spinner<Integer> size;
    @FXML
    private ComboBox<String> scale;
    @FXML
    private TextField brutto;
    @FXML
    private Label netto;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        size.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        vat.getItems().addAll("0%", "23%");
        vat.getSelectionModel().select("0%");
        scale.getItems().addAll("18%","19%","32%");
        scale.getSelectionModel().select("0%");
    }
    public void calculateNet(Event actionEvent) {
        DecimalFormat dec = new DecimalFormat("#.00");
        double price = Double.parseDouble(brutto.getText());
        double VATRateValue = Double.parseDouble(removeChar(vat.getValue()));
        double taxScaleValue = Double.parseDouble(removeChar(scale.getValue()));
        double result = (price/(1+VATRateValue/100)) * (1-taxScaleValue/100) * size.getValue();
        netto.setText(dec.format(result) + " zł");
    }
    private String removeChar(String s) {
        return s.substring(0, s.length() - 1);
    }
}



