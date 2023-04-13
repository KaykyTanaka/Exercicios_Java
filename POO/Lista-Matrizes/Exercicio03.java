/*
 * Exercicio03.java
 * 
 * 3) Escreva um programa em Java para
 * ler uma matriz C quadrada de dimensão N,
 * onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
 * número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
 * aleatoriamente (menor que 100).
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int N = 0;
		int aux;
		int elementos = 0;
		do {
			System.out.print("Digite a dimensão de uma matriz quadrada: ");
			N = leia.nextInt();

			if (Math.sqrt(N) == Math.floor(Math.sqrt(N))) {
				aux = 0;
				elementos = (int) Math.sqrt(N);
			} else {
				System.out.println("Digite um valor valido para a dimensao de uma matriz quadrada!\n");
				aux = 1;
			}

		} while (aux != 0);

		int C[][] = new int[elementos][elementos];

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				C[i][j] = (int) (Math.random() * 100);
			}
		}

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				System.out.print("[" + C[i][j] + "]\t");
			}
			System.out.println("");
		}
	}
}
