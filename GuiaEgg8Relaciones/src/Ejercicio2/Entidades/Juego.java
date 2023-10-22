package Ejercicio2.Entidades;

import java.util.ArrayList;

public class Juego {
    
    private ArrayList<Jugadores> jugadoresFinales;
    private RevolverDeAgua revolverFinal;

    public Juego() {
    }

    public Juego(ArrayList<Jugadores> jugadoresFinales, RevolverDeAgua revolverFinal) {
        this.jugadoresFinales = jugadoresFinales;
        this.revolverFinal = revolverFinal;
    }

    public ArrayList<Jugadores> getJugadoresFinales() {
        return jugadoresFinales;
    }

    public void setJugadoresFinales(ArrayList<Jugadores> jugadoresFinales) {
        this.jugadoresFinales = jugadoresFinales;
    }

    public RevolverDeAgua getRevolverFinal() {
        return revolverFinal;
    }

    public void setRevolverFinal(RevolverDeAgua revolverFinal) {
        this.revolverFinal = revolverFinal;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadoresFinales=" + jugadoresFinales + ", revolverFinal=" + revolverFinal + '}';
    }

    
    
}
