/*
 * Exercicio08.java
 * 
 * 8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
 * Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
 * horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
 * iniciar em um dia e terminar no dia seguinte.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int inicio, fim, duracao;

        System.out.print("Insira o horario de inicio da partida: ");
        inicio = leia.nextInt();

        System.out.print("Insira o horario do termino da partida: ");
        fim = leia.nextInt();

        duracao = fim - inicio;
        if (duracao <= 0) {
            duracao = duracao + 24;
        }

        System.out.println("A partida durou: " + duracao + "h");
    }
}
