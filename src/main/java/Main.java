package main.java;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        root.getChildren().add(grid);
        Scene scene = new Scene(root, 630, 110);
        Button laplace = new Button("Laplace Transform");
        Button laplaceInverse = new Button("Inverse Laplace Transform");
        laplace.setPadding(new Insets(30));
        laplaceInverse.setPadding(new Insets(30));
        laplace.setFont(Font.font("serif", FontPosture.REGULAR, 26));
        laplaceInverse.setFont(Font.font("serif", FontPosture.REGULAR, 26));
        grid.add(laplace, 0, 0, 1, 1);
        grid.add(laplaceInverse, 1, 0, 1, 1);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Laplace & Inverse Laplace Transform");
        primaryStage.show();
        laplace.setOnMouseClicked(event -> {
            primaryStage.setHeight(760);
            primaryStage.setWidth(940);
            primaryStage.setY(50);
            primaryStage.setX(primaryStage.getX() - 112);
            LaplaceCalc.initialize(root);
        });
        laplaceInverse.setOnMouseClicked(event -> {
            primaryStage.setHeight(760);
            primaryStage.setWidth(940);
            primaryStage.setY(50);
            primaryStage.setX(primaryStage.getX() - 112);
            LaplaceInvCalc.initialize(root);
        });
    }
}
