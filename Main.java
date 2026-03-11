public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();
        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();


        // 1. Instanciar una carta de tu código anterior [cite: 16]
        Carta carta1 = new Carta(1, "CORAZONES"); // El As de Corazones
        Carta carta2 = new Carta(13, "PICAS");     // El Rey de Espadas
        
        System.out.println("--- Probando el Visualizador Gráfico ---");

        // 2. Llamar al método estático usando la clase Posicion
        Visualizador.carta(carta1, new Posicion(20, 40));
        Visualizador.carta(carta2, new Posicion(100, 40));
        
        System.out.println("Prueba finalizada con éxito.");
    }

    
}
