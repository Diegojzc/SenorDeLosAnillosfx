package com.tokioSchool.senorDeLosAnillos.Bestias;

import com.tokioSchool.senorDeLosAnillos.Personaje;

import java.util.Random;

public class Bestia extends Personaje {
    protected Random dado;

    public Bestia(String nombre, String tipo, int puntosVida, int armadura) {
        super(nombre,tipo,  puntosVida, armadura);
        dado = new Random();
    }

    @Override
    public int atacar(Personaje enemigo) {

        return dado.nextInt(91);


    }

    @Override
    public String toString() {
        return
                 nombre.getValue() +'['+
                "puntosVida=" + puntosVida.getValue()+
                ", armadura=" + armadura.getValue() +
                ']';
    }
}
