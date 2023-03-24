/*
 * Exercicio10.java
 * 
 * 10)Escreva um programa em Java para gerar uma matriz quadrada H 
 * de dimensão N. Imprimir os elementos da diagonal secundária (linha + coluna = dimensão + 1)
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] h = new int[n][n];

        // Preenchendo a matriz G com valores aleatórios
        for (int linha = 0; linha < h.length; linha++) {
            for (int coluna = 0; coluna < h[0].length; coluna++) {
                h[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz H:");

        for (int linha = 0; linha < h.length; linha++) {
            for (int coluna = 0; coluna < h[0].length; coluna++) {
                System.out.print("[" + h[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }
        System.out.println("\nDiagonal Secundaria: ");
        for (int linha = 0; linha < h.length; linha++) {
            for (int coluna = 0; coluna < h[0].length; coluna++) {
                if (linha + coluna == (n - 1)) {
                    System.out.print("[" + h[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}