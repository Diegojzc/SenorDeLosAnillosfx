package com.tokioSchool.senorDeLosAnillos.Heroes;

import com.tokioSchool.senorDeLosAnillos.Bestias.Orco;
import com.tokioSchool.senorDeLosAnillos.Personaje;

import java.util.Random;

public class Heroe extends Personaje {

    protected Random dado;

    public Heroe(String nombre,String tipo, int puntosVida, int armadura) {
        super(nombre,tipo, puntosVida, armadura);

        dado = new Random();
    }

    @Override
    public int atacar(Personaje enemigo) {
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);
        return Math.max(dado1, dado2);

    }

  /*  @Override
    public int defender(Personaje enemigo) {

        int armaduraBase = this.getArmadura();
        int armaduraReducida;
        int total = 0;
        if (enemigo instanceof Orco) {
            armaduraReducida = armaduraBase * 10 / 100;
            total = armaduraBase - armaduraReducida;
            return total;
        }
        return total;
    }*/

    @Override
    public String toString() {
        return
                 nombre.getValue() +'['+
                "puntosVida=" + puntosVida.getValue()+
                ", armadura=" + armadura.getValue() +
                ']';
    }
}
