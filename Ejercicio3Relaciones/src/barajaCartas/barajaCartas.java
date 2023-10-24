package barajaCartas;

import barajaCartas.Servicios.Baraja;
import barajaCartas.Entidades.Carta;
import java.util.List;

public class barajaCartas {

    /**
     * @param args the command line arguments
     */
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
