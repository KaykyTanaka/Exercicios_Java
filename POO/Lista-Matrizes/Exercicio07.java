/*
 * Exercicio07.java
 * 
 * 7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, 
 * determinar e imprimir o maior e o menor elemento deste conjunto, informando a posição
 * dos mesmos.
 * 
 * 
 */

public class Exercicio07 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int m = (int) (Math.random() * 10 + 1);
        int menor = 100;
        int maior = 0;

        int e[][] = new int[n][m];

        for (int linha = 0; linha < e.length; linha++) {
            for (int coluna = 0; coluna < e[linha].length; coluna++) {
                e[linha][coluna] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz: ");
        for (int linha = 0; linha < e.length; linha++) {
            for (int coluna = 0; coluna < e[linha].length; coluna++) {
                System.out.print("\t[" + e[linha][coluna] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int linha = 0; linha < e.length; linha++) {
            for (int coluna = 0; coluna < e[linha].length; coluna++) {
                if (e[linha][coluna] >= maior) {
                    maior = e[linha][coluna];
                }
                if (e[linha][coluna] <= menor) {
                    menor = e[linha][coluna];
                }
            }
        }

        System.out.println("O maior numero é: " + maior);
        for (int linha = 0; linha < e.length; linha++) {
            for (int coluna = 0; coluna < e[linha].length; coluna++) {
                if (e[linha][coluna] == maior) {
                    System.out.print("Linha: " + linha + "\nColuna: " + coluna);
                }
            }
        }

        System.out.println("\n\nO menor numero é: " + menor);
        for (int linha = 0; linha < e.length; linha++) {
            for (int coluna = 0; coluna < e[linha].length; coluna++) {
                if (e[linha][coluna] == menor) {
                    System.out.print("Linha: " + linha + "\nColuna: " + coluna);
                }
            }
        }

    }
}