package Ejercicio2.Servicios;

import Ejercicio2.Entidades.RevolverDeAgua;

public class RevolverDeAguaServicio {

    public RevolverDeAgua revolver = new RevolverDeAgua();

    //carga la posicion del agua y la posicion actual del revolver
    public void llenarRevolver() {

        revolver.setPosActual((int) (Math.random() * 10 + 1));
        revolver.setPosAgua((int) (Math.random() * 10 + 1));

        System.out.println("pos actual: " + revolver.getPosActual());
        System.out.println("pos agua: " + revolver.getPosAgua());
    }//cierra llenarRevolver

    //busca en la posicion actual y devuelve true si coincide con la del agua
    public boolean mojar() {
        boolean mojado = false;
        if (revolver.getPosActual().equals(revolver.getPosAgua())) {
            mojado = true;
        } else {
            mojado = false;
        }
        return mojado;
    }

    //avanza hacia la siguiente posicion
    public void siguienteChorro() {

        if (revolver.getPosActual() == 10) {
            revolver.setPosActual(1);

        } else {
            revolver.setPosActual(revolver.getPosActual() + 1);
        }
    }//cierra siguienteChorro

}//cierra clase RevolverDeAguaServicio

