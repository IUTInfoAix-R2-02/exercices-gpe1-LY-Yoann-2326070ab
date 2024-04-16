package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;


    private HBox bas;


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        HBox bas = new HBox();
        Label label = new Label("");


        Pane panneau = new Pane();


        Button vert = new Button("vert");
        Button bleu = new Button("bleu");
        Button rouge = new Button("rouge");
        bas.getChildren().addAll(vert, rouge, bleu);
        bas.setSpacing(5.0);
        bas.setAlignment(Pos.CENTER);



        root.setTop(label);
        root.setCenter(panneau);
        root.setBottom(bas);

        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickHandlerBleu(label, panneau));
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickHandlerRouge(label, panneau));
        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickHandlerVert(label, panneau));


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);
    }

    public class ButtonClickHandlerBleu implements EventHandler<Event> {
        private Label label;
        private Pane panneau;



        public ButtonClickHandlerBleu(Label label, Pane panneau) {
            this.label = label;
            this.panneau = panneau;


        }

        @Override
        public void handle(Event event) {
            // Utiliser le Label récupéré
            label.setText("bleu choisi");

            panneau.setStyle("-fx-background-color: lightblue;");

        }

    }

    public class ButtonClickHandlerRouge implements EventHandler<Event> {
        private Label label;
        private Pane panneau;



        public ButtonClickHandlerRouge(Label label, Pane panneau) {
            this.label = label;
            this.panneau = panneau;


        }

        @Override
        public void handle(Event event) {
            // Utiliser le Label récupéré
            label.setText("Rouge choisi");

            panneau.setStyle("-fx-background-color: #f54d4d;");

        }

    }

    public class ButtonClickHandlerVert implements EventHandler<Event> {
        private Label label;
        private Pane panneau;



        public ButtonClickHandlerVert(Label label, Pane panneau) {
            this.label = label;
            this.panneau = panneau;


        }

        @Override
        public void handle(Event event) {
            // Utiliser le Label récupéré
            label.setText("Vert choisi");

            panneau.setStyle("-fx-background-color: #59dc59;");

        }

    }
}

