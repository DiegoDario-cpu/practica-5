import java.util.ArrayList;

/**
 * Clase principal que ejecuta el juego.
 */
public class Juego {
    /**
     * Metodo principal que ejecuta el juego.
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
       
        Mazo mazo = new Mazo();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Ana"));
        jugadores.add(new Jugador("Beto"));

        System.out.println("--- Iniciando Juego ---");
        
       
        mazo.barajar();
        System.out.println("Mazo barajado con " + mazo.contarCartas() + " cartas.");

       
        int cartasARepartir = 5;
        mazo.repartir(jugadores, cartasARepartir);
        
        for (Jugador j : jugadores) {
            System.out.println(j);
        }

        
        System.out.println("\n--- Gestión de mazo ---");
        Carta cartaDevuelta = jugadores.get(0).soltarCarta(0);
        if (cartaDevuelta != null) {
            System.out.println("Ana regresa al mazo: " + cartaDevuelta);
            mazo.agregarCarta(cartaDevuelta);
        }

        System.out.println("Estado final del mazo: " + mazo.contarCartas() + " cartas restantes.");
    }
}