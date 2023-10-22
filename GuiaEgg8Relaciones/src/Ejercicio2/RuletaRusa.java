package Ejercicio2;

import Ejercicio2.Entidades.*;
import Ejercicio2.Servicios.*;
import java.util.*;

public class RuletaRusa {

    public static void main(String[] args) {

        RevolverDeAguaServicio rv = new RevolverDeAguaServicio();
        JugadoresServicio jugServ = new JugadoresServicio();
        JuegoServicio juegoServ = new JuegoServicio();
        //Jugadores jugadores = new Jugadores();
        RevolverDeAgua revolverAgua = new RevolverDeAgua();

        ArrayList<Jugadores> listaJugadores = new ArrayList();

        int cantidadJugadores = jugServ.cantJugadores();

        do {
            listaJugadores.add(jugServ.crearJugadores());

        } while (cantidadJugadores != listaJugadores.size());

        rv.llenarRevolver();

        juegoServ.llenarJuego(listaJugadores, revolverAgua);
        juegoServ.ronda();
    }

}
