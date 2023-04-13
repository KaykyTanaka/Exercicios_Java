/*
 * Exercicio09.java
 * 
 * 9)Escreva um programa em Java
 * para gerar uma matriz quadrada G de dimensão N.
 * Imprimir os elementos da diagonal principal (linha = coluna).
 * 
 * 
 */
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] g = new int[n][n];

        for (int linha = 0; linha < g.length; linha++) {
            for (int coluna = 0; coluna < g[0].length; coluna++) {
                g[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz G:");

        for (int linha = 0; linha < g.length; linha++) {
            for (int coluna = 0; coluna < g[0].length; coluna++) {
                System.out.print("[" + g[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }
        System.out.println("\nDiagonal Principal: ");
        for (int linha = 0; linha < g.length; linha++) {
            for (int coluna = 0; coluna < g[0].length; coluna++) {
                if (linha == coluna) {
                    System.out.print("[" + g[linha][coluna] + "]" + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}