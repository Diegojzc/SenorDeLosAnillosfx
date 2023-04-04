package com.tokioSchool.senorDeLosAnillos;

import com.tokioSchool.senorDeLosAnillos.Heroes.Heroe;
import com.tokioSchool.senorDeLosAnillos.components.*;
import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;

public class AppView {

    public BorderPane borderPane;
    public VboxDatos vboxDatos;
    public TableHBox tableHBox;
    public VboxTexto vboxTexto;



    public AppView(Stage stage) {
        iniciarComponentes();

        Scene scene = new Scene(borderPane, 850, 700);

        stage.setScene(scene);
        stage.setTitle("Batalla Señor de los anillos");
        stage.show();
    }

    public void iniciarComponentes() {

        vboxTexto = new VboxTexto();
        tableHBox = new TableHBox();
        vboxDatos= new VboxDatos();
        borderPane= new BorderPane();

        borderPane.setTop(vboxDatos);
        borderPane.setCenter(tableHBox);
        borderPane.setBottom(vboxTexto);
        //borderPane.setBackground(new Background(new BackgroundFill(Color.TURQUOISE,new CornerRadii(0), Insets.EMPTY)));
    }

}
