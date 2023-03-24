/*
 * Exercicio17.java
 * 
 * 17)Escreva um programa em Java para gerar uma matriz quadrada Q de dimensão N.
 * Imprimir os elementos da acima da diagonal principal (inclusa) e abaixo da diagonal
 * secundária (inclusa).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] q = new int[n][n];

        for (int linha = 0; linha < q.length; linha++) {
            for (int coluna = 0; coluna < q[0].length; coluna++) {
                q[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz q:");

        for (int linha = 0; linha < q.length; linha++) {
            for (int coluna = 0; coluna < q[0].length; coluna++) {
                System.out.print("[" + q[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos acima da diagonal principal (inclusa):");
        for (int linha = 0; linha < q.length; linha++) {
            for (int coluna = 0; coluna < q[0].length; coluna++) {
                if (linha == coluna || linha <= coluna) {
                    System.out.print("[" + q[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Elementos abaixo da diagonal secundária (inclusa): ");
        for (int linha = 0; linha < q.length; linha++) {
            for (int coluna = 0; coluna < q[0].length; coluna++) {
                if (linha + coluna >= (n - 1)) {
                    System.out.print("[" + q[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
