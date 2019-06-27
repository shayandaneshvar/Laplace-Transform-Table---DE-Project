package main.java;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class LaplaceCalc {
    public static void initialize(Group root) {
        root.getChildren().clear();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
//        grid.setGridLinesVisible(true);
        Label goback = new Label(" Go To Inverse Laplace Transform");
        goback.setFont(Font.font("Calibri", FontWeight.THIN,
                FontPosture.ITALIC, 16));
        goback.setPadding(new Insets(10));
        goback.setStyle("-fx-text-fill: white;-fx-background-color:blue;" +
                "-fx-background-radius: 5%");
        VBox vBox = new VBox(goback, grid);
        root.getChildren().add(vBox);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        Label f = labelMaker("f(t)");
        Label F = labelMaker("F(s)");
        Label a = labelMaker("a");
        Label b = labelMaker("b");
        Label x = labelMaker("x");
        Label y = labelMaker("y");
        grid.add(f, 0, 0);
        grid.add(a, 1, 0);
        grid.add(b, 2, 0);
        grid.add(F, 3, 0);
        grid.add(x, 4, 0);
        grid.add(y, 5, 0);

        grid.add(new ImageView(new Image("main/resources/et.jpg")), 0, 1);
        grid.add(new ImageView(new Image("main/resources/etA.jpg")), 3, 1);
        TextField eta = new TextField();
        TextField etb = new TextField();
        grid.add(eta, 1, 1);
        grid.add(etb, 2, 1);
        Label etAx = labelMaker("");
        Label etAy = labelMaker("");
        grid.add(etAx, 4, 1);
        grid.add(etAy, 5, 1);

        grid.add(new ImageView(new Image("main/resources/esin.jpg")), 0, 2);
        grid.add(new ImageView(new Image("main/resources/esinA.jpg")), 3, 2);
        TextField esina = new TextField();
        TextField esinb = new TextField();
        grid.add(esina, 1, 2);
        grid.add(esinb, 2, 2);
        Label esinAx = labelMaker("");
        Label esinAy = labelMaker("");
        grid.add(esinAx, 4, 2);
        grid.add(esinAy, 5, 2);

        grid.add(new ImageView(new Image("main/resources/ecos.jpg")), 0, 3);
        grid.add(new ImageView(new Image("main/resources/ecosA.png")), 3, 3);
        TextField ecosa = new TextField();
        TextField ecosb = new TextField();
        grid.add(ecosa, 1, 3);
        grid.add(ecosb, 2, 3);
        Label ecosAx = labelMaker("");
        Label ecosAy = labelMaker("");
        grid.add(ecosAx, 4, 3);
        grid.add(ecosAy, 5, 3);

        grid.add(new ImageView(new Image("main/resources/esinh.jpg")), 0, 4);
        grid.add(new ImageView(new Image("main/resources/esinhA.jpg")), 3, 4);
        TextField esinha = new TextField();
        TextField esinhb = new TextField();
        grid.add(esinha, 1, 4);
        grid.add(esinhb, 2, 4);
        Label esinhAx = labelMaker("");
        Label esinhAy = labelMaker("");
        grid.add(esinhAx, 4, 4);
        grid.add(esinhAy, 5, 4);

        grid.add(new ImageView(new Image("main/resources/ecosh.jpg")), 0, 5);
        grid.add(new ImageView(new Image("main/resources/ecoshA.jpg")), 3, 5);
        TextField ecosha = new TextField();
        TextField ecoshb = new TextField();
        grid.add(ecosha, 1, 5);
        grid.add(ecoshb, 2, 5);
        Label ecoshAx = labelMaker("");
        Label ecoshAy = labelMaker("");
        grid.add(ecoshAx, 4, 5);
        grid.add(ecoshAy, 5, 5);

        grid.add(new ImageView(new Image("main/resources/uf.jpg")), 0, 6);
        grid.add(new ImageView(new Image("main/resources/ufA.jpg")), 3, 6);
        TextField ufa = new TextField();
        grid.add(ufa, 1, 6);
        Label ufAy = labelMaker("");
        grid.add(ufAy, 5, 6);

        grid.add(new ImageView(new Image("main/resources/df.jpg")), 0, 7);
        grid.add(new ImageView(new Image("main/resources/dfA.jpg")), 3, 7);
        TextField dfa = new TextField();
        grid.add(dfa, 1, 7);
        Label dfAy = labelMaker("");
        grid.add(dfAy, 5, 7);
        root.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                if (eta.getText().trim().matches("[0-9]+") && eta.getText
                        ().trim().length() > 0 && etb.getText().trim().matches(
                        "[0-9]+") && etb.getText().trim().length() > 0) {
                    answer(eta.getText().trim(), etb.getText().trim(), etAy, etAx);
                }
                if (esina.getText().trim().matches("[0-9]+") && esina.getText
                        ().trim().length() > 0 && esinb.getText().trim().matches(
                        "[0-9]+") && esinb.getText().trim().length() > 0) {
                    answer(esina.getText().trim(), esinb.getText().trim(),
                            esinAy, esinAx);
                }
                if (ecosa.getText().trim().matches("[0-9]+") && ecosa.getText
                        ().trim().length() > 0 && ecosb.getText().trim().matches(
                        "[0-9]+") && ecosb.getText().trim().length() > 0) {
                    answer(ecosa.getText().trim(), ecosb.getText().trim(),
                            ecosAy, ecosAx);
                }
                if (esinha.getText().trim().matches("[0-9]+") && esinha.getText
                        ().trim().length() > 0 && esinhb.getText().trim().matches(
                        "[0-9]+") && esinhb.getText().trim().length() > 0) {
                    answer(esinha.getText().trim(), esinhb.getText().trim(),
                            esinhAy, esinhAx);
                }
                if (ecosha.getText().trim().matches("[0-9]+") && ecosha.getText
                        ().trim().length() > 0 && ecoshb.getText().trim().matches(
                        "[0-9]+") && ecoshb.getText().trim().length() > 0) {
                    answer(ecosha.getText().trim(), ecoshb.getText().trim(),
                            ecoshAy, ecoshAx);
                }
                if (ufa.getText().trim().matches("[0-9]+") && ufa.getText
                        ().trim().length() > 0) {
                    ufAy.setText(ufa.getText().trim());
                }
                if (dfa.getText().trim().matches("[0-9]+") && dfa.getText
                        ().trim().length() > 0) {
                    dfAy.setText(dfa.getText().trim());
                }
            }
        });
        goback.setOnMouseClicked(event -> LaplaceInvCalc.initialize(root));
        GridPane.setHalignment(f, HPos.CENTER);
        GridPane.setHalignment(F, HPos.CENTER);
        GridPane.setHalignment(a, HPos.CENTER);
        GridPane.setHalignment(b, HPos.CENTER);
        GridPane.setHalignment(x, HPos.CENTER);
        GridPane.setHalignment(y, HPos.CENTER);
    }

    private static void answer(String a, String b, Label etAx, Label etAy) {
        etAx.setText(b);
        etAy.setText(a);
    }

    private static Label labelMaker(String text) {
        Label label = new Label(text);
        label.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(10));
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 34));
        return label;
    }
}
