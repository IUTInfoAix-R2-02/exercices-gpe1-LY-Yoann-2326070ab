package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IHMPendu extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {


        VBox root = new VBox();
        HBox lettres = new HBox();

        Dico dico = new Dico();
        String motActuel = dico.getMot();
        char[] discover = new char[motActuel.length()];
        Text motText = new Text(new String (discover));


        root.getChildren().addAll(motText, lettres);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        // A completer

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
