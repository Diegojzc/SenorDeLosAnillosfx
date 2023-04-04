package com.tokioSchool.senorDeLosAnillos.components;
import com.tokioSchool.senorDeLosAnillos.Heroes.Heroe;
import com.tokioSchool.senorDeLosAnillos.Personaje;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class TableViewHeroes extends TableView<Heroe>{

    public ObservableList<Heroe> tableView;


    public TableViewHeroes(){
        super();
        iniciarComponentes();
        setPrefSize(400,300);
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }
    public void iniciarComponentes(){

        TableColumn<Heroe, String> nombre = new TableColumn<>("Heroe");
        TableColumn<Heroe,String> tipo = new TableColumn<>("Tipo");
        TableColumn<Heroe, Integer> vida = new TableColumn<>("Vida");
        TableColumn<Heroe,Integer> armadura = new TableColumn<>("Armadura");
        nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        vida.setCellValueFactory(new PropertyValueFactory<>("puntosVida"));
        vida.setSortable(false);
        armadura.setCellValueFactory(new PropertyValueFactory<>("armadura"));


        getColumns().add(nombre);
        getColumns().add(tipo);
        getColumns().add(vida);
        getColumns().add(armadura);
        tableView = FXCollections.observableArrayList();
        setItems(tableView);

    }

}
