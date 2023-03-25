/*
* Exercicio31.java
* 
* 31)Escreva um programa em Java para gerar uma matriz (N x M).
* O usuário deve informar uma faixa de valores inteiros positivos (valor inicial e valor final).
* O programa deve gerar aleatoriamente os elementos da matriz, respeitando a
* faixa de valores fornecida pelo usuário. Ao final, imprimir a matriz
* resultante.
*
*
*/

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = leia.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = leia.nextInt();

        int matriz[][] = new int[(int) (Math.random() * 10) + 1][(int) (Math.random() * 10) + 1];

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (fim - inicio) + inicio);
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println();
        }

    }
}
