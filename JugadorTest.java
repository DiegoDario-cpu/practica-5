import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Jugador.
 */
public class JugadorTest {
    /**
     * Prueba que el jugador puede recibir una carta.
     */
    @Test
    public void testRecibirCarta() {
        Jugador jugador = new Jugador("Dario");
        Carta carta = new Carta(5, Palo.CORAZONES);
        
        jugador.recibirCarta(carta);
        
        assertTrue(jugador.toString().contains("Dario"));
        assertTrue(jugador.toString().contains("5 de CORAZONES"));
    }

    /**
     * Prueba que el jugador puede soltar cartas.
     */
    @Test
    public void testSoltarCarta() {
        Jugador jugador = new Jugador("Miguel");
        Carta carta1 = new Carta(10, Palo.DIAMANTES);
        Carta carta2 = new Carta(7, Palo.TREBOLES);
        
        jugador.recibirCarta(carta1);
        jugador.recibirCarta(carta2);
        
        Carta cartaSoltada = jugador.soltarCarta(0);
        assertNotNull(cartaSoltada);
        assertEquals("10 de DIAMANTES", cartaSoltada.toString());
        
        Carta cartaSoltada2 = jugador.soltarCarta(0);
        assertEquals("7 de TREBOLES", cartaSoltada2.toString());
        
        Carta nula = jugador.soltarCarta(5);
        assertNull(nula);
    }

    /**
     * Prueba el metodo toString del Jugador.
     */
    @Test
    public void testToString() {
        Jugador jugador = new Jugador("Mike");
        String resultado = jugador.toString();
        
        assertTrue(resultado.contains("Mike"));
        assertTrue(resultado.contains("Jugador"));
        assertTrue(resultado.contains("Mano"));
    }
}
