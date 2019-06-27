package main.java;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class LaplaceInvCalc {
    public static void initialize(Group root) {
        root.getChildren().clear();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
//        grid.setGridLinesVisible(true);
        Label goback = new Label(" Go To Laplace Transform");
        goback.setFont(Font.font("Calibri", FontWeight.THIN,
                FontPosture.ITALIC, 16));
        goback.setPadding(new Insets(10));
        goback.setStyle("-fx-text-fill: white;-fx-background-color:crimson;" +
                "-fx-background-radius: 5%");
        VBox vBox = new VBox(goback, grid);
        root.getChildren().add(vBox);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);


        goback.setOnMouseClicked(event -> LaplaceCalc.initialize(root));
    }
}
