package com.tokioSchool.senorDeLosAnillos.Heroes;

public class Humano extends Heroe{
    public Humano(String nombre,String tipo, int puntosVida, int armadura) {
        super(nombre,tipo, puntosVida, armadura);
    }

    @Override
    public String toString() {
        return "Humano{" +
                 nombre +
                '}';
    }
}
