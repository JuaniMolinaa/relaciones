package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;
import java.util.*;

public class PersonaServicio {

    public Scanner obj = new Scanner(System.in).useDelimiter("\n");
    public PerroServicio perroServ = new PerroServicio();
    
    
    public Persona crearPersonaConMascota() {
        Persona pers = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        pers.setNombre(obj.next());
        System.out.println("Ingrese el apellido");
        pers.setApellido(obj.next());
        System.out.println("Ingrese el DNI");
        pers.setDNI(obj.nextInt());
        System.out.println("Ingrese la edad");
        pers.setEdad(obj.nextInt());
        System.out.println("Ahora cargue los datos de su mascota");
        Perro mascota = perroServ.crearPerro();
        
        pers.setPerro(mascota);
        return pers;
    }//cierra crearPersona;

}
