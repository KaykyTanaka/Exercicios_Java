/*
 * Exercicio19.java
 * 
 * 19)Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
 * Imprimir os elementos da “asa da borboleta”.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] s = new int[n][n];

        for (int linha = 0; linha < s.length; linha++) {
            for (int coluna = 0; coluna < s[0].length; coluna++) {
                s[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz S:");

        for (int linha = 0; linha < s.length; linha++) {
            for (int coluna = 0; coluna < s[0].length; coluna++) {
                System.out.print("[" + s[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos da 'Asa da borboleta': ");

        for (int linha = 0; linha < s.length; linha++) {
            for (int coluna = 0; coluna < s[0].length; coluna++) {
                if (linha >= coluna && linha + coluna <= (n - 1) || linha <= coluna && linha + coluna >= (n - 1)) {
                    System.out.print("[" + s[linha][coluna] + "]\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
