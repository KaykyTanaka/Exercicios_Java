/*
* Exercicio20.java
* 
* 20)Escreva um programa em Java para gerar uma matriz quadrada T de dimensão N.
* Imprimir os elementos da “ampulheta”.
* 
* 
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz quadrada: ");
        int n = leia.nextInt();

        int[][] t = new int[n][n];

        for (int linha = 0; linha < t.length; linha++) {
            for (int coluna = 0; coluna < t[0].length; coluna++) {
                t[linha][coluna] = (int) (Math.random() * 100 + 1);
            }
        }

        System.out.println("Matriz T:");

        for (int linha = 0; linha < t.length; linha++) {
            for (int coluna = 0; coluna < t[0].length; coluna++) {
                System.out.print("[" + t[linha][coluna] + "]" + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos da 'Ampulheta': ");

        for (int linha = 0; linha < t.length; linha++) {
            for (int coluna = 0; coluna < t[0].length; coluna++) {
                if (linha <= coluna && linha + coluna <= t.length - 1 || linha >= coluna && linha + coluna >= t.length - 1) {
                    System.out.print("[" + t[linha][coluna] + "]\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}