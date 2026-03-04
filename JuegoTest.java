import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Juego.
 */
public class JuegoTest {
    /**
     * Prueba una simulacion completa del juego.
     */
    @Test
    public void testSimulacionCompleta() {
        Mazo mazo = new Mazo();
        mazo.barajar();
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Jugador 1"));
        jugadores.add(new Jugador("Jugador 2"));

        assertEquals(52, mazo.contarCartas());

        mazo.repartir(jugadores, 5);
        
        assertEquals(42, mazo.contarCartas());
        
        assertTrue(jugadores.get(0).toString().contains("de"));
        assertTrue(jugadores.get(1).toString().contains("de"));

        Carta devuelta = jugadores.get(0).soltarCarta(0);
        assertNotNull(devuelta);
        
        mazo.agregarCarta(devuelta);
        assertEquals(43, mazo.contarCartas());
    }
}
