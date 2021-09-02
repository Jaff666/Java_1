package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import java.time.LocalDate;
import java.util.Calendar;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        Label label = new Label();
        Button button = new Button("Oblicz");

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        ObservableList list = vBox.getChildren();
        list.addAll(textField,datePicker,button,label);
        button.setOnAction(e ->
                {
                    LocalDate ld = datePicker.getValue();
                    int yearBirth = ld.getYear();
                    int monthBirth = ld.getMonth().getValue();
                    int dayBirth = ld.getDayOfMonth();

                    Calendar cal = Calendar.getInstance();
                    int dayNow = cal.get(Calendar.DAY_OF_MONTH);
                    int monthNow = cal.get(Calendar.MONTH) + 1;
                    int yearNow = cal.get(Calendar.YEAR);

                    int age = yearNow - yearBirth;

                    if (monthBirth>monthNow){
                        age--;
                    }

                    if(monthBirth==monthNow && dayBirth>dayNow){
                        age--;
                    }
                    label.setText(textField.getText() + " ma " + age + " lat");
                }
        );
        Scene scene = new Scene(vBox,400,150);
        stage.setTitle("Oblicz wiek");
        stage.setScene(scene);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
