/**
 * Clase principal (Main) para probar el funcionamiento del despliegue gráfico.
 * Demuestra la integración de la clase Carta, Posicion y los métodos de clase de Visualizador.
 */
public class Main {
    
    /**
     * Método principal que ejecuta la demostración del programa.
     * * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Figuras de prueba del repositorio base
        Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();
        
        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();

        // 1. Instanciar cartas usando tu clase Carta
        Carta carta1 = new Carta(1, "CORAZONES"); // El As de Corazones
        Carta carta2 = new Carta(13, "PICAS");    // El Rey de Picas
        
        System.out.println("--- Probando el Visualizador Gráfico ---");

        // 2. Llamar al método estático usando la clase Posicion
        Visualizador.carta(carta1, new Posicion(20, 40));
        Visualizador.carta(carta2, new Posicion(100, 40));
        
        System.out.println("Prueba finalizada con éxito.");
    }
}