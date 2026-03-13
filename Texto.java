/**
 * Un texto que se puede manipular y se dibuja a sí mismo en el canvas.
 * Se utiliza para los números y símbolos de las cartas.
 */
public class Texto {
    private String texto;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Texto(String texto, int xPosition, int yPosition) {
        this.texto = texto;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = "black";
        this.isVisible = false;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

 private void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            // ¡Aquí está la línea corregida con los 5 parámetros en el orden correcto!
            canvas.drawText(this, color, texto, xPosition, yPosition);
            canvas.wait(10);
        }
    }

    private void erase() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}