/*
 * UsaLampada.java
 * 
 * 1) Criar uma classe para representar uma lâmpada vendida em um supermercado. 
 * Além de marca, modelo e tipo, esta deve conter um atributo que indique 
 * um dos dois possíveis estados da lâmpada (acesa ou apagada).
 * 
 */

import java.util.Scanner;

public class UsaLampada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Lampada lamp = new Lampada();

        System.out.print("Digite a marca da lamapada: ");
        lamp.setMarca(leia.nextLine());
        System.out.print("Digite o modelo: ");
        lamp.setModelo(leia.nextLine());
        System.out.print("Digite o tipo: ");
        lamp.setTipo(leia.nextLine());
        int x = (int) (Math.random() * 2);
        if (x == 1) {
            lamp.setEstado(true);
        } else {
            lamp.setEstado(false);
        }

        System.out.println("\nMarca: " + lamp.getMarca() + "\nModelo: " + lamp.getModelo() + "\nTipo: " + lamp.getTipo()
                + "\nEsta ligada? " + lamp.getEstado());

    }
}