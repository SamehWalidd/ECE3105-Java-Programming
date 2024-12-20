package com.example.q1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox v = new VBox();

        HBox h1 = new HBox();
        h1.setSpacing(15);
        /////////////////////////////////
        Text t1 = new Text("Number 1");
        TextField tf1 = new TextField();
        HBox n1 = new HBox();
        n1.setSpacing(5);
        n1.getChildren().addAll(t1,tf1);

        Text t2 = new Text("Number 2");
        TextField tf2 = new TextField();
        HBox n2 = new HBox();
        n2.setSpacing(5);
        n2.getChildren().addAll(t2,tf2);

        Text r = new Text("Result");
        TextField rf = new TextField();
        HBox result = new HBox();
        result.setSpacing(5);
        result.getChildren().addAll(r,rf);
        //////////////////////////////////////
        h1.getChildren().addAll(n1,n2,result);


        HBox buttons = new HBox();
        buttons.setSpacing(5);
        ////////////////////////////////
        Button add = new Button("Add");
        add.setOnAction(e ->{
            double no1 = Integer.parseInt(tf1.getText());
            double no2 = Integer.parseInt(tf2.getText());
            rf.setText(String.valueOf(no1+no2));
        });

        Button sub = new Button("Sub");
        sub.setOnAction(e ->{
            double no1 = Integer.parseInt(tf1.getText());
            double no2 = Integer.parseInt(tf2.getText());
            rf.setText(String.valueOf(no1-no2));
        });

        Button multi = new Button("multiply");
        multi.setOnAction(e ->{
            double no1 = Integer.parseInt(tf1.getText());
            double no2 = Integer.parseInt(tf2.getText());
            rf.setText(String.valueOf(no1*no2));
        });

        Button division = new Button("Divide");
        division.setOnAction(e ->{
            double no1 = Integer.parseInt(tf1.getText());
            double no2 = Integer.parseInt(tf2.getText());
            rf.setText(String.valueOf(no1/no2));
        });
        ////////////////////////////////
        buttons.getChildren().addAll(add,sub,multi,division);

        v.getChildren().addAll(h1,buttons);
        v.setAlignment(Pos.CENTER);
        Scene scene = new Scene(v, 500, 100);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}