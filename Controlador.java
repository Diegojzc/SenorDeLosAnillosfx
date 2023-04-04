package com.tokioSchool.senorDeLosAnillos;

import com.tokioSchool.senorDeLosAnillos.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.Heroes.Heroe;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Controlador implements EventHandler<ActionEvent> {

    public AppView appView;
    String nombre;
    String tipo;
    int puntosVida;
    int armadura;
    List<Heroe> heroes;
    List<Bestia> bestias;

    public Controlador(AppView appView) {
        this.appView = appView;
        acciones();
        heroes = new ArrayList<>();
        bestias = new ArrayList<>();

    }

    public void acciones() {
        appView.vboxDatos.etiquetasHeroes.boton.setOnAction(this);
        appView.vboxDatos.etiquetasBestias.boton.setOnAction(this);
        appView.vboxTexto.boton.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        String userData = node.getUserData().toString();
        switch (userData) {
            case "anadirheroe":
                try {
                    nombre = appView.vboxDatos.etiquetasHeroes.nombretexfield.getText();
                    tipo = String.valueOf(appView.vboxDatos.etiquetasHeroes.comboBox.getValue());
                    puntosVida = Integer.parseInt(appView.vboxDatos.etiquetasHeroes.vidaTexfield.getText());
                    armadura = Integer.parseInt(appView.vboxDatos.etiquetasHeroes.armaduraTexfield.getText());

                    Heroe heroe = new Heroe(nombre, tipo, puntosVida, armadura);
                    Heroe heroe1 = new Heroe(nombre, tipo, puntosVida, armadura);
                    appView.tableHBox.tablaHeroes.tableView.add(heroe1);
                    heroes.add(heroe);




                } catch (Exception e) {
                    Alert alerta = new Alert(Alert.AlertType.WARNING,"Datos introducidos no son correctos");
                    alerta.show();
                    break;
                }


                appView.vboxDatos.etiquetasHeroes.nombretexfield.setText("");
                appView.vboxDatos.etiquetasHeroes.vidaTexfield.setText("");
                appView.vboxDatos.etiquetasHeroes.armaduraTexfield.setText("");
                appView.vboxDatos.etiquetasHeroes.comboBox.getEditor().setText("");
                break;

            case "anadirbestia":
                try {
                    nombre = appView.vboxDatos.etiquetasBestias.nombretexfield.getText();
                    tipo = String.valueOf(appView.vboxDatos.etiquetasBestias.comboBox.getValue());
                    puntosVida = Integer.parseInt(appView.vboxDatos.etiquetasBestias.vidaTexfield.getText());
                    armadura = Integer.parseInt(appView.vboxDatos.etiquetasBestias.armaduraTexfield.getText());
                }catch (Exception e){
                    Alert alerta = new Alert(Alert.AlertType.WARNING, "Datos introducidos no son correctos");
                    alerta.show();
                    break;
                }

                Bestia bestia = new Bestia(nombre, tipo, puntosVida, armadura);
                Bestia bestia1 = new Bestia(nombre,tipo,puntosVida,armadura);
                appView.tableHBox.tablaBestias.tableView.add(bestia1);
                bestias.add(bestia);



                appView.vboxDatos.etiquetasBestias.nombretexfield.setText("");
                appView.vboxDatos.etiquetasBestias.vidaTexfield.setText("");
                appView.vboxDatos.etiquetasBestias.armaduraTexfield.setText("");
                appView.vboxDatos.etiquetasBestias.comboBox.getEditor().setText("");

                break;
            case "lucha":

                CampoDeBatalla campoDeBatalla = new CampoDeBatalla();
                try {
                    campoDeBatalla.batalla( heroes , bestias,appView);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


        }


    }

}
