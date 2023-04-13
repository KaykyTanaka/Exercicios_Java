/*
 * Exercicio12.java
 * 
 * 12)Escreva um programa em Java para gerar uma matriz quadrada L de dimensão N. 
 * Imprimir os elementos da acima da diagonal principal (exclusa).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] l = new int[n][n];

        for (int linha = 0; linha < l.length; linha++) {
            for (int coluna = 0; coluna < l[0].length; coluna++) {
                l[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz l:");

        for (int linha = 0; linha < l.length; linha++) {
            for (int coluna = 0; coluna < l[0].length; coluna++) {
                System.out.print("[" + l[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("Elementos acima da diagonal principal (exclusa): ");
        for (int linha = 0; linha < l.length; linha++) {
            for (int coluna = 0; coluna < l[0].length; coluna++) {
                if (linha < coluna) {
                    System.out.print("[" + l[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }

    }
}
