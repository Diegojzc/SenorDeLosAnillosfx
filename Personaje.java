package com.tokioSchool.senorDeLosAnillos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Personaje {
    public StringProperty nombre;
    public StringProperty tipo;
    public IntegerProperty puntosVida;
    public IntegerProperty armadura;


    public Personaje(String nombre,String tipo, int puntosVida, int armadura) {
        this.nombre = new SimpleStringProperty(nombre);
        this.tipo = new SimpleStringProperty(tipo);
        this.puntosVida = new SimpleIntegerProperty(puntosVida);
        this.armadura = new SimpleIntegerProperty(armadura);

    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getTipo() {
        return tipo.get();
    }

    public StringProperty tipoProperty() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    public int getPuntosVida() {
        return puntosVida.get();
    }

    public IntegerProperty puntosVidaProperty() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida.set(puntosVida);
    }

    public int getArmadura() {
        return armadura.get();
    }

    public IntegerProperty armaduraProperty() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura.set(armadura);
    }

    public abstract int atacar(Personaje enemigo);

    public int defender(Personaje enemigo){
        return this.getArmadura();
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre=" + nombre +
                ", tipo=" + tipo +
                ", puntosVida=" + puntosVida +
                '}';
    }
}
