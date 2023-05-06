/* 
 * Lampada.java
 * 
 * 3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
 * 
 */

public class Lampada {
    private int estado;

    public void acender() {
        this.estado = 1;
    }

    public void apagar() {
        this.estado = 0;
    }

    public void meiaLuz() {
        this.estado = 2;
    }

    public void verificarEstado() {
        if (this.estado == 0) {
            System.out.println("Lampada apagada!");
        } else if (this.estado == 1) {
            System.out.println("Lampada acesa!");
        } else if (this.estado == 2) {
            System.out.println("Lampada em meia-luz!");
        }
    }
}
