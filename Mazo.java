import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Representa un mazo de cartas.
 */
public final class Mazo {
    /** Pila de cartas del mazo */
    private final Stack<Carta> cartas;

    /**
     * Constructor del Mazo que inicializa 52 cartas.
     */
    public Mazo() {
        this.cartas = new Stack<>();
        restablecerMazo();
    }

    /**
     * Restablece el mazo a 52 cartas.
     */
    public void restablecerMazo() {
        cartas.clear();
        for (Palo p : Palo.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.push(new Carta(i, p));
            }
        }
    }

    /**
     * Baraja el mazo.
     */
    public void barajar() {
        Collections.shuffle(cartas);
    }

    /**
     * Reparte cartas a los jugadores.
     * @param jugadores lista de jugadores
     * @param cartasPorJugador cantidad de cartas por jugador
     */
    public void repartir(ArrayList<Jugador> jugadores, int cartasPorJugador) {
        for (int i = 0; i < cartasPorJugador; i++) {
            for (Jugador jugador : jugadores) {
                if (!cartas.isEmpty()) {
                    jugador.recibirCarta(cartas.pop());
                }
            }
        }
    }

    /**
     * Quita una carta del mazo.
     * @return la carta quitada o null si el mazo esta vacio
     */
    public Carta quitarCarta() {
        return cartas.isEmpty() ? null : cartas.pop();
    }

    /**
     * Agrega una carta al mazo.
     * @param carta la carta a agregar
     */
    public void agregarCarta(Carta carta) {
        cartas.push(carta);
    }

    /**
     * Retorna la cantidad de cartas en el mazo.
     * @return cantidad de cartas
     */
    public int contarCartas() {
        return cartas.size();
    }
}
