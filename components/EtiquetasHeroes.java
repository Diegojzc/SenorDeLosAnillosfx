package com.tokioSchool.senorDeLosAnillos.components;
import com.tokioSchool.senorDeLosAnillos.Heroes.Elfo;
import com.tokioSchool.senorDeLosAnillos.Heroes.Hobbit;
import com.tokioSchool.senorDeLosAnillos.Heroes.Humano;
import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class EtiquetasHeroes extends GridPane {
    public Label nombre, tipo, vida, armadura, title;
    public TextField nombretexfield, vidaTexfield, armaduraTexfield;
    public ComboBox<String>comboBox;
    public Button boton;

    public EtiquetasHeroes() {
        super();
        iniciarComponentes();
        setPadding(new Insets(20));

    }

    public void iniciarComponentes() {

        title = new Label("HEROES");
        title.setFont(new Font(20));
        title.setGraphic(Imagenes.getImagen("frodo-64"));

        nombre = new Label("Nombre:");
        nombre.setPadding(new Insets(8));
        nombre.setFont(new Font(16));
        nombretexfield = new TextField();
        tipo = new Label("Tipo:");
        tipo.setFont(new Font(16));
        tipo.setPadding(new Insets(8));

        comboBox = new ComboBox<>();
        ObservableList<String> lista = comboBox.getItems();
        lista.add(Elfo.class.getSimpleName());
        lista.add(Hobbit.class.getSimpleName());
        lista.add(Humano.class.getSimpleName());

        vida = new Label("Vida:");
        vida.setFont(new Font(16));
        vida.setPadding(new Insets(8));
        vidaTexfield = new TextField();
        armadura = new Label("Armadura:");
        armadura.setFont(new Font(16));
        armadura.setPadding(new Insets(8));
        armaduraTexfield = new TextField();

        boton = new Button("Añadir");
        boton.setUserData("anadirheroe");
        boton.setMaxWidth(90);
        boton.setPrefHeight(30);

        setConstraints(title, 1, 0);
        setConstraints(nombre, 0, 1);
        setConstraints(nombretexfield, 1, 1);
        setConstraints(tipo, 0, 2);
        setConstraints(comboBox, 1, 2);
        setConstraints(vida, 0, 3);
        setConstraints(vidaTexfield, 1, 3);
        setConstraints(armadura, 0, 4);
        setConstraints(armaduraTexfield, 1, 4);
        setConstraints(boton, 1, 6);

        getChildren().addAll(title, nombre, nombretexfield, tipo, comboBox, vida, vidaTexfield, armadura, armaduraTexfield, boton);


    }


}
