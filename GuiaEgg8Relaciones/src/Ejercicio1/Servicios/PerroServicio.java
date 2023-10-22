/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Perro;
import java.util.*;

/**
 *
 * @author usuario
 */
public class PerroServicio {

    public Scanner obj = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(obj.next());
        System.out.println("Ingrese la raza del perro");
        perro.setRaza(obj.next());
        System.out.println("Ingrese la edad del perro");
        perro.setEdad(obj.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        perro.setTamanio(obj.next());
        return perro;
    }//cierra crearPerro;
    
}
