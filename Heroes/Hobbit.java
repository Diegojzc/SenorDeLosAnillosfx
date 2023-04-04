package com.tokioSchool.senorDeLosAnillos.Heroes;

import com.tokioSchool.senorDeLosAnillos.Bestias.Trasgo;
import com.tokioSchool.senorDeLosAnillos.Personaje;
import com.tokioSchool.senorDeLosAnillos.util.Imagenes;

public class Hobbit extends Heroe{

    public Hobbit(String nombre,String tipo, int puntosVida, int armadura) {
        super(nombre, tipo,puntosVida, armadura);

    }
    @Override
    public int atacar(Personaje enemigo){
        int reducirAtaque =0;

        if (enemigo instanceof Trasgo){

            reducirAtaque=-5;
        }
        int dado1 = dado.nextInt(101);
        int dado2 = dado.nextInt(101);

        return Math.max(dado1,dado2)+reducirAtaque;

    }


    @Override
    public String toString() {
        return "Hobbit{" +
                 nombre +
                '}';
    }
}
