package Ejercicio2.Servicios;

import Ejercicio2.Entidades.*;
import java.util.*;
import Ejercicio2.Servicios.*;

public class JuegoServicio {

    public RevolverDeAguaServicio ras = new RevolverDeAguaServicio();
    public Juego juegoFinal = new Juego();
    public RevolverDeAgua revolver = new RevolverDeAgua();
    public JugadoresServicio js = new JugadoresServicio();

    //JugadoresServicio jugadores = new JugadoresServicio();
    public Juego llenarJuego(ArrayList<Jugadores> jugadores, RevolverDeAgua r) {
        juegoFinal.setJugadoresFinales(jugadores);
        juegoFinal.setRevolverFinal(r);
        return juegoFinal;
    }

    public void ronda() {
        boolean seMojo = false;

        do {
            for (int i = 0; i < juegoFinal.getJugadoresFinales().size(); i++) {
                System.out.println(juegoFinal.getRevolverFinal());
                System.out.println("Se dispara el jugador " + juegoFinal.getJugadoresFinales().toString());
                seMojo = js.disparo();

                if (seMojo == true) {
                    juegoFinal.getJugadoresFinales().get(i).setMojado(true);
                    System.out.println("El jugador mojado es el jugador " + juegoFinal.getJugadoresFinales().get(i).getNombre());
                    break;
                }
            }
        } while (seMojo == false);
    }//cierra ronda

}//cierra juegoServicio
