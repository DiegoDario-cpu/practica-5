import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Pruebas unitarias para la clase Mazo.
 */
public class MazoTest {
    /** Instancia del mazo para pruebas */
    private Mazo mazo;
    
    /**
     * Inicializa el mazo antes de cada prueba.
     */
    @Before
    public void setUp() {
        mazo = new Mazo();
    }
    
    /**
     * Prueba agregar cartas al mazo.
     */
    @Test
    public void testAgregarCarta() {
        mazo = new Mazo();
        int cartasIniciales = mazo.contarCartas();
        
        Carta carta = new Carta(5, Palo.CORAZONES);
        mazo.agregarCarta(carta);
        
        assertEquals(cartasIniciales + 1, mazo.contarCartas());
    }

    /**
     * Prueba barajar el mazo.
     */
    @Test
    public void testBarajar() {
        Mazo mazo1 = new Mazo();
        Mazo mazo2 = new Mazo();
        
        mazo1.barajar();
        
        assertEquals(52, mazo1.contarCartas());
        assertEquals(52, mazo2.contarCartas());
    }

    /**
     * Prueba contar las cartas del mazo.
     */
    @Test
    public void testContarCartas() {
        assertEquals(52, mazo.contarCartas());
        
        mazo.quitarCarta();
        assertEquals(51, mazo.contarCartas());
        
        mazo.quitarCarta();
        assertEquals(50, mazo.contarCartas());
    }

    /**
     * Prueba quitar cartas del mazo.
     */
    @Test
    public void testQuitarCarta() {
        assertEquals(52, mazo.contarCartas());
        
        Carta carta1 = mazo.quitarCarta();
        assertNotNull(carta1);
        assertEquals(51, mazo.contarCartas());
        
        Carta carta2 = mazo.quitarCarta();
        assertNotNull(carta2);
        assertEquals(50, mazo.contarCartas());
        
        while (mazo.contarCartas() > 0) {
            mazo.quitarCarta();
        }
        
        Carta cartaVacia = mazo.quitarCarta();
        assertNull(cartaVacia);
    }

    /**
     * Prueba repartir cartas a jugadores.
     */
    @Test
    public void testRepartir() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");
        Jugador j3 = new Jugador("Jugador 3");
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        
        mazo.repartir(jugadores, 5);
        
        assertEquals(37, mazo.contarCartas());
        
        assertTrue(j1.toString().contains("de"));
        assertTrue(j2.toString().contains("de"));
        assertTrue(j3.toString().contains("de"));
    }

    /**
     * Prueba restablecer el mazo.
     */
    @Test
    public void testRestablecerMazo() {
        mazo.quitarCarta();
        mazo.quitarCarta();
        assertEquals(50, mazo.contarCartas());
        
        mazo.restablecerMazo();
        assertEquals(52, mazo.contarCartas());
    }
}
