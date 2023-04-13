/*
 * Exercicio13.java
 * 
 * 13) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
 * Imprimir os elementos da abaixo da diagonal secundária (exclusa)).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] k = new int[n][n];

        for (int linha = 0; linha < k.length; linha++) {
            for (int coluna = 0; coluna < k[0].length; coluna++) {
                k[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz K:");

        for (int linha = 0; linha < k.length; linha++) {
            for (int coluna = 0; coluna < k[0].length; coluna++) {
                System.out.print("[" + k[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("Elementos abaixo da diagonal secundária (exclusa): ");
        for (int linha = 0; linha < k.length; linha++) {
            for (int coluna = 0; coluna < k[0].length; coluna++) {
                if (linha + coluna > (n - 1)) {
                    System.out.print("[" + k[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
