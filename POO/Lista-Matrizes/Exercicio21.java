/*
* Exercicio21.java
* 
* 21)Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). 
* Gerar uma terceira matriz (N x (M+P)), 
* sendo que para cada linha concatenar suas respectivas colunas e apresentar as três matrizes.
* 
* 
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n, m, p, coluna = 0;

        System.out.print("Digite a dimensão N: ");
        n = leia.nextInt();

        System.out.print("Digite a dimensão M: ");
        m = leia.nextInt();

        System.out.print("Digite a dimensão P: ");
        p = leia.nextInt();

        int matriz1[][] = new int[n][m];
        int matriz2[][] = new int[n][p];
        int matriz3[][] = new int[n][(m + p)];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print("[" + matriz1[i][j] + "]\t");
            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print("[" + matriz2[i][j] + "]\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz3.length; i++) {
            coluna = 0;
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][coluna] = matriz1[i][j];
                coluna++;
            }

            for (int j = 0; j < matriz2[i].length; j++) {
                matriz3[i][coluna] = matriz2[i][j];
                coluna++;
            }
        }

        System.out.println("Matriz 3: ");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                System.out.print("[" + matriz3[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}