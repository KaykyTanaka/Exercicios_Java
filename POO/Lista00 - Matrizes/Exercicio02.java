/*
 * Exercicio02.java
 * 
 * 2) Escreva um programa em Java para
 * geral aleatoriamente os elementos
 * (menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
 * gerada e imprimir a matriz em ordem invertida.
 * 
 * 
 */

public class Exercicio02 {

	public static void main(String[] args) {

		int matriz[][] = new int[6][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}

		}

		System.out.println("Matriz Gerada: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]\t");
			}
			System.out.println();
		}
		System.out.println("\nMatriz Invertida: ");
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int j = matriz[i].length - 1; j >= 0; j--) {
				System.out.print("[" + matriz[i][j] + "]\t");
			}
			System.out.println();
		}
	}
}
