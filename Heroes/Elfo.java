package com.tokioSchool.senorDeLosAnillos.Heroes;

import com.tokioSchool.senorDeLosAnillos.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.Personaje;

public class Elfo extends Heroe{
    public Elfo(String nombre,String tipo, int puntosVida, int armadura) {
        super(nombre,tipo, puntosVida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {

        int extraAtaque = 0;

        if (personaje instanceof Orco){
            extraAtaque = 10;

        }
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);

        return Math.max(dado1,dado2) + extraAtaque;

    }

    @Override
    public String toString() {
        return "Elfo{" +
                 nombre +
                '}';
    }
}
