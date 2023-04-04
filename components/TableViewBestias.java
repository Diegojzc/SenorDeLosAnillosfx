package com.tokioSchool.senorDeLosAnillos.components;
import com.tokioSchool.senorDeLosAnillos.Bestias.Bestia;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class TableViewBestias extends TableView<Bestia> {

    public ObservableList<Bestia> tableView;

    public TableViewBestias(){
        super();
        iniciarComponentes();
        setPrefSize(400,300);
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

    }
    public void iniciarComponentes(){


        TableColumn<Bestia, String> nombre= new TableColumn<>("Bestias");
        TableColumn<Bestia,String> tipo = new TableColumn<>("Tipo");
        TableColumn<Bestia, Integer> vida = new TableColumn<>("Vida");
        TableColumn<Bestia,Integer> armadura = new TableColumn<>("Armadura");
        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        vida.setCellValueFactory(new PropertyValueFactory<>("puntosVida"));
        armadura.setCellValueFactory(new PropertyValueFactory<>("armadura"));


        getColumns().add(nombre);
        getColumns().add(tipo);
        getColumns().add(vida);
        getColumns().add(armadura);
        tableView = FXCollections.observableArrayList();
        setItems(tableView);

    }
}
