package com.tokioSchool.senorDeLosAnillos;

import com.tokioSchool.senorDeLosAnillos.Bestias.Bestia;
import com.tokioSchool.senorDeLosAnillos.Heroes.Heroe;
import com.tokioSchool.senorDeLosAnillos.components.Consola;
import com.tokioSchool.senorDeLosAnillos.util.Imagenes;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CampoDeBatalla  {



    public void batalla (List < Heroe > heroes, List < Bestia > bestias, AppView appView) throws FileNotFoundException {

        PrintWriter escritura = new PrintWriter("textos.txt");

        int con = 1;

            while (!heroes.isEmpty() && !bestias.isEmpty()) {

                int[] longitudes = {heroes.size(), bestias.size()};
                Arrays.sort(longitudes);
                int lon = longitudes[0];

                escritura.println("                             Turno " + con );
                System.out.println("TURNO " + con);

                con++;


                for (int i = 0; i < lon; i++) {

                    System.out.println("-----Lucha entre " + heroes.get(i).toString() + " y " + bestias.get(i).toString());
                    escritura.println("-----Lucha entre " + heroes.get(i).toString() + " y " + bestias.get(i).toString());

                    //TODO ATAQUE HEROES

                    if (!bestias.isEmpty()) {
                        int ataqueHer = heroes.get(i).atacar(bestias.get(i));
                        int defensaBestia= bestias.get(i).defender(heroes.get(i));
                        if (ataqueHer > defensaBestia) {
                            int golpe = ataqueHer - defensaBestia;

                            int dano = bestias.get(i).getPuntosVida() - golpe;
                            bestias.get(i).setPuntosVida(dano);
                            System.out.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita " + golpe + " a " + bestias.get(i).getNombre());
                            escritura.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita " + golpe + " a " + bestias.get(i).getNombre());

                        } else {
                            System.out.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita 0 punto de vida a " + bestias.get(i).getNombre());
                            escritura.println(heroes.get(i).getNombre() + " ataco con " + ataqueHer + " le quita 0 punto de vida a " + bestias.get(i).getNombre());

                        }

                        //TODO ATAQUE BESTIAS

                        int ataqueBes = bestias.get(i).atacar(heroes.get(i));
                        int defensaHeroe = heroes.get(i).defender(bestias.get(i)) ;
                        if (ataqueBes > defensaHeroe) {
                            int golpe = ataqueBes - defensaHeroe;

                            int dano = heroes.get(i).getPuntosVida() - golpe;
                            heroes.get(i).setPuntosVida(dano);
                            System.out.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita " + golpe + " a " + heroes.get(i).getNombre());
                            escritura.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita " + golpe + " a " + heroes.get(i).getNombre());

                        } else {
                            System.out.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita 0 punto de vida a " + heroes.get(i).getNombre());
                            escritura.println(bestias.get(i).getNombre() + " ataco con " + ataqueBes + " le quita 0 punto de vida a " + heroes.get(i).getNombre());

                        }
                        if (bestias.get(i).getPuntosVida() <= 0) {
                            System.out.println(bestias.get(i).getNombre() + " ha muerto!!");
                            escritura.println(bestias.get(i).getNombre() + " ha muerto!!");

                            break;

                        }

                        if (heroes.get(i).getPuntosVida() <= 0) {
                            System.out.println(heroes.get(i).getNombre() + " ha muerto!!");
                            escritura.println(heroes.get(i).getNombre() + " ha muerto!!");

                            break;
                        }
                    }
                }

                bestias.removeIf(b -> b.getPuntosVida() <= 0);
                heroes.removeIf(h -> h.getPuntosVida() <= 0);
            }
            if (bestias.isEmpty()) {

                escritura.println("LOS HEROES GANAN!!");
                escritura.close();
                System.out.println(("LOS HEROES GANAN!!"));
                appView.vboxDatos.etiquetasBestias.title.setGraphic(Imagenes.getImagen("orco-64"));
                String nuevo="";
                try {
                    BufferedReader lectura = new BufferedReader(new FileReader("textos.txt"));
                    String linea;
                    while((linea= lectura.readLine())!= null){
                        nuevo = nuevo + linea+ "\n";
                        appView.vboxTexto.consola.setText(nuevo);


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            } else {
                escritura.println("LAS BESTIAS GANAN!!");
                escritura.close();
                System.out.println(("LAS BESTIAS GANAN!!"));
                appView.vboxDatos.etiquetasHeroes.title.setGraphic(Imagenes.getImagen("frodo"));
                String nuevo="";
                try {
                    BufferedReader lectura = new BufferedReader(new FileReader("textos.txt"));
                    String linea;
                    while((linea= lectura.readLine())!= null){
                        nuevo = nuevo + linea+ "\n";
                        appView.vboxTexto.consola.setText(nuevo);


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
            escritura.close();
        }

}












