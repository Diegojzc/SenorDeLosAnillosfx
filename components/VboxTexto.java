package com.tokioSchool.senorDeLosAnillos.components;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class VboxTexto  extends VBox {
    public Consola consola;
    public Button boton;

    public VboxTexto(){
        iniciarComponentes();
        setPadding(new Insets(10,50,10,50));
        setSpacing(15);
        setAlignment(Pos.CENTER);


    }
    public void iniciarComponentes(){
        consola = new Consola();

        boton = new Button("Lucha!");
        boton.setUserData("lucha");
        boton.setMaxWidth(100);


        getChildren().add(boton);
        getChildren().add(consola);
        VBox.setMargin(boton, new Insets(5,5,5,5));
    }
}
