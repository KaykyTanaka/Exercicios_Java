/*
 * Exercicio05.java
 * 
 * 5) Escreva um programa em Java para
 * ler 2 matrizes N x M (definido pelo usuário) e
 * calcular a soma entre elas gerando uma terceira matriz.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int N, M;

        do {
            System.out.print("Digite a quantidade de linhas: ");
            N = leia.nextInt();

            System.out.print("Digite a quantidade de colunas: ");
            M = leia.nextInt();
        } while (N <= 0 || M <= 0);

        int A[][] = new int[N][M];
        int B[][] = new int[N][M];
        int C[][] = new int[N][M];

        for (int linha = 0; linha < A.length; linha++) {
            for (int coluna = 0; coluna < A[linha].length; coluna++) {
                A[linha][coluna] = (int) (Math.random() * 10);
                B[linha][coluna] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz 1: ");
        for (int linha = 0; linha < A.length; linha++) {
            for (int coluna = 0; coluna < A[linha].length; coluna++) {
                System.out.print("[" + A[linha][coluna] + "]\t");
            }
            System.out.println("");
        }

        System.out.println("Matriz 2: ");
        for (int linha = 0; linha < B.length; linha++) {
            for (int coluna = 0; coluna < B[linha].length; coluna++) {
                System.out.print("[" + B[linha][coluna] + "]\t");
            }
            System.out.println("");
        }

        for (int linha = 0; linha < C.length; linha++) {
            for (int coluna = 0; coluna < C[linha].length; coluna++) {
                C[linha][coluna] = A[linha][coluna] + B[linha][coluna];
            }
        }

        System.out.println("Matriz Resultante: ");
        for (int linha = 0; linha < C.length; linha++) {
            for (int coluna = 0; coluna < C[linha].length; coluna++) {
                System.out.print("[" + C[linha][coluna] + "]\t");
            }
            System.out.println("");
        }

    }
}
