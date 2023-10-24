package barajaCartas.Servicios;

import barajaCartas.Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;
    
    //crear el mazo
    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        List<Carta> cartasRepartidas = new ArrayList<>();
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas para repartir.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                cartasRepartidas.add(siguienteCarta());
            }
        }
        return cartasRepartidas;
    }

    public List<Carta> cartasMonton() {
        if (cartas.isEmpty()) {
            System.out.println("No ha salido ninguna carta aún.");
        }
        return cartas;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        List<Carta> cartasRepartidas = baraja.darCartas(5);
        System.out.println("Cartas repartidas:");
        for (Carta carta : cartasRepartidas) {
            System.out.println(carta);
        }

        System.out.println("Cartas en el montón:");
        List<Carta> monton = baraja.cartasMonton();
        if (monton != null) {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());
        System.out.println("Baraja completa:");
        baraja.mostrarBaraja();
    }
}
