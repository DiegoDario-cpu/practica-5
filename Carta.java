/**
 * Representa una carta de juego.
 */
public class Carta {
    /** Valor de la carta: 1 para A, 11-13 para J, Q, K */
    private final int valor;
    /** Palo de la carta */
    private final Palo palo;

    /**
     * Constructor de Carta.
     * @param valor el valor de la carta
     * @param palo el palo de la carta
     */
    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Retorna la representacion de la carta.
     */
    @Override
    public String toString() {
        String nombreValor;
        nombreValor = switch (valor) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(valor);
        };
        return nombreValor + " de " + palo;
    }
}

