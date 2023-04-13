/*
 * Exercicio18.java
 * 
 * 18)Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N. 
 * Imprimir os elementos da acima da diagonal principal (inclusa) e
 * acima da diagonal secundária (inclusa).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] r = new int[n][n];

        for (int linha = 0; linha < r.length; linha++) {
            for (int coluna = 0; coluna < r[0].length; coluna++) {
                r[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz r:");

        for (int linha = 0; linha < r.length; linha++) {
            for (int coluna = 0; coluna < r[0].length; coluna++) {
                System.out.print("[" + r[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos acima da diagonal principal (inclusa):");
        for (int linha = 0; linha < r.length; linha++) {
            for (int coluna = 0; coluna < r[0].length; coluna++) {
                if (linha == coluna || linha <= coluna) {
                    System.out.print("[" + r[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Elementos acima da diagonal secundária (inclusa): ");
        for (int linha = 0; linha < r.length; linha++) {
            for (int coluna = 0; coluna < r[0].length; coluna++) {
                if (linha + coluna <= (n - 1)) {
                    System.out.print("[" + r[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
