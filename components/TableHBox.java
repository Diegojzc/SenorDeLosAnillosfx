package com.tokioSchool.senorDeLosAnillos.components;

import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class TableHBox extends HBox {
    public TableViewHeroes tablaHeroes;
    public TableViewBestias tablaBestias;


    public TableHBox(){
        super();
        iniciarComponentes();

        setAlignment(Pos.CENTER);
        setSpacing(100);
        setPadding(new Insets(10));


    }
    public void iniciarComponentes(){
        tablaHeroes = new TableViewHeroes();
        tablaBestias = new TableViewBestias();


        getChildren().addAll(tablaHeroes, tablaBestias);
    }

}
