package Ejercicio2.Servicios;

import Ejercicio2.Entidades.*;
import java.util.*;

public class JugadoresServicio {

    RevolverDeAguaServicio revServ = new RevolverDeAguaServicio();
    public Scanner obj = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Jugadores> jugadores = new ArrayList();

    //carga la cantidad de jugadores
    public Integer cantJugadores() {
        System.out.println("Ingrese la cantidad de jugadores (1 hasta 6)");
        int cantIngresada = obj.nextInt();
        int cantidadFinal;
        if (cantIngresada < 1 || cantIngresada < 6) {
            cantidadFinal = cantIngresada;
        } else {
            cantidadFinal = 6;
        }
        return cantidadFinal;
    }

    public Jugadores crearJugadores() {

        Jugadores jugador = new Jugadores();
        System.out.println("Ingrese el id del jugador");
        jugador.setId(obj.nextInt());
        System.out.println("Ingrese el nombre del jugador");
        jugador.setNombre(obj.next());
        jugador.setMojado(false);

        return jugador;
    }//cierra crearJugadores

    public boolean disparo() {
        boolean mojado = revServ.mojar();
        revServ.siguienteChorro();
        return mojado;
    }

}//cierra JugadoresServicio
