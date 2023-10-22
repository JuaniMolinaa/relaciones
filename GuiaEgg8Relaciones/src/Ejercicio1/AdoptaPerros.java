package Ejercicio1;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;
import Ejercicio1.Servicios.PerroServicio;
import Ejercicio1.Servicios.PersonaServicio;
import java.util.*;

public class AdoptaPerros {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in).useDelimiter("\n");
        PerroServicio perroServ = new PerroServicio();
        PersonaServicio personServ = new PersonaServicio();
        ArrayList<Persona> listPersonayPerro = new ArrayList();

        listPersonayPerro.add(personServ.crearPersonaConMascota());
        System.out.println("\nAhora cargue los datos de la segunda persona:\n");
        listPersonayPerro.add(personServ.crearPersonaConMascota());

        for (Persona aux : listPersonayPerro) {
            System.out.println(aux.toString());
        }

    }

}
