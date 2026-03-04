import java.util.ArrayList;

/**
 * Representa un jugador en el juego.
 */
public class Jugador {
    /** Nombre del jugador */
    public String nombre;
    /** Cartas en la mano del jugador */
    private final ArrayList<Carta> mano;

    /**
     * Constructor del Jugador.
     * @param nombre el nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    /**
     * Recibe una carta en la mano del jugador.
     * @param carta la carta a recibir
     */
    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    /**
     * Suelta una carta de la mano del jugador.
     * @param indice el indice de la carta
     * @return la carta soltada o null si el indice es invalido
     */
    public Carta soltarCarta(int indice) {
        if (indice >= 0 && indice < mano.size()) {
            return mano.remove(indice);
        }
        return null;
    }

    /**
     * Retorna la informacion del jugador y sus cartas.
     */
    @Override
    public String toString() {
        return "Jugador: " + nombre + " | Mano: " + mano;
    }
}