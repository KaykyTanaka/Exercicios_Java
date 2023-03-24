/*
 * Exercicio06.java
 * 
 * 6) Escreva um programa em Java para gerar aleatoriamente (menor que 25) uma matriz
 * N x M de dimensão definidas pelo usuário. Solicitar ao usuário
 * um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
 * matriz, indicando a posição (linha X coluna) e no final a quantidade de
 * ocorrências.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = (int) (Math.random() * 25);
        int m = (int) (Math.random() * 25);

        int matriz[][] = new int[n][m];

        System.out.print("Digite um numero: ");
        int num = leia.nextInt();
        int cont = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Matriz: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("\t[" + matriz[linha][coluna] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == num) {
                    System.out.print("Linha: " + (linha + 1) + "\nColuna: " + (coluna + 1) + "\n\n");
                    cont++;
                }
            }
        }
        System.out.println("quantidade de ocorrencias do numero " + num + " e de: " + cont);

    }
}
