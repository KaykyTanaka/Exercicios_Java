/*
 * Exercicio32.java
 * 
 * 32) Escreva um programa em Java para gerar uma matriz (N x M). 
 * A matriz deve ser criada com a seguinte dimensão ((N+1) x (M+1)). 
 * Para cada linha imprimir a soma na casa final. 
 * Repetir o processo para coluna. 
 * Na posição ((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (linha = coluna).
 *
 *
 */

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int n = leia.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int m = leia.nextInt();

        int matriz[][] = new int[n][m];

        int somaDiagonal = 0;
        int somaLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        System.out.println("\nMatriz gerada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int matrizSoma[][] = new int[n + 1][m + 1];

        for (int i = 0; i < matriz.length; i++) {
            somaLinha = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                matrizSoma[i][j] = matriz[i][j];
                somaLinha += matriz[i][j];
            }
            matrizSoma[i][m] = somaLinha;
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }
            matrizSoma[n][j] = somaColuna;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        matrizSoma[n][m] = somaDiagonal;

        System.out.println("\nMatriz com as somas das linhas, colunas e diagonal principal:");
        for (int i = 0; i < matriz.length + 1; i++) {
            for (int j = 0; j < matriz[0].length + 1; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

    }
}