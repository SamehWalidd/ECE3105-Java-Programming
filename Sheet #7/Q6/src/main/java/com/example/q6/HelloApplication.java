package com.example.q6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        //////////////////////////////////
        TextField IF = new TextField();
        TextField YF = new TextField();
        TextField ARF = new TextField();
        TextField FVF = new TextField();
        FVF.setEditable(false);
        Button calculateButton = new Button("Calculate");

        gridPane.add(new Text("Investment Amount:"), 0, 0);
        gridPane.add(IF, 1, 0);
        gridPane.add(new Text("Years:"), 0, 1);
        gridPane.add(YF, 1, 1);
        gridPane.add(new Text("Annual Interest Rate:"), 0, 2);
        gridPane.add(ARF, 1, 2);
        gridPane.add(new Text("Future Value:"), 0, 3);
        gridPane.add(FVF, 1, 3);
        gridPane.add(calculateButton, 1, 4);
        //////////////////////////////////////////////////


        calculateButton.setOnAction(e -> {
            double i = Double.parseDouble(IF.getText());
            double yrs = Double.parseDouble(YF.getText());
            double annualRate = Double.parseDouble(ARF.getText());
            double monthlyRate = annualRate / 100 / 12;
            double fv = i * Math.pow(1 + monthlyRate, yrs * 12);

            FVF.setText(String.valueOf(fv));
        });
        Scene scene = new Scene(gridPane, 400, 250);
        stage.setTitle("Investment Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}