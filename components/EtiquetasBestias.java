package com.tokioSchool.senorDeLosAnillos.components;

import com.tokioSchool.senorDeLosAnillos.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.Bestias.Trasgo;
import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class EtiquetasBestias extends GridPane {
    public Label nombre,tipo,vida,armadura,title;
    public TextField nombretexfield,vidaTexfield,armaduraTexfield;
    public ComboBox<String>comboBox;
    public Button boton;

    public EtiquetasBestias(){
        super();
        iniciarComponentes();
        setPadding(new Insets(20));

    }
    public void iniciarComponentes() {
        title = new Label("BESTIAS");
        title.setFont(new Font(20));
        title.setGraphic(Imagenes.getImagen("orco"));
        nombre = new Label("Nombre:");
        nombre.setFont(new Font(16));
        nombre.setPadding(new Insets(8));
        nombretexfield = new TextField();
        tipo = new Label("Tipo:");
        tipo.setFont(new Font(16));
        tipo.setPadding(new Insets(8));

        comboBox = new ComboBox<>();
        ObservableList<String> lista = comboBox.getItems();
        lista.add(Orco.class.getSimpleName());
        lista.add(Trasgo.class.getSimpleName());

        vida = new Label("Vida:");
        vida.setFont(new Font(16));
        vida.setPadding(new Insets(8));
        vidaTexfield = new TextField();
        armadura = new Label("Armadura:");
        armadura.setFont(new Font(16));
        armadura.setPadding(new Insets(8));
        armaduraTexfield = new TextField();

        boton= new Button("Añadir");
        boton.setUserData("anadirbestia");
        boton.setMaxWidth(90);
        boton.setPrefHeight(30);

        setConstraints(title, 1,0);
        setConstraints(nombre, 0, 1);
        setConstraints(nombretexfield, 1,1);
        setConstraints(tipo,0,2);
        setConstraints(comboBox,1,2);
        setConstraints(vida,0,3);
        setConstraints(vidaTexfield,1,3);
        setConstraints(armadura,0,4);
        setConstraints(armaduraTexfield,1,4);
        setConstraints(boton, 1,6);


        getChildren().addAll(title,nombre,nombretexfield,tipo, comboBox,vida,vidaTexfield,armadura,armaduraTexfield, boton);

    }
}
