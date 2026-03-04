import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Carta.
 */
public class CartaTest {
    /**
     * Prueba el metodo toString de Carta.
     */
    @Test
    public void testToString() {
        Carta carta1 = new Carta(1, Palo.CORAZONES);
        assertEquals("A de CORAZONES", carta1.toString());
        
        Carta carta2 = new Carta(11, Palo.DIAMANTES);
        assertEquals("J de DIAMANTES", carta2.toString());
        
        Carta carta3 = new Carta(12, Palo.TREBOLES);
        assertEquals("Q de TREBOLES", carta3.toString());
        
        Carta carta4 = new Carta(13, Palo.PICAS);
        assertEquals("K de PICAS", carta4.toString());
        
        Carta carta5 = new Carta(5, Palo.CORAZONES);
        assertEquals("5 de CORAZONES", carta5.toString());
    }
}
