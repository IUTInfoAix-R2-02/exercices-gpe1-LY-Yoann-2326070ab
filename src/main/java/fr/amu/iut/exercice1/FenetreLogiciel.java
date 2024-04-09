package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1
        VBox vbox = new VBox();
        HBox menu = new HBox();
        HBox left = new HBox();
        HBox bottom = new HBox();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        BorderPane root = new BorderPane();
        Label b0 = new Label("Bouton :");
        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");





        Label name = new Label("Name:");
        TextField text1 = new TextField();
        text1.setMaxWidth(260);
        Label email = new Label("Email:");
        TextField text2 = new TextField();
        text2.setMaxWidth(260);
        Label Password = new Label("Password:");
        TextField text3 = new TextField();
        text3.setMaxWidth(260);


        Label text = new Label("label");

        left.getChildren().addAll(b0, b1, b2, b3);
        menu.getChildren().addAll(menuBar);
        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item7 = new MenuItem("Close");
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        menu1.getItems().addAll(item1, separator1, item2, separator1, item3,separator1, item7);
        MenuItem item4 = new MenuItem("Cut");
        MenuItem item5 = new MenuItem("Copy");
        MenuItem item6 = new MenuItem("Paste");
        menu2.getItems().addAll(item4, separator1, item5, separator1, item6);


        bottom.getChildren().addAll(text);


        GridPane gridpane = new GridPane();
        GridPane.setRowIndex(name, 0);
        GridPane.setColumnIndex(name, 0);
        GridPane.setRowIndex(email, 1);
        GridPane.setColumnIndex(email, 0);
        GridPane.setRowIndex(Password, 2);
        GridPane.setColumnIndex(Password, 0);


        Separator separator = new Separator(Orientation.VERTICAL);
        vbox.getChildren().addAll(menu, left,separator, gridpane, text);






        Scene sc = new Scene(vbox);
        primaryStage.setScene(sc);
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

