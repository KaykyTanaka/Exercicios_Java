/* 
 * UsaLampada.java
 * 
 * 3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
 * 
 */

public class UsaLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.acender();
        lamp.verificarEstado();

        lamp.meiaLuz();
        lamp.verificarEstado();

        lamp.apagar();
        lamp.verificarEstado();
    }
}
