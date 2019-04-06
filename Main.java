package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();
        Button myButton = new Button();
        TextField myTextField = new TextField();
        Label myLabel = new Label();

        myButton.setText("Press me");

        myButton.setOnAction(event -> myLabel.setText("Hello " + myTextField.getText()));

        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(myTextField, myLabel, myButton);

        root.getChildren().add(vbox);

        root.setAlignment(vbox, Pos.CENTER);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
