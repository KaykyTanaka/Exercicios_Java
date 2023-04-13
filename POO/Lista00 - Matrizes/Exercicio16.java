/*
 * Exercicio16.java
 * 
 * 16)Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N. 
 * Imprimir os elementos da abaixo da diagonal principal (inclusa) e
 * abaixo da diagonal secundária (inclusa).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] p = new int[n][n];

        for (int linha = 0; linha < p.length; linha++) {
            for (int coluna = 0; coluna < p[0].length; coluna++) {
                p[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz p:");

        for (int linha = 0; linha < p.length; linha++) {
            for (int coluna = 0; coluna < p[0].length; coluna++) {
                System.out.print("[" + p[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos abaixo da diagonal principal (inclusa):");
        for (int linha = 0; linha < p.length; linha++) {
            for (int coluna = 0; coluna < p[0].length; coluna++) {
                if (linha == coluna || linha > coluna) {
                    System.out.print("[" + p[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Elementos abaixo da diagonal secundária (inclusa): ");
        for (int linha = 0; linha < p.length; linha++) {
            for (int coluna = 0; coluna < p[0].length; coluna++) {
                if (linha + coluna >= (n - 1)) {
                    System.out.print("[" + p[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
