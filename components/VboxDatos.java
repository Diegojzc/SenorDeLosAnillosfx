package com.tokioSchool.senorDeLosAnillos.components;

import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class VboxDatos extends HBox {

    public EtiquetasHeroes etiquetasHeroes;
    public EtiquetasBestias etiquetasBestias;
    public Label label;

    public VboxDatos() {
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        etiquetasHeroes = new EtiquetasHeroes();
        etiquetasBestias = new EtiquetasBestias();
        label = new Label();
        label.setGraphic(Imagenes.getImagen("senor1"));

        getChildren().addAll(etiquetasHeroes, etiquetasBestias, label);


    }
}
