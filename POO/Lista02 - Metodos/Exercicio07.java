/*
 * 
 * Exercicio07.java
 * 
 * 7) [POO-012]Crie um programa que pergunte ao usuário se ele dese ja lançar/jogar um dado.
 * Por meio de um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. 
 * O programa deve ser executado enquanto o usuário quiser continuar jogando o dado .
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char opc;

        do {
            System.out.print("Jogar o dado[s/n]: ");
            opc = leia.next().toLowerCase().charAt(0);
            if (opc == 's') {
                System.out.println("Saiu: " + dado());
            }
        } while (opc == 's');

    }

    static int dado() {
        return (int) (Math.random() * 6) + 1;
    }
}
